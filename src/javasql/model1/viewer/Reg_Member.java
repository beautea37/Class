package javasql.model1.viewer;

import java.util.Scanner;

import javasql.model1.daos.MemberDTO;
import javasql.model1.daos.ModelDAO;

public class Reg_Member {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("사용할 아이디를 입력해라 : ");
		String id = sc.nextLine();
		// 아이디 검증 로직 메서드를 호출해 validation결과를 리턴한다.
		// 중복 ID가 있는지도 검사 필요. (이건 DAO 메서드 이용)
		// 위 validation이 ok시에만 다음 입력값을 받도록 한다.
		System.out.println("암호 ㄱㄱ");
		String password = sc.nextLine();
		// 필요할 경우 email도 validation한다. 즉, 이메일 형식 검사도 하지만 중보고디는 email이 있는지도 검사하면 나쁠 건
		// 없다.(이 것도 DAO메서드 이용)
		System.out.println("이메일 ㄱㄱ");
		String email = sc.nextLine();

		System.out.println("나이 ㄱㄱ");
		int age = Integer.parseInt(sc.nextLine());

		System.out.println("이름 ㄱㄱ");
		String name = sc.nextLine();

		MemberDTO member = new MemberDTO();
		member.setUserAge(age);
		member.setUserEmail(email);
		member.setUserId(id);
		member.setUserName(name);
		member.setUserPassword(password);

		// DTO셋업 완료됬으니까 다음은 DAO의 메서드 호출해 Insert하면 된다.
		int result = ModelDAO.getInstance().regMember(member);

		if (result != 0) {
			System.out.println(member.getUserName() + "님 회원가입 완료");
		} else {
			System.out.println("회원가입에 서버문제가 발생함");
		}
	}
}
