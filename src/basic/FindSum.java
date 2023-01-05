package basic;
import javax.swing.JOptionPane;

public class FindSum {
	
	public static void main(String[] args) {
		//메인의 파라미터인 String에 값을 주고 시작해보자
//		for(int i = 0; i<args.length; i++) {
//			String str = args[i];
//			System.out.println(args[i]);
//		}
//		for(String str : args)
//			System.out.println(str);
//		
//		for(char ch = 'A'; ch <= 'Z'; ch++) {
//			System.out.println(ch);
//		}
		
		
		//바로 위에꺼 int 이용해보기. 알파벳 싹 적는거
//
//		for(int i = 65; i <= 90; i++) {
//			System.out.println((char)i);
//		}
//		outer: for(int i = 2; i <= 9; i++) {
//			if(i%2 == 0)  //짝수단은 건너뛰기										inner outer하다가 멈춤
//				continue;
//				inner: for(int j = 1; j<=9; j++) {
//				int sum = i * j;
//				System.out.println(i + " * " + j + " = " + sum);
//			}                                                   
//			System.out.println(i + "단 끝");
//		}
		//중첩 for에서 초기화 변수를 재활용할 때 발생하는 로직을 작성해보자.
		
		//아우터 루프인 for a가 이너 루프 b를 만나서 앞의 알파벳이 하나씩 삭제되면서 루프가 계속 돌기 시작한다.
//		for(char a = 'A'; a<= 'Z'; a++) {
//			for(char b = a; b<= 'Z'; b++) {
//				System.out.println(b);
//			}
//			System.out.println();
//		}

		//		int[] intArr = {12, 30, 50, 107, 505};
//		
//		Arrays.sort(intArr);		
//		
//		for(int i=0; i<intArr.length; i++) {
//			System.out.println(intArr[i]);
//		}
			
			//향상된 for.. jdk1.5부터 지원된다. 특정 그룹데이터의 전체를 다 루프할 때 요긴하다.
			//자바스크립트에서 for in과 거의 유사하다.
		String fir = JOptionPane.showInputDialog("첫 수를 입력하세요");					//int fir = Integer.parseInt(JOptionPane.showInputDialog("첫수 입력));
		String sec = JOptionPane.showInputDialog("두 번째 수를 입력하세요");			//int fir = Integer.parseInt(JOptionPane.showInputDialog("두번째수 입력));
		int ffir = Integer.parseInt(fir);
		int ssec = Integer.parseInt(sec);
		int temp=0;
		int sum = 0;
		
		if(ffir >= ssec) {
			temp = ffir;
			ffir = ssec;
			ssec = temp;
		}
		 // 1 , 10 --> 55, 10,1 --> 55
		

		for(int i = ffir; i<=ssec; i++) {
			sum += i;
		}
		System.out.println("누적합은 " + sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			

	}
	}
