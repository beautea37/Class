package basic;
import javax.swing.JOptionPane;

public class ScoreEx1 {
	public static void main(String[] args) {

		int a, b, c, sum, avg;

		do {
			a = Integer.parseInt(JOptionPane.showInputDialog("국어 ㄱㄱ"));
			b = Integer.parseInt(JOptionPane.showInputDialog("영어 ㄱㄱ"));
			c = Integer.parseInt(JOptionPane.showInputDialog("수학 ㄱㄱ"));
			sum = a + b + c;
			avg = sum / 3;
			System.out.println("점수의 총합은 " + sum);
			System.out.println("점수의 평균은 " + avg);

			if (avg >= 90) {
				System.out.println("학점은 A입니다.");
			} else if (avg >= 80) {
				System.out.println("학점은 B입니다.");
			} else if (avg >= 70) {
				System.out.println("학점은 C입니다.");
			} else {
				System.out.println("뒤지셈 걍 ㅋㅋ");
			}

		} while (a < 0 || a > 100 || b < 0 || b > 100 || c < 0 || c > 100);
	}
}
