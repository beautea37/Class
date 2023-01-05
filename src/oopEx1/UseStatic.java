package oopEx1;

public class UseStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static으로 선언된 필드, 메서드 호출법
		StaticExam.showA();							//정석적인 Static호출 방법이다.
		new StaticExam().showB();
		new StaticExam().showA();				//이런 방식(객체를 불러오는 편법?)으로도 가능은 하다. 하지만 정상적인 절차는 아니라고 한다.
		
	}

}
