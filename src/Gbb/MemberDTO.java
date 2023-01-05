package Gbb;

import javax.swing.JOptionPane;

//메서드 리턴을 void로 했는데, 
public class MemberDTO {
	
	public String mem_mail;
	
	public MemberDTO(){
		inputEmail();
		new Rock();
	}

	private void inputEmail() {
		System.out.println(this.mem_mail = JOptionPane.showInputDialog("이메일을 입력 바랍니다."));
	}
	public String getMem_Email() {
		return mem_mail;
		
	}
}



















//import java.util.Scanner;
//
//public class MemberDTO {
//
//	public String mem_Email;
//	Scanner sc = new Scanner(System.in);
//	GameLogic gameLogic;
//	
//	public MemberDTO(){
//		inputEmail();
//	}
//
//	//메서드 리턴을 void로 했는데, 예시 끝난후 로직상 변경해야 할겁니다.
//	public void inputEmail() {
//		System.out.print("Email을 입력바랍니다 :");
//		this.mem_Email = sc.next();
//		new GameLogic();
//	}
//
//	public String getMem_Email() {
//		return mem_Email;
//	}
//
//}
