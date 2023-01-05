package basic;
import java.io.IOException;

import javax.swing.JOptionPane;
public class JavaInputThingsEx3 {

		public static void main(String[] args) throws IOException {
			String fir = JOptionPane.showInputDialog("첫 수를 입력하세요");
			int p_fir = Integer.parseInt(fir);
			
			JOptionPane.showConfirmDialog(null, "긁적");
			
			System.out.println(p_fir + 1);
			//첫 째는 나를 연 부모창의 객체를 주는데, 지금은 무시해라.
			//두 번째 파라미터 값은 문자열로, 뿌려질 내용은 주면된다.
			JOptionPane.showMessageDialog(null, fir);
			
			/*
			 * 클래스 명은 Stu
			 */
		}
}

