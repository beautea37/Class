package model.viewer;

import java.util.Scanner;

import model1.daos.ModelDAO;
import model1.model.MemberDTO;

/*
 * 사용자의 가입 정보를 입력 받아서 DTO 에 세팅 후, DAO 를 이용해서 가입 완료를 시킵니다.
 */
public class Reg_Member {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사용할 ID를 입력해주세요 : ");
		String id = sc.nextLine();
		
		//ID 검증 로직 메서드를 호출해서 validation 결과를 리턴합니다.
		//중복 ID 가 있는지도 검사하면 좋겠네요. (이건 DAO 의 메서드를 이용합니다.)
		//위 validation 이 OK 시에만 다음 입력값을 받도록 합니다.
		System.out.println("암호를 입력해주세요 : ");
		String password = sc.nextLine();
		
		System.out.println("Email을 입력 해주세요 : ");
		//필요하다면 email 도 validation 합니다. 즉, 이메일 형식 검사도 하지만
		//중복되는 email 이 있는지도 검사하면 좋겠네요.(이건 DAO 의 메서드를 이용합니다.)
		String email = sc.nextLine();
		
		System.out.println("나이를 입력 해주세요 : ");
		int age = Integer.parseInt(sc.nextLine());
		
		System.out.println("이름을 입력 해주세요 : ");
		String name = sc.nextLine();
		
		MemberDTO Member = new MemberDTO();
		Member.setUserAge(age);
		Member.setUserEmail(email);
		Member.setUserid(id);
		Member.setUserName(name);
		Member.setUserPassword(password);
		
		//DTO 셋업 완료됐으니.. 다음은 DAO 의 메서드 호출해서 Insert 하면 됩니다.
		int result = ModelDAO.getInstance().regMember(Member);
		
		if(result != 0) {
			System.out.println(Member.getUserName() + "님 회원가입이 완료되었습니다.");
		}else {
			System.out.println("회원가입에 서버문제가 발생했습니다.");
		}
	}
}