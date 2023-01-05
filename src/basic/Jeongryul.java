package basic;
import java.util.Scanner;

public class Jeongryul {
	public static void main(String[] args) {
//		int a = 1;
//		if(a > 0)
//			System.out.println("a는 0보다 큽니다.");
//			System.out.println("여긴 if 실행문이 아닌 main()실행문입니다.");
//		최(.,[],new),(), 선행(++,--), 단항(!,~,+,-,typeof,), 산술(*,/,%,+,-),쉬프트(<<,>>,>>>),
//		관계(==,!=, ===, !==, <,>,...), 논리(&,|,&&,||), 삼항(조건 ?v1 : v2), 배정대입(+=,..),
//		후행(++,--))

//		String a = JOptionPane.showInputDialog("첫째 값");
//		String b = JOptionPane.showInputDialog("둘째 값");
//		String c = JOptionPane.showInputDialog("셋째 값");
//		
//		int aa = Integer.parseInt(a);  
//		int ab = Integer.parseInt(b);
//		int ac = Integer.parseInt(c);
//		
		Scanner s = new Scanner(System.in);
		int fir, sec, third, temp;
		fir = s.nextInt();
		sec = s.nextInt();
		third = s.nextInt();
		temp = s.nextInt();
		 
		 if(sec>= fir && sec >= third) {
			 //무조건 두 번째 수가 크다면 값을 치환한다.
			 temp = fir;
			 fir = sec;
			 sec = temp;		
//		 } else if(fir >= sec && fir >= third) {
//			 temp = sec;
//			 sec = third;
//			 third = temp;
		 } else if(third >= fir && third >= sec) {
			 temp = fir;
			 fir = third;
			 third = temp;
		 }
		 if(third >= sec) {
			 temp = sec;
			 sec = third;
			 third = temp;
		 }
		 
		 System.out.println("정렬 결과 : " + fir + sec + third);
	}
}