package basic;

public class TypeCastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//타입 프로모션 : 작은 타입을 큰 타입에 대입하는 형태. 쌉가능
		//타입 캐스팅(Casting) : 큰 타입을 작은 타입에 대입할 때 사용되는 연산자를 이용해 대입하는 형태.
		byte b = 1; short s; int i; long lo; float f; double d;
		//타입 프로모션
		s = b;
		i = s;
		lo = i;
		f = lo;
		d = f;
		//작은 타입을 큰 타입에 적용
		
		f=(float)d;		
		lo=(long)f;		
		i=(int)lo;		
		s=(short)i;		
		b=(byte)s;
		//역순인 것.
		
		d = 3.14; // 3.14를 int i2에 값을 넣고 결과를 출력한다고 했을 때 좌항의 우항의 double을 int로 출력하는 것이기 때문에 
		int i2 = (int) d; //라고 하면 된다.
		System.out.println("정답은 " + i2);
		
		System.out.println(Integer.toBinaryString(128));
		System.out.println("10000000".length());
		
		b = (byte)128;
		System.out.println(b);
	}

}
