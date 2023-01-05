package oopEx1;

public class Terran {

	/*
	 * 테란 이라는 유닛은 실제 존재하지 않기에 이 클래스에는
	 * 테란 유닛이 발생시 어떤 유닛인지를 판별하는(마린, 파이어벳 등)
	 * 속성 하나만 선언 할게요.
	 */
	
	public String theUnit;//생성된 유닛이 어떤 애인지 알려주는 속성
	
	//내 자식 객체가 생성시에 타입을 초기화 하기 위해 생성자 정의 합니다.
	
	public Terran(String theUnit) {
		this.theUnit = theUnit;
	}
	
	//해당 유닛이 어떤 유닛인지 타입을 문자열로 리턴하는 toString() 정의
	public String toString() {
		return "이 유닛은 " + theUnit;
	}
}
