package utilEx;

import java.io.IOException;
import java.util.Stack;

//stack 2개를 이용해 웹브라우저의 back, forward의 url을 저장하는 방법을 알아봅니다.
public class UseStackBrowser {

	public static Stack<String> back = new Stack<String>();
	public static Stack<String> forward = new Stack<String>();

	public static void main(String[] args) {
		goURL("https://www.nextree.co.kr/p6506/");
		goURL("https://news.naver.com/");
		goURL("https://www.google.com/");
		printStatus();
		goBack();
		printStatus();
	}

	public static void printStatus() {
		System.out.println("back : " + back);
		System.out.println("forward : " + forward);
		System.out.println("현재화면 : " + back.peek());
		System.out.println();
	}

//브라우저의 로케이터에 url을 입력하는 기능의 메서드를 정의한다.
	public static void goURL(String url) {
		// Runtime 클래스의 유용한 메서드 중 os의 특정 exe를 동적으로 호출해 실행하는 메서드를 사용한다. 여기서 주어지는 파라미터가
		// 윈도우에 있고
		// 이름이 정확하면 실해왼다.
		Runtime runtime = Runtime.getRuntime();
		try {
			runtime.exec("C:\\Program Files\\Naver\\Naver Whale\\Application\\whale.exe " + url);
		} catch (IOException e) {
			e.printStackTrace();
		}
		back.push(url);
		if (!forward.isEmpty()) {
			forward.clear();
		}
	}

	// 브라우저에서 back, forward를 클릭처럼, 그 기능을 내부적으로 구현하는 메서드 정의
	public static void forForward() {
		// 항상 주의해야할 것은 객체는 null, collection들은 요소가 있는지 여부를 먼저 확인해야한다.
		// 그렇지 않으면 예외발생이 생실 수도 있다.
		if (!forward.isEmpty()) {
			back.push(forward.pop());
		}
	}

	public static void goBack() {
		if (!back.isEmpty()) {
			forward.push(back.pop());
		}
	}
}
