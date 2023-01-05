package basic;


/*코딩 시 보라색은 모두 키워드이다. 따라서 변수나 메서드 명으로 절대 사용불하다.
 * 아래 클래스 옆에public은 option이다. 넣거나 빼거나 문제는 없지만 후에 패키지라는걸 배우면 의미를 알게된다.
 * 
 * 클래스이름 명명법 : 아래의 class옆에 있는 이름을 클래스명이라 한다.
 * 이름은 반드시 * 1000000000 첫 자는 대문자로 시작해야 하고 한 단어 이상 연결 시 새 단어의 첫 단어는 대문자이다.
 * "-"(언더바)와 $를 사용할 수 있지만 아무도 사용하지 않는다.
 * 
 * 모든 변수, 클래스, 메서드 이름에는 첫 문자로 숫자가 올 수 없다.
 * 
 * 아래의 클래스 이름이 소스코드의 파일명과 반드시 일치해야 한다.(대소문자까지)
 */
	public class FirstJava {
			/*
			 * 자바에서는 변수를 사용할 때 반드시 값이 초기화되어 있어야 한다.
			 * 초기화란 초기화 또는 값이 존재해야 한다는 뜻
			 * 변수를 처음 선언할 때  반드시 변수명 옆에 타입이 선언되어야 한다.
			 * 이렇게 선언된 변수는 해당 타입만 값을 넣을 수 있다.
			 */
		public static void main(String[] args) {  //메서드 바디라 함
			 
				byte a, b; // a라는 지역변수 선언(declared)(메서드 내에서 처음 선언된 변수를 지역변수라고 함)
				a = 1;
				b = 1;
				byte c = 1;
				
				short s = 1000; //short 타입은 자바에서 2byte이다.
				a = 10;
				int i = 1;
				
				//연산자를 만났을 경우엔 두 타입을 비교해서 default보다 작으면 default타입으로 변환 후 연산한다. 당연히 결과 타입도 default
				//default보다 큰타입의 연산인 경우 무조건 큰 타입으로 리턴된다.
				i = a + b;
				long lo = 1L;
				//int it= lo + 1; << lo가 int보다 큰 타입이기 때문에
				long it = lo + 1; //로 타입을 long으로 바꿔줘야 한다.
				
				float f = 3.14F;
				//lo = f;의 경우 'float를 long에 맞춘다'라고 해석할 수 있는데, 여기서 float이 long보다 큰 개념이기 때문에 맞출 수 없다. 그래서
				f = lo; //라고 작성해야한다.
				
				

			
			/*
			 * java Data Type  
			 * 1. 수치형(정수) : byte(1byte) > short > int(default) > long(8byte)
			 * 2. 수치형(실수) : float(4byte) > double(8yte, default)
			 * 3. 문자형(char) : char(2byte)
			 * 4. 논리형(boolean) : true or false
			 * 
			 * 위 네 개의 자료형을 자바에서는 원시자료형, Primitive Type이라고 한다.
			 * 
			 * 5. 객체형(Reference Type)
			 */
		}	
}
