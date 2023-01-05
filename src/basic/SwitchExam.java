package basic;
import javax.swing.JOptionPane;

public class SwitchExam {

	public static void main(String[] args) {
		
		/*
		 * 자바에서는 switch~case 구문의 조건값으로는 int 이하만 됩니다.
		 * 반드시 기억 하세요.
		 */

		/*
		 * 두수와 연산자를 입력해서 결과를 출력하도록 switch 문을 이용해서 구현하세요
		 * 첫수 1 연산자 * 두번째수 2 --> 결과 : 1 * 2 = 3
		 * 
		 * 출력문은 반드시 한번만 정의 하세요..
		 */
		
		
		

		int confirm = JOptionPane.showConfirmDialog(null,  "계산기 ㄱㄱ?");
		if(confirm == 0)	{
			int fir = Integer.parseInt(JOptionPane.showInputDialog("첫 수 입력"));
			char op = JOptionPane.showInputDialog("연산자입력").charAt(0);
			int sec = Integer.parseInt(JOptionPane.showInputDialog("두번째수입력"));
			String msg="";//사용자가 올바르지 않은 연산자를입력시 처리할 메세지 변수.
			double result = 0;//결과값 선언..
			
			switch (op) {
			case '*':
				result = fir * sec;
				break;
			case '+':
				result = fir + sec;
			default:
				msg = "";
				break;
			}
			
			if(!msg.equals("")) {
				JOptionPane.showMessageDialog(null, msg);
				System.exit(0);//자바프로그램을 명시적으로 완전종료 하는 API
				//return;
				
			}
			
			int confirm1 = JOptionPane.showConfirmDialog(null, "결과 : "  + fir + op + sec + " = " +result);
			if(confirm1 == 0) {
				fir = Integer.parseInt(JOptionPane.showInputDialog("첫 수 입력"));
				op = JOptionPane.showInputDialog("연산자입력").charAt(0);
				sec = Integer.parseInt(JOptionPane.showInputDialog("두번째수입력"));
				msg="";//사용자가 올바르지 않은 연산자를입력시 처리할 메세지 변수.
				result = 0;//결과값 선언..
				
				switch (op) {
				case '*':
					result = fir * sec;
					break;
				case '+':
					result = fir + sec;
				default:
					msg = "";
					break;
				}
				
				if(!msg.equals("")) {
					JOptionPane.showMessageDialog(null, msg);
					System.exit(0);//자바프로그램을 명시적으로 완전종료 하는 API
					//return;
					
				}
			} else {
				JOptionPane.showMessageDialog(null, "ㅇ ㄲㅈ ㅄㅇ");	
			}
		}	else {
			JOptionPane.showMessageDialog(null, "ㅇ ㄲㅈ ㅄㅇ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
