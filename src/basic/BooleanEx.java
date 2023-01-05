package basic;

public class BooleanEx {
	
	static int i; //클래스 변수 선언. 21행의 선언과 이름은 중복이나 클래스가 다르기 때문에 문제되지 않는다.
	static String myName;
	
	public static void main/*main은 시작지점이다. 매우 중요*/(String[] args) {
		/*클래스 변수 출력. 기본적으로 지역ㄱ변수는 초기화되지 않은 상태에서 사용되면 에러이나, 
		 * 클래스변수는 선언후 클래스가 메모리에 로드되는 시점에 기본값이기 때문에 에러 x
		 */
		System.out.println(i);
		System.out.println(myName);
		
		
		
		
		
		/*
		 * boolean 타입 : 메모리는 생각하지 마라. 오로지 값으로는 t or f만 받는다. 스크립트처럼 값의 타입을 변경할 수 없고 한 번
		 * 선언되면 메모리에서 사라질 때까지 boolean값만 넣을 수 있다.
		 * 
		 * boolean b1 = true;
		 * 
		 * if(b1) { System.out.println("b1의 값은 true");
		 */
		/*
		 * 여기서는 자바에서 사용되는 변수의 scope에 대해 알아봅니다. 기본적으로 메서드 내에서 선언된 변수는 로컬 변수, 어떤 곳이던 {}
		 * 내에서 선언된 변수는 블락변수, 그리고 클래스에서 선언된 변수는 클래스 or 멤버필드로 지정된다. 위 클래스 or 멤버의 기준은
		 * static이라는 키워드가 좌우한다. 즉 static이 붙은 변수는 클래스 변수, none static은 멤버필드라고 한다. 위 클래스
		 * or 멤버 필드는 순서대로 클래스가 메모리에 남아있는 동안 살아있고 멤버는 객체가 몹쓸객체로 변이되기 전까지는 살아있는다. 지역 변수는
		 * 메서드의 body가 끝나면 삭제되고 블락은 블락이 실행된 후 삭제된다.
		 */
		int i; // main()에서 처음 선언되었으므로 지역변수이다.
		i = 10;
		{
			int j = 2;
			int sum = i * j;
			System.out.println(sum);
		}
			//System.out.println(i + " * " + j + " = " + sum); 블락 밖에서 블락변수 호출해서 컴파일 에러 뜨는 것.

		// static void doSome() {
		// System.out.println(i); int 값의 {}에서 벗어나서 오류 뜨는거
	}
}
