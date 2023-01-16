package javasql.model1.viewer;

import java.util.ArrayList;

import javasql.model1.daos.MemberDTO;
import javasql.model1.daos.ModelDAO;

/*
 * 모든 회원의 정보를 열람하는 클래스
 * DAO의 getAllMember()를 호출해 ArrayList를 얻고
 * 루프를 통해 모든 정보를 출력해본다.
 */
public class ShowAllMember {

	public static void main(String[] args) {
		ModelDAO dao = ModelDAO.getInstance();

		ArrayList<MemberDTO> members = (ArrayList<MemberDTO>) dao.getAllMember();

		// 데이터가 없어도 EmptyList를 리턴하게끔 했기 때문에 NullPointer예외 걱정없이 size()호출을 할 수 있다.
		if (members.size() != 0) {
			for (int i = 0; i < members.size(); i++) {
				MemberDTO member = members.get(i);

				// 여기서부터 출력 시작.
				System.err.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
				System.out.println(i + "." + member.getUserName());
				System.out.println("ID : " + member.getUserId());
				System.out.println("Email : " + member.getUserEmail());
				System.out.println("Age : " + member.getUserAge());
				System.out.println("Name : " + member.getUserName());
				System.out.println("Pw : " + member.getUserPassword());
				System.err.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
			}

		} else {
			System.out.println("회원정보 없음");
		}
	}
}