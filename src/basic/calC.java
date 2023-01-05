package basic;
import java.io.IOException;
import java.util.Scanner;




public class calC {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("메시지 입력하소");
		
		String value1 = sc.nextLine();
		System.out.println(value1);
		int fir = sc.nextInt();
		System.out.println(fir + 1);;
	}
	static void doSome() {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("문자를 입력하세요.");
//		char input = (char)System.in.read();
//		System.in.read();
//		System.in.read();
//		System.out.println("입력한 결과는" + input);
	}
}
