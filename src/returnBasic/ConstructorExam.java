package returnBasic;

//부모 클래스가 될 기본 클래스를 정의해봅니다.

class Parent {
	private String myName; // 이름 멤버변수
	private int age; // 나이 멤버 변수

	public Parent(String myName, int age) {
		super(); // Object의 기본 생성자 호출
		this.age = age;
		this.myName = myName;
	}

	public void myJob() {
		System.out.println("Parent클래스의 직업은 어부");
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class Son extends Parent {
	private String myJob;

	public Son() {
		super(null, 0); // Parent 기본 생성자 호출
	}

	public void myJob() {
		System.out.println("Son 클래스의 직업은 무엇");
	}
}

class UserEmail {
	private String email;

	public UserEmail(String email) {
		this.email = email;
	}

	// email값을 리턴하는 getter 만들기.
	public String getEmail() {
		return email;
	}
}

public class ConstructorExam {

	UserEmail email;

	public static void main(String[] args) {

		Son son = new Son(); // Son의 기본 인스턴스 생성
		Object object = son; // Ref를 복사해 넘겨줌.
		Parent parent = (Parent) object; // Object Ref하는 값을 parent에게 넘겨주는거
		Parent p2 = new Son();

//		parent = null;
//		son = null;
//		p2 = null;
//		object = null;

		System.out.println(object.equals(son)); // true 나온다.
		System.out.println(object.equals(p2)); // false 나온다.

		((Parent) object).myJob();

		if (son == object) {
			// rtype에서 ==는 같은 객체니?라는 뜻이 된다.
			System.out.println("같은 객체다");
			System.out.println(son);
			System.out.println(object);
		}

	}

}
