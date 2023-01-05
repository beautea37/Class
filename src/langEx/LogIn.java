package langEx;

import javax.swing.JOptionPane;

public class LogIn {

	public static void main(String[] args) {

		String email;
		email = JOptionPane.showInputDialog("이메일을 입력 바랍니다.");
		char ch = email.charAt(0);
		
		int idx = email.indexOf("@");
		String Front = email.substring(0, idx);
		String End = email.substring(idx+1);
		
		System.out.println(Front);
		System.out.println(End);
		
		if (!Front.isEmpty() && Front.length() <= 12 && Front.length() >= 8 && Character.isUpperCase(ch) == true && Front.matches(".[0-9].*") && (Front.endsWith(".com"))) {
			System.out.println("합격");
		}	else {
			System.out.println("다시 입력해 샛긔야(8~12자리 입력)\n첫 문자 대문자 \n숫자 최소 1개 포함\n메일형식으로 작성 바람");
		}
	}
}