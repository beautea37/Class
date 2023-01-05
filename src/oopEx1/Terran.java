package oopEx1;
	/*
	 * 자바추상화(Abstraction) : 특정 메서드가 자신을 위한 것이 아닌 오로지 상속만을 위한 것으로 생각했을 때 해당 메서드를 추상화할 수 있다.
	 * 이렇게 추상화된 메서드를 추상메서드라고 하고 이 메서드는 abstract라는 키워드를 통해 선언한다.
	 * 
	 * 이렇게 클래스 내에 추상메서드가 하나 이상 포함된다면 해당 클래스는 명시적으로 추상 클래스로 선언이 되어야 합니다.(안그러면 컴파일 에러)
	 * 
	 * 이렇게 추상메서드로 선언이 된 클래스는 그 이후로 절대 자신의 인스턴스를 생성할 수 없습니다.
	 * 
	 * 하지만 상속 및 다형성 등은 유지할 수 있다.
	 * 참고로 자신의 인스턴스를 못만든다는 말은 생성자를 정의할 수 없다는 뜻이 아닙니다.
	 * 생성자가 없으면 자식 인스턴스도 못 만드니 당연히 상속도 불가하다.
	 * 
	 * 따라서 자신의 인스턴스르 못 만들 뿐, 나머지는 모두 같다.
	 * 또한, 추상 클래스를 상송받은 자식 클래스는 부모가 선언한 추상 메서드를 명시적으로 오버라이드 해야한다.
	 * 그렇지 않을경우 자식도 무조건 추상클래스화 되어야 하한다.
	 */
public abstract class Terran extends Object {
	   /*
	    * final 키워드 : final 은 클래스, 멤버필드, 메서드, 메서드 파라미터,메서드 바디 내 어디에도 사용할 수 있습니다.
	    * 이름에서도 알 수 있듯이, final 키워드는 뭔가를 고정 시키는 역할을 합니다.
	    * 클래스에 넣으면 상속금지, 메서드에 붙으면 오버라이드금지, 필드에 붙으면 고정값(상수화)
	    * 메서드 파라미터에 붙으면 메서드 내부에서 상수화 의미로 쓰입니다.
	    * 
	    * 일반적으로 자바에서는 상수로 사용될때는 공유의 목적으로 static 과 같이 사용되어집니다.
	    */
//	final static  int All_UNIT_MIN_HP= 0;
//	final int MARINE_MAX_HP = 60;
//	final int FIREBAT_MAX_HP= 40;
//	final int MEDIC_MAX_HP= 40;
//	final int GHOST_MAX_HP= 40;
   /*
    * 테란이라는 유닛은 실제 존재하기 낳기에 이 클래스에는 테란 유닛이 발생시
    * 어떤 유닛인지를 판별하는(마린,파이어뱃 등) 속성 하나만 선언할게요.
    */
//	Public Terran() {
//		super();
//	}
   public String theUnit;//생성된 유닛이 어떤 애인지 알려주는 속성
   //내 자식 객체가 생성 시에 타입을 초기화 하기 위해 생성자를 정의한다.

   public Terran(String theUnit) {
	   this.theUnit = theUnit;
   }
   
//	  모든 유닛은 기본적으로 소리로 리액션을 할 수 있도록 상속 목적으로 sound()를 정의한다.
//   이 메서드는 Terran 입장에서 보면 내용부를 정의할 수 없다.
//   때문에 상속을 목적으로만 존재하므로 추상화의 대상이 된다.
//   추상메서드는 abstract 키워드와 함께 선언만 할 수 있다.
//   즉 내용부(메서드 바디)는 가질 수 없다.
   public abstract void sound()	;
//	   System.out.println("리액션 ㄱㄱ");
   //해당 유닛이 어떤 유닛인지 타입을 문자열로 리턴하는 toString() 정의
   public String toString() {
	   return "이 유닛은 " + theUnit;
   }
   //이 메서드는 객체의 타입 값을 리턴해주도록 정의한다.
   public String getTheUnit() {
	   return theUnit.substring(theUnit.lastIndexOf(""));
   }
}