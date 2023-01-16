package javasql.model1.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ModelDAO {
	/*
	 * 외부에 Instance 를 제공하는 메서드와 기타, SQL 을 처리하는 메서드만 제외하고는 모두 private 으로 처리한다.
	 */
	private static Connection conn;

	private static final String account;
	private static final String accPass;
	private static final String dbSchema;

	static {
		account = "c##beautea37";
		accPass = "1234";
		dbSchema = "jdbc:oracle:thin:@localhost:1521/xe";
	}

	private static ModelDAO dao = new ModelDAO();

	private ModelDAO() {
		init();
	}

	/*
	 * 이 메서드는 DAO 인스턴스 생성시에 필요한 초기화 작업을 모두 처리합니다. 현재는 Connection 만 맺도록 하는 작업만 처리합니다.
	 */
	private void init() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "c##beautea37", "1234");
			System.out.println("컨넥션 ok 정보 --> " + conn);
		} catch (Exception e) {
			System.out.println("Connection 생성시 예외 발생함.");
			System.out.println("예외 내용 : " + e.getMessage());
		}
	}

	public static ModelDAO getInstance() {
		return dao;
	}
/*
 * 모든 사용자 정보를 리턴하는 메서드를 정의한다.
 * 이 메서드는 모든 사용자 정보이기 때문에 따로 파라미터는 받지 않고
 * Select * from Users;로 조회 sql을 날린다.
 * 이 때 리턴되어지는 모든 Row는 각 1:1로 MemberDTO에 담고
 * 이 담겨진 DTO객체들은 ArrayList에 담아서 전달하게 된다.
 * 이걸 받은 ShowAllMember 클래스는 받은 정보를 모두 출력하게 된다.
 * 이 연결고리를 잘 파악해야한다.
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
			
			//데이터가 존재한다면
			if(rs.next()) { //if절로 커서를 Data 테이블로 내리고.
				//DTO가 담길 ArrayList 생성
				members = new ArrayList<MemberDTO>();
						
				do { //여기서부터 첫 번째 row 데이터를 get한다.
					dto = new MemberDTO();
					dto.setReg_Date(rs.getDate("reg_date"));
					dto.setUserAge(rs.getInt("reg_date"));
					dto.setUserEmail(rs.getString("usermail"));
					dto.setUserId(rs.getString("userid"));
					dto.setUserName(rs.getString("username"));
					dto.setUserPassword(rs.getString("userpassword"));
				} while( rs.next());
			}
		} catch (Exception e) {
			System.out.println("sdfksfjsafkljerltj");
		} 
	
				
		
		return members;
	}
	// ID가 존재하는지 여부에 대한 VALIDATION 메서드 정의
	public int isMember(String id) {
		int result = 0;
		// 조건절 조회. where userid = ? >>>> userId 컬럽값 중에 파라미터로 넘어온 id가 존재하는지 조건절 select하는
		// 부분
		// 아래의 sql중 count()함수는 파라미터인 컬럼을 기준으로 id가 존재한다면 그 개수(count)를 리턴하는 oracle함수이다.
		// 즉 id가 존재한다면 1이 리턴될 것이다. 이유는 id는 pk(Primary key)로 제약(Constraints)를 줬ㄱ ㅣ때문에 무조건
		// 중복 불가이다.(DB시간에 더 배울 예정)
		String sql = "Select cont(userid) from Users Where userid = ?";
		try {
			Connection conn = getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, id);

			// 조회(select)는 executeQuery(sql)을 실행해야 한다.
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				result = rs.getInt(1);

			}
			rs.close();
			pstmt.close();
			return result;
		} catch (Exception e) {
			System.out.println("회원 조회 시 예외 발생 : " + e.getMessage());
		}
		return result;
	}

	private void closer() {
		if (this.conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				System.out.println("DB close 시 예외 발생함" + e.getMessage());
			}
		}
	}

	private static Connection getConnection() {
		// TODO Auto-generated method stub
		return conn;
	}

	// 회원가입이나 게시판의 새 글 등이 DB 에 쓰여지도록(insert) 메서드를 구현합니다.
	// 일단 회원 가입이라 생각하고 모든 정보는 DTO 에 담겨져서 받도록 합니다.
	// 이 DTO를 DB 에 Insert 만 하도록 정의합니다.
	public int regMember(MemberDTO dto) {
		int result = 0;// 만약 가입이 안될경우의 리턴값 초기화
		// 오라클에서 시스템의 현재 시간을 Date로 맅너하는 함수 sysdate를 사용해 사용자의 가입 날짜를 세팅하ㅏㄴㄷ.
		String sql = "Insert into Users ( USERID,USERNAME,USERPASSWORD,"
				+ "USERAGE,USERMAIL,REG_DATE Values (?,?,?,?,?)";

		// connection을 얻어보자.
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
			e.printStackTrace();
		} finally {
			if (pstmt != null)
				try {
					pstmt.close();
					closer();
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
		}
		return result;

	}

	public static void main(String[] args) {

	}

	public boolean checkPassword(String id, String password) {
		// TODO Auto-generated method stub
		String sql = "Select userpassword from Users where id = ?";
		boolean result = false;

		Connection conn = getConnection();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			;

			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				do {
					String dbPass = rs.getString("userPassword");
					if (dbPass.equals(password)) {
						return result = true;
					}
				} while (rs.next());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result = false;
	}

	public int deleteMember(String id) {
		String sql = "Delete from users where userid = ?";
		Connection conn = getConnection();
		int result = 0;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			result = pstmt.executeUpdate();
			pstmt.close();
			return pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	   public MemberDTO getMember(String id) {
		      MemberDTO dto = null;
		      String sql = "Select * from users where userid = ?";
		      PreparedStatement pstmt = null;
		      Connection conn = getConnection();
		      
		      
		   
		   try {
		      pstmt = conn.prepareStatement(sql);
		      pstmt.setString(1, id);
		      ResultSet rs = pstmt.executeQuery();
		      
		      if(rs.next()) {//if절로 커서를 Data 테이블로 내리고
		         //DTO가 담겨질 AllaList를 생성합니다
		         
		         do {
		            //여기서부터 첫번째 Row 데이터를 get합니다
		            //하나의 row는 하나의 DTO에 Mapping되기에 여기서
		            //DTO객체를 생성해서 setter를 호출하여 DTO를 완성시킵니다
		            dto = new MemberDTO();
		            dto.setReg_Date(rs.getDate("reg_date"));
		            dto.setUserAge(rs.getInt("userage"));
		            dto.setUserEmail(rs.getString("useremail"));
		            dto.setUserId(rs.getString("userid"));
		            dto.setUserName(rs.getString("username"));
		            dto.setUserPassword(rs.getString("userpassword"));
		            
		            //dto의 값이 모두 완료되면 members에 담습니다
		         
		            
		         }while(rs.next());
		         pstmt.close();
		         conn.close();
		      }
		   }catch (Exception e) {
		      // TODO: handle exception
		   }
		      return dto;
		   }

}