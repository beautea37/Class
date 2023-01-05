package basic;
import java.util.Scanner;

public class IfExam {
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
		int a, b, c; // -- 사용자가 입력하는 임의의 정수를 담을 변수
		a = s.nextInt();
		b = s.nextInt();
		System.out.println("뭐좀 써봐");
		
		if(a>b)
		{
			a = a^b;
			b = b^a;
			a = a^b;
		}
		// 2. 두 번째 정수가 세 번째 정수보다 크다면...
		// 두 정수의 자리를 바꾼다.
		System.out.println("결과" + a + b);
	}
}
