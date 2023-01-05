package basic;
import javax.swing.JOptionPane;

public class MemberDTO {
	private String mem_Email;
	GBW GBW;
	JOptionPane input;
	
	
	public MemberDTO() {
		inputEmail();
	}
	
//	private void ask() {
//		String[] yn = {"y", "n"};
//		this.yes = input.showInputDialog("게임 하실래요(y/n)?");
//		if (yn[0].equals(yes)) {
//			game = new GBW();
//		} else if(yn[1].equals(yes)) {
//			input.showMessageDialog(null, "no? sure.");
//			
//		} else {
//			input.showMessageDialog(null, "잘못된 값입니다. 다시 입력하세요.");
//			ask();
//		}
		
//	}

	// 메서드 리턴을 void로 했는데, 예시 끝난후 로직상 변경해야 함.
	private void inputEmail() {
		this.mem_Email = input.showInputDialog("이메일 입력");
		GBW = new GBW();
		//return mem_Email;
		
		
		
		
	}
	public String getMem_Email() {
		return mem_Email;
	}
//
//	public String getMem_Email() {
//		return mem_Email;
//	}
}
