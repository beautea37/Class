package basic;
import java.io.IOException;

public class javaInputThings {
	public static void main(String[] args) throws IOException {
		System.out.println("수나 문자 하나를 입력했을 경우");
		//아래는 콘솔을 이용해 사용자가 입력한 값 "하나"를 프로그램 내부로 리턴시키는 메서드
		// int input = System.in.read(); //다른 사람들이 입력한 값은 아스키값이고, 아스키값은 문자이기 떄문에 여기서
		char input = (char)System.in.read();//로 바꾸면 누군가가 입력한 값을 아스키가 아닌 우리가 원하는 '문자'로 출력해준다.
		
		System.out.println("입력한 값은 " + input);
		
		System.in.read();
		System.in.read();
		
		System.out.println("숫자 아무거나 입력 : ");
		//숫자를 입력받을 것.
		int digit = System.in.read() - 48;
		System.out.println("입력한 수는 " + digit);
	}
}




