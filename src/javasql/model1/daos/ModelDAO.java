package javasql.model1.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javasql.model1.model.MemberDTO;



public class ModelDAO {
/*
 * 외부에 Instance 를 제공하는 메서드와 기타, SQL 을 처리하는 메서드만
 * 제외 하고는 모두 private 으로 처리한다.
 */
	private  Connection conn;
	
	private static ModelDAO dao = new ModelDAO();
	
	private ModelDAO() {
	}
	
	private Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:" + "@localhost:1521/xe",	"c##beautea37", "123");
			System.out.println("컨넥션 OK..정보 --> " + conn);
		}catch (Exception e) {
			System.out.println("Connection 생성시 예외 발생함.");
			System.out.println("예외 내용 : " + e.getMessage());
		}
		return conn;
	}
	public static ModelDAO getInstance() {
		return dao;
	}
	/*
	 * 모든 사용자 정보를 리턴하는 메서드 정의합니다.
	 * 이 메서드는 모든 사용자 정보이기 때문에 따로 파라미터는 받지 않고
	 * Select * from Users; 로 조회 SQL 을 날립니다.
	 * 이때 리턴되어지는 모든 Row 는 각 1 : 1 로 MemberDTO 에담고
	 * 이 담겨진 DTO 객체들은 ArrayList 에 담아서 전달을 하게됩니다.
	 * 이걸 받은 ShowAllMember 클래스는 받은 정보를 모두 출력하게 되어집니다.
	 * 연결고리를 잘 파악하세요.!!!
	 */
	public List<MemberDTO> getAllMember(){
		List<MemberDTO> members = Collections.EMPTY_LIST;
		MemberDTO dto = null;
		String sql = "Select * from Users";
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		Connection cn = getConnection();
		try {
			pstmt = cn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			//데이터가 존재한다면..
			if(rs.next()) {//if 절로 커서를 Data 테이블로 내리고.
				//DTO 가 담겨질 ArrayList 생성합니다.
				members = new ArrayList<MemberDTO>();
				do {
					//여기서부터 첫번째 Row 데이터를 get 합니다.
					//하나의 ROW 는 하나의 DTO 에 Mapping 되기에 여기서
					//DTO 객체를 생성해서 setter 를 호출하여 DTO를 완성시킵니다.
					dto = new MemberDTO();
					dto.setReg_Date(rs.getDate("reg_date"));
					dto.setUserAge(rs.getInt("userage"));
					dto.setUserEmail(rs.getString("useremail"));
					dto.setUserId(rs.getString("userid"));
					dto.setUserName(rs.getString("username"));
					dto.setUserPassword(rs.getString("userpassword"));
					
					//dto 의 값이 모두 완료되면, memebers에 담습니다
					members.add(dto);
				} while (rs.next());
			}
			
			rs.close();
			pstmt.close();
			cn.close();
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		return members;
	}
 	
	
	public boolean checkPassword(String id, String password) {
		String sql = "Select userpassword from Users where userid = ?";
		boolean result = false;
		
		Connection conn = getConnection();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				do {
					String dbPass = rs.getString("userPassword");
					//사용자가 입력한 값과 비교 합니다.
					if(dbPass.equals(password)) {
						return result = true;
					}
				}while(rs.next());
			}
			pstmt.close();
			rs.close();
		}catch (Exception e) {
			System.out.println("암호 조회시 예외 발생 " + e.getMessage());
		}
		return result;
		
	}
	//ID 가 존재하는지 여부에 대한 validation 메서드 정의
	public int isMember(String id) {
		int result = 0;
		//조건절 조회...where userid = ? --> userid 컬럼값 중에 파라미터로
		//넘어온 id 가 존재하는지 조건절 select 입니다.
		//아래의 sql 중 count() 함수는 파라미터인 컬럼을 기준으로
		//id 가 존재 한다면 그 갯수(count) 를 리턴하는 oracle 함수 입니다.
		//즉 id 가 존재한다면, 1 이 리턴될겁니다. 이유는 ID 는 PK(Primary key)로
		//제약(Constraints)를 줬기 때문에 무조건 중복 불가입니다.(DB 시간에 더 배움)
		String sql = "Select count(userid) from Users Where userid = ?";
		try {
			Connection conn = getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			
			//조회(Select) 는 executeQuery(sql) 을 실행해야 합니다.
			ResultSet rs = pstmt.executeQuery();
		
			if(rs.next()) {
				result = rs.getInt(1);
			}
			rs.close();
			pstmt.close();
			return result;
		}catch (Exception e) {
			System.out.println("회원 조회시 예외 발생" + e.getMessage());
		}
		return result;
	}
	
	private  void closer(Connection conn) {
		if(this.conn != null) {
			try {
				conn.close();
			}catch (Exception e) {
				System.out.println("DB close 시 예외 발생함" + e.getMessage());
			}
		}
	}
	
	//회원가입이나 게시판의 새글등이 DB 에 쓰여지도록(insert) 메서드를 구현 합니다.
	//일단 회원 가입이라 생각하고 모든 정보는 DTO 에 담겨져서 받도록 합니다.
	//이 DTO를 DB 에 Insert 만 하도록 정의 합니다.
	public int regMember(MemberDTO dto) {
		int result = 0;//만약 가입이 안될경우의 리턴값 초기화
		String sql = "Insert into Users (USERID,USERNAME,USERPASSWORD,"
				//오라클에서 시스템의 현재 시간을 Date 로 리턴하는 함수 sysdate 를 사용해서
				//사용자의 가입 날짜를 세팅합니다.
				+ "USERAGE,USEREMAIL,REG_DATE) Values (?,?,?,?,?,sysdate)";
		
		//Connection 얻도록 합니다.
		Connection con = getConnection();
		PreparedStatement pstmt = null;
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getUserId());
			pstmt.setString(2, dto.getUserName());
			pstmt.setString(3, dto.getUserPassword());
			pstmt.setInt(4, dto.getUserAge());
			pstmt.setString(5, dto.getUserEmail());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(pstmt != null)
				try {
					
					pstmt.close();
					closer(con);
					//closer();//Connection Close 메서드 호출.
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return result;
	}
	public int deleteMember(String id) {
		String sql = "Delete from users where userid = ?";
		Connection conn = getConnection();
		int result =0;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			result = pstmt.executeUpdate();
			pstmt.close();
			return result;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
