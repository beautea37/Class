package langEx_exceptionEx;



/*
 * Local Inner(지역 중첩 클래스) : 이 클래스는 특정 메서드에 종속된 클래스다.
 * 구연하는 목적은 특정 메서드를 호출할 때 해당 내용부가 특정 클래스에 정의된 내용결과를 리턴ㄴ하도록 정의하는 데에 있다.
 * 주의해야할 점은 이 로컬 클래스느 ㄴ메서드에서만 존재하기 때문에 메서드가 실행이 되지 않을 경우엔
 * 존재 자체가 없다. 반대로 메서드가 실행이 끝난 경우에도 존재가 사라집니다.
 * 즉 외부에는 절대 노출이 안된다는 얘기가 된다.
 * 
 * 이 로컬클래스는 jdk버전없이 되기 전에는 상수(final)만 가질 수 있었는데, 15?이상부터는 상수가 아니어도 지역변수를 가질 수 있게 되었다.
 * 
 */
public class LocalInner {

	int k = 1;

	class InstanceInner { // 멤버 inner클래스 정의
		int a = 100;
	}

	static class StaticInner {
		int b = 200;
		static int c = 300;
	}
	void yourMethod(int gg) {
		
		final int localVar = 100;
		
		class LocalInner1 {
			int d = 400;
			
			InstanceInner in = new InstanceInner()	;
			
			int k = gg + 10 + localVar;
			
			void doSome() {
				int r = k + d + StaticInner.c + localVar + gg;
			}
			
		}//local class end
		new LocalInner1().doSome();
	}//method end
	public static void main(String[] args) {
			
		LocalInner outer = new LocalInner();
//LocalInner의 InnerInstatnce 타입의 instance를 생성해보세요.
		LocalInner.InstanceInner in = outer.new InstanceInner();
				
		System.out.println(in.a);
		//지역Inner객체를 수행하는 것.
		
	}
}