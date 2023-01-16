package model.viewer;

import java.util.Scanner;

import model1.daos.ModelDAO;

public class DeleteMember {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("회원을 탈퇴하려면 ID를 입력해주세요 : ");
		String id = sc.nextLine();
		String password = null;
		
		if(ModelDAO.getInstance().isMember(id) == 0) {
			System.out.println("존재하지 않는 ID 입니다");
		}else {
			System.out.println("암호를 입력해주세요 : ");
			password = sc.nextLine();
			
			if(ModelDAO.getInstance().checkPassword(id,password)) {
				//암호까지 맞다면, 삭제를 로직 구현함.
				if(ModelDAO.getInstance().deleteMember(id) == 1) {
					System.out.println(id + "님 회원탈퇴 되었습니다 다음에 또 만나길");
				}
			}else {
				System.out.println("암호가 틀립니다");
			}
		}
	}
}