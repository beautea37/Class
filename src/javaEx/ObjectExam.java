package javaEx;

class Value {

	int value;

	public Value(int value) {
		this.value = value;
	}
}

class Person{
	long id; //주민번호, 사회보장번호 필드.
	
	public Person(long id) {
		this.id = id;
	}
	//상속받은 equals() 오버라이드 하기
	@Override
	public boolean equals(Object obj) {
		//두 객체의 특정 값이 같은지 비교해보기
		if(obj != null && obj instanceof Person) {
			return id == ((Person)obj).id;
		} else {
			return false;
		}
	}
}

public class ObjectExam {

	public String toString() {
		return "이건 오버라이드 된 내용이 나옴";
	}

	public static void main(String[] args) {
		// equals() : 파라미터의 객체와 같은 객체인지를 판별해 TF값을 낸다.
		Value v1 = new Value(10);
		Value v2 = new Value(10);

		if (v1.equals(v2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		v1 = v2;
		if (v1.equals(v2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		Person p1 = new Person(123);
		Person p2 = new Person(123);
		
		if(p1 == p2) {
			System.out.println("같은 사람입니다.");
		} else {
			System.out.println("다른 사람입니다.");
		}
		
		if(p1.equals(p2)) {
			System.out.println("다른 사람이지만 주민번호는 같음");
		} else {
			System.out.println("다른 사람이고 주민번호 틀림");
		}
		
		
		
		
		
		
		
		
		
		
		
		// Object의 상속된 toString() 보기
		ObjectExam objex = new ObjectExam();
		System.out.println(objex);

		System.out.println(objex.getClass().getName()); // 상속된 getClas() 호출

		System.out.println(Integer.toHexString(0).hashCode());

		System.out.println(objex.getClass().getName() + "@" + Integer.toHexString(objex.hashCode()));
		System.out.println(objex.toString());

	}

}
