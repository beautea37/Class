package basic;

public class MethodExam1 {
	static int max(int x, int y) {//
		if(x > y) 
			return x;
			return y;
		
	}


	/*
	 * 자바 메서드 자바를 포함 모든 객체지향 언어에는 메서드라는 이름의 기능을 정의하고, 제공하고 있습니다. 메서드는 간단히 말하자면
	 * 자바스크립트이 펑션, 우리가 어려울 때 배운 함수와 같은 개념이다. 어떤 로직이 반복적으로 필요할 경우 해당 로직을 분리해서 메서드를
	 * 정의해놓으면 그 기능이 필요할 때마다 사용할 수 있기에 재활용적인 면에서도 좋습니다. 이렇듯 자바에서는 메서드와 필드를 뗴어놓고 말하기
	 * 어려울 정도로 많이 사용되어지니까 이 시간에 꼭 알고 넘어가야 한다. 아래는 메서드 선언 syntax이다. []내에 키워드는
	 * option이라서 선언을 해도 그만 안해도 그만 앞으로 객체지향을 공부하기 전까지는 main()에서 다른 메서드를 호출하여 사용할텐데 그
	 * 때 호출되어지는 메서드는 반드시 static으로 정의해야한다는 것은 기억해둬라
	 * 
	 * 문법 : [public,protected,default,private] -- 4중 하나. 만약 비선언시 무조건 default 선언으로
	 * 간주.
	 * 
	 * [static] : 클래스 단위의 메서드인지의 여부 키워드. 없으면 무조건 객체의 메서드로 선언한 것으로 취급 return type :
	 * 정의한 메서드가 실행 중 또는 종료 시에 넘겨줄 값이 존재한다면 해당 타입을 리턴으로 지정해야한다. 만약 넘겨줄 것(return)이 없을
	 * 경우엔 void로 선언해야 한다. 리턴 타입에는 []를 쓰지 않았기 때문에 필수.
	 * 
	 * methodName : 리턴 타입 바로 옆에는 반드시 메서드 명을 선언해야 한다.(이름 규칙은 변수와 같다.)역시 필수
	 * 
	 * methodName([parameter1, parameter2...p(n)]) 이름 옆의 괄호는 메서드가 정의될 때 어떤 파라미터 값이
	 * 필요가 없을 땐 그냥 괄호만, 만약 필요시엔 해당 값의 타입과 그 값을 local에서 사용시 사용될 변수명을 넣어준다. 이렇게 선언된
	 * 변수명은 헤더 메서드의 지역 변수로 활용된다.
	 * 
	 * 메서드 body {} : 메서드이름(){메서드바디}좌에서 보듯 일반적인 메서드 정의 형식이다. 메서드 바디에는 해당 메서드가 어떤 로직을
	 * 구현할 지에 대한 상세 로직을 구현하는 부분이다. 나중에 배울테지만, 상속 시 필요에 따라서 바디가 없는 선언부만 가질 수도 있다.
	 * 기본적으로 {}바디를 정의해야 한다고 생각해라.
	 * 
	 * 바디 {}내의 return : 만약 메서드가 수행 중간 또는 후에 뭔가를 되돌려줄(return)의도가 있다면, return 키워드를 이용,
	 * 값을 메서드 선언 시 선언된 리턴 타입과 같거나 큰 타입으로 리턴시키면 된다. 로직 중간에 return이 호출되면 해당 메서드는 그 시점에
	 * 종료된다. 만약 void 타입의 메서드에서 return을 사용하게 되면 명시적으로 해당 시점에 그 메서드의 수행을 멈추겠다는 의미이다.
	 * 
	 * --------- 총론 ---------- 위의 내용을 종합하여 메서드를 정의한 예는 아래와 같다. [public] [static]
	 * (ptype or rtype) or void doSome([p1,p2...]){ 로직로직로직로직로직로직로직로직로직로직로직로직
	 * [return] }
	 */
	public static void main(String[] args) {
		//print(); // 5번 출력하는 메서드 호출
		//print("그만 좀 조세요 !!!!");
		//int whichMax = max(10, 11); //1
		System.out.println("두 수 중 " 	+ max(10, 11) + "이 더 크다");
	}
	
	//메서드 시그니처
	//동일명으로 정의한 메서드가 컴파일러가 컴파일 시 중복 정의 여부를 판별하는 요소
	//파라미터의 개수, 타입, 순서 모두 같은 경우 같은 메서드로 인식하여 중복에러가 발생된다.
	
	//여러분이 메서드를 같은 이름으로 목적은 같지만 디테일이 조금씩 다른 경우로 정의하였을 때
	//컴파일러(VM)는호출하는 메서드의 시그니처를 기준으로 해당 메서드를 호출한다.
	//그래서 아래처럼 동일명으로 시그니쳐만 틀리게 정의한 것을 메서드 오버로딩
	
	static void print(int count, String msg) {
		for(int i = 0; i<count; i++) {
			System.out.println(msg + "출력~");
		}
		static void print(String msg, int count) {
			for(int i = 0; i<count; i++) {
				System.out.println(msg + "출력~");
			}
	}
	static void print(String msg) {
		System.out.println(msg + "출력됨!");
		System.out.println(msg + "출력됨!");
		System.out.println(msg + "출력됨!");
		System.out.println(msg + "출력됨!");
		System.out.println(msg + "출력됨!");
	}
	static void print() {
		System.out.println("출력됨");
		System.out.println("출력됨");
		System.out.println("출력됨");
		System.out.println("출력됨");
		System.out.println("출력됨");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
