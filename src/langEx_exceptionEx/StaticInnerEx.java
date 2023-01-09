package langEx_exceptionEx;
/*
 * 외부 클래스의 멤버필드 선언 위치에 선언되며 외부 클래스의 static멤버처럼 호출 및 객체 생성 가능함.
 * 주로 외부 클래스의 static 멤버, 특히 static 메서드를 사용할 목적으로 주로 정의함.
 * 만약 내부클래스에서 static필드(상수x)를 선언해야할 경우엔 무조건
 * static inner클래스로 선언되어야 함.(JDK 17이전 버전까지)
 */


public class StaticInnerEx {

	static int a = 10;
	private static int b = 100;
	static int c = 200;
	
	public static int getA() {
		return a;
	}
	public static int getB() {
		return b;
	}
	static int getC() {
		return c;
	}
	public static class StaticInner {
		
		int d = 300;
		static final int e = 400;
		static int f = 500;
		
		public static void printA() {

			System.out.println("a = " + a);
			System.out.println("b = " + b);
			System.out.println("c = " + c);
			System.out.println("getA() = " + getA());
			System.out.println("getB() = " + getB());
			System.out.println("getC() = " + getC());
			
		}
		public static void printB() {
			
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			System.out.println("c = " + c);
			System.out.println("getA() = " + getA());
			System.out.println("getB() = " + getB());
			System.out.println("getC() = " + getC());
			
		}
		public static void printC() {
			
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			System.out.println("c = " + c);
			System.out.println("getA() = " + getA());
			System.out.println("getB() = " + getB());
			System.out.println("getC() = " + getC());
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticInnerEx.StaticInner.printA();
		StaticInnerEx.StaticInner. sInner = new StaticInner();
		sInner.printB();
		
	}
}















