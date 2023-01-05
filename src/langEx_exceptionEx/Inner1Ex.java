package langEx_exceptionEx;

public class Inner1Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class InnerEx1 {

			int a = 10;
			private int b = 100;
			static int c = 300;

			private int getA() {
				return a;
			}
			
			Inner1_1 myIn = new Inner1_1();
			public InnerEx1() {
				myIn = new Inner1_1();
			}
			// 중첩클래스의 정의 : 정의 위치가 멤버들(메서드 or 필드)가 같은 위치에 있기에 멤버 중첩클래스라고 합니다.
			class Inner1_1 {
				// Inner클래스에서도 생성자, 필드, 메서드 모두 선언 및 정의가 가능하다.
				int d = 400;

				// non static inner에선 static 필드 선언이 불가하다. 단, jdk 17 이상부터는 가능하다.
				// static final int e = 500;
				// 하지만 상수로서는 가능
				static final int e = 500;

				public void printData() {
					//inner의 메서드는 outer의 private도 마음껏 접근 가능하다.
					System.out.println("int a = " + a);
					System.out.println(getA());
					System.out.println("int b = " + b);
					System.out.println("int c = " + c);
					System.out.println("int d = " + d);
					System.out.println("int e = " + e);
				}
			}
		}
		public class Inner1Ex {

			public static void main(String[] args) {
				//Inner클래스의 인스턴스 생성 시엔 Outer.Inner타입으로 생성해야한다.
				InnerEx1.Inner1_1 inner = new InnerEx1().new Inner1_1();
				
				//아래는 위의 생성코드를 풀어서 한 예입니다.
				InnerEx1 outer = new InnerEx1();
				InnerEx1.Inner1_1 inner2 = outer.new Inner1_1();
						
				
			}
		}
	}
}
