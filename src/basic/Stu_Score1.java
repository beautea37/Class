package basic;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Stu_Score1 {
	/*
	 * 클래스 명은 Stu_Score1 1.프로그램이 시작하면 사람의 이름을 입력받도록 띄우세요(콘솔 or GUI) 2.입력이 된 후엔 국어점수
	 * 입력 하세요 라는 메세지를 띄우고 값을 입력 받으세요 3.다음엔 영어 점수 입력하세요. 후 2번과 동일 4.수학 점수 입력 하세요 후
	 * 2번과 동일 5.출력 결과는 아래와 같이 임진우님 !!! 당신의 성적은 다음과 같습니다. 총점 : ~ 점 평균 : ~ 점
	 */
	public static void main(String[] args) throws IOException {

		String fir = JOptionPane.showInputDialog("이름을 입력하시오");
		String a = JOptionPane.showInputDialog("국어 ㄱㄱ");
		String b = JOptionPane.showInputDialog("영어 ㄱㄱ");
//int a = Integer.parseInt.JOptionPane.showInputDialog("국어 ㄱㄱ");
		int pa = Integer.parseInt(a);
		int pb = Integer.parseInt(b);
		int sum = pa + pb;
		int avg = (pa + pb) / 2;

		System.out.println("야 " + fir + ". 이게 점수냐? \n" + "총점 : " + sum + "\n평균 : " + avg);

		
		String mi = "hi";
		String mi2 = "hi";
		
		if(mi == mi2) {
			System.out.println("같은 문자열입니다.");
		} else {
			System.out.println("다른 문자열입니다.");
		}
		if(mi.equals(mi2)) {
			System.out.println("문자열 값이 같습니다.");
		} else {
			System.out.println("문자열 값이 같습니다.");
		}
	}
}
