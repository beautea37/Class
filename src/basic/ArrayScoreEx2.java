package basic;
import javax.swing.JOptionPane;

public class ArrayScoreEx2 {
	public static void main(String[] args) {
		/*
		 * 오전에 작성한 Score.java를 배열을 이용해 구현해라
		 * 국영수 세 점수 받는건 같고, 다른 점수시 해당 과목에 대한 입력이 반복 출력되어야 한다.
		 * 모두 정상적이면 출력 결과는 아까와 같게 하라
		 */
		
		
	int score[] = new int[4];
//			//이 배열에는 각 과목의 점수와 총점도 int라 총점까지 넣도록 배열을 생성한 것.
//		
//		//아래 배열은 메시지 출력 시 과목명을 출력토록 한 것.
//		String theMsg[] = {"국어", "영어", "수학"};
//		float avg = 0F;
//		do {		
//		score[0] =Integer.parseInt(JOptionPane.showInputDialog(theMsg[0]));
//		score[1] =Integer.parseInt(JOptionPane.showInputDialog(theMsg[1]));
//		score[2] =Integer.parseInt(JOptionPane.showInputDialog(theMsg[2]));
//
//
//			score[3] = score[0] + score[1] + score[2];
//			avg = (float)score[3]/3;
//			
//			System.out.println("총점은 " + score[3] + "입니다.");
//			System.out.println("평균은 " + avg + "입니다.");
//			
//		} while (score[0] < 0 || score[0] > 100 || score[1] < 0 || score[1] > 100 || score[2] < 0 || score[2] > 100);
//		
		
		
		
		String theMsg[] = {"국어", "영어", "수학"};
		float avg = 0F;
		
		for(int i = 0; i<theMsg.length; i++) {
			do {
				score[i]	= Integer.parseInt(JOptionPane.showInputDialog(theMsg[i] + "를 입력하세요."));
			} 	while(score[i] < 0 || score[i] > 100);
				score[theMsg.length] += score[i];
		}
		avg = (float)(score[theMsg.length] / 3.0);
		
		System.out.println("총점 " + score[score.length-1] + "평균 : " + (Math.round(avg * 100) / 100.0));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
