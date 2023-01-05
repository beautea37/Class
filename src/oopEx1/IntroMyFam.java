package oopEx1;

public class IntroMyFam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Son s = new Son("son", "프로그래머", "대전시 유성구");
		Sister ss = new Sister("niffer", "웹디자이너", "경기도 의정부시");
		
		
		
		System.out.println(s.toString());
		System.out.println(ss.toString());
		


		
		/*
		 * 
		 *	Parent, Son, Sister 클래스 정의
		 * Parent 클래스는 이 가계도에서 시조 역할을 한다
		 * 그래서 성(Family Name)이 처음 시작되는 시점
		 * 클래스 정의 시 필드로 famlyName : String 으로 정의하고
		 * 자신을 포함 모든 자식들과 자손을 모두 성은 기본적으로 미국 Ja씨 입니다.
		 * Parent에는 위 성을 초기화 하도록 필드 및 생성자를 정의하시고
		 * Parent의 직업은 taxiDriver입니다.
		 * 
		 * doJob()메서드를 정의하고 메서드를 호출할 때마다 "내 직업은 택시운전사입니다."가 나와야 한다.
		 * 
		 * Son과 Sister는 Parent를 상속받고 추가될 필드로는 나이, 주소만 추가하셍
		 *
		 *각 두 자녀는 기본직업(즉 가업)도 상속을 받는데, 각 직업이 부모와는 틀립니다.
		 *Son은 프로그래머, Sister는 웹 디자이너
		 *
		 * 따라서 해당 클래스는 상속받은 메서드에 자신의 현재 직업이 출력되도록 오버라이드 해야합니다.
		 * 
		 * 또한 두 자녀는 기본적으로 객체 생성시 추가되는 필드는 물론 본인들의 성 또한 초기화되도록 생성자도 정의하세요
		 * 
		 * 모든 테스트는 IntroMyFam 클래스에 main()을 두시고 각 객체 생성 및 메서드 호출 등을 테스트할 수 있도록 하세요.
		 */
		
		
		
		
	}

}
