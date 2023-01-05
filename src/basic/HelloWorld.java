package basic;

public class HelloWorld {
/*		자바 Application(모바일이나 웹이 아닌 일반 PC에서 실행되는 App은 몇천 개의 클래스가 구성되어 하나의 프로그램으로 완성된다.
	 * 위에서 완성된 App이 실행될 때 JVM은 반드시 찾게되는 메서드가 있다.	 * 즉 프로그램이 시작되는 시작점을 말한다.
	 * 이 메서드를 main메서드라고 한다.
	 * main 메서드는 이렇게 중요한 의미를 갖고있기때문에 이 메서드를 보유한 클래스가 일반적으로 main 클래스가 된다.
	 * 이 메서드는 하나의 앱에서 하나의 클래스만 가질 수 있다. 시작점이 하나라는 뜻이다.
	 * 따라서 main()는 반드시 아래와 같은 정의만 가능합니다.
 */
	public static void main(String[] bbb) {
/*			자바스크립트의 write()와 같은 기능을 가진 메서드가 있다.
		 * System.out.println("값" or 변수);
		 * 자바는 스크립트와 달리 반드시 명령, 선언, 대입 등의 모든 실행문의 끝엔 " ; "를 넣어야한다.
*/
		String myName = "조기제";
		
		System.out.println("Hello" + myName + "님!");
	}
}