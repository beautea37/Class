package javasql.model1.viewer;

import java.util.Scanner;

import javasql.model1.daos.ModelDAO;

public class DeleteMember {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("회원 탈퇴 희망시 ID 입력 바람 : ");
		String id = sc.nextLine();
		String password = null;
	System.out.println(ModelDAO.getInstance().isMember(id));	
		if(ModelDAO.getInstance().isMember(id) == 0) {
			System.out.println("존재하지 않는 ID");
			
		}else {
			System.out.println("비번 입력 : ");
			password = sc.nextLine();
			
			//암호 검증
			if(ModelDAO.getInstance().checkPassword(id, password)) {
				//암호까지 일치하면 삭제 로직 구현 예정.
				System.out.println("암호 일치. 삭제 예정");
				if(ModelDAO.getInstance().deleteMember(id) == 1) {
					System.out.println(id + "님 회원탈퇴 되었습니다.");
				}
			} else {
				System.out.println("암호 불일치");
			}
		}
	}
}
