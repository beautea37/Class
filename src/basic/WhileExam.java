package basic;
import javax.swing.JOptionPane;

public class WhileExam {
	public static void main(String[] args) {
		
		boolean flag = false;
		int a = 1;
		
		Outer:while(a <= 5) {
			a++;
			System.out.println("현재 변수 false라 실행 안됨");
			inner:while(true) {
				int y = JOptionPane.showConfirmDialog(null,  "계속 돌릴래?");
				if(y == 1 || y == 2) {
					System.out.println("label을 이용해 아우터 와일을 끝낸다.");
					break Outer;
				}
			}
		}
		System.out.println("현재 a의 값 : " + a);
	}
}