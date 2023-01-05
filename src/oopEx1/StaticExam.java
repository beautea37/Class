package oopEx1;

public class StaticExam {

	///////////////////////////static 다음 필드 다음 main이 읽혀진다. 순서를 꼭 알아야 한다.
	
	
	
	
	
	static final int a; //공유변수(상수) 선언
	int b;//멤버필드
	
	void showB() {
		System.out.println("멤버필드 b값" + this.b);
	}
	static void showA() {
		
	}
	static {
		a = 10;
		System.out.println("static 블락 호출됨");
		System.out.println("static의 값 : " + a);
	}
	public static void main(String[] args) {
		showA();
		System.out.println("메인메서드 호출됨");
		
	}
}


