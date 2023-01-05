package oopEx1;

public class StarCraft {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/*
		 * 객체지향의 다형성(Polymorphism)이란 "상속"관계에서 생성된 인스턴스를 ref하는 형태가 다양하게 변경될 수 있음을 으미한다
		 * 
		 * 이 말을 다시 풀어보면, 우리가 Ptype에 배웠던 프로모션과 캐스팅과 같습니다. 상속관계에서 자식의 인스턴스를 생성 또는 이미 생성된
		 * 인스턴스를 Ref할 때 부모타입으로 가능한데, 이 때 생성된 인스턴스는 해당 클래스의 생성자를 호출하여 생셩되었기 때문에 메모리에서
		 * 사라지기 전까지는 인스턴스 타입은 불변입니다.(중요!!)
		 * 
		 * 이렇게 다형성으로 생성된 또는 Ref된 인스턴스의 메서드 or 변수를 호출할 때는 무조건 오버라이드된 애들이 호출되어진다.
		 * 
		 * 하지만 인스턴스에만 정의된 메서드를 호출할 시 컴파일 에러가 유발된다. 이유는 Ref하는 변수타입에는 해당 내용이 없기 때문이다.
		 * 
		 * 이렇게 다형성을 구현하는 이유는 상속관계에서 자식들이 상속받은 메서드를 자신의 목적에 맞게 오버라이드 했을 경우, 어떤 타입이건 상관없이
		 * 동일하게 부모 타입으로 Ref해서 오버라이드 된 메서드를 호출할 때, 즉 메서드명은 하나로 통일하되, 내용부는 인스턴스에 적용된 내용이
		 * 나오도록 하는 데에 목적이 있다.
		 * 
		 * 꼭 기억해야할 것은 부모타입으로 Ref하던 인스턴스를 생성하던 생성된 인스턴스의 타입은 절대 불변이라는 것이다.
		 */
		Terran marine = new Marine("Jason", "이병", 60, 60);
		Terran firebat = new FireBat("불쏘시개", "상병", 40, 70);
		Terran medic = new Medic("Julia", "하사", 50, 0);

		((Attackable) marine).attack("저그");
		((Attackable) firebat).attack("저그");
				
//		((Moveable) medic).move(100, 100);
//
//	      marine.sound();
//	      firebat.sound();
//	      medic.sound();
//	      
//	      ((Marine)marine).move(100, 100);
//	      
//	      //타입 변경을 해봅시다. 즉, 마린 인스턴스의 Ref타입을 원형으로 변경해봅니다.
//	      Marine ma = (Marine)marine;
//	      Object obj = ma;
//	      ma=(Marine) obj;
//	      medic = (Medic)obj;

		// Terran terran = new Terran("테란"); //테란이라는 유닛은 없지만 객체 테스트용으로 만드는 중
		// 마린 클래스를 정의했기 때문에, 객체를 만들고 싶은만큼 생성할 수 있습니다.
		// 객체 생성 코드는 ClassName ref 변수 = new ClassName(); 처럼 할 수 있습니다.
//      Marine m1 = new Marine("Jason", "이등병", 40, 30);//Instance 화 하는단계 즉, 객체를 생성하는 코드입니다.
//      FireBat f1 = new FireBat("불추장", "상병", 60, 80);
//      Medic md1 = new Medic("간호사", "하사", 60, 0);

//      System.out.println(m1.toString());
//      System.out.println(f1.toString()); 
//      System.out.println(md1.toString());

//      md1.healing("마린찡");

		Terran[] allUnit = { marine, firebat, medic};
		for (int i = 0; i < allUnit.length; i++) {
			Terran theUnit = allUnit[(int) (Math.random() * allUnit.length)];
			// 리턴되는 유닛을 모두 300, 300 지점으로 이동시켜보세요.
			// theUnit.sound();
//    	  if(theUnit instanceof Medic) {
//    		  ((Medic)theUnit).healing("마린");  
//    		  
//    	  }

			if (theUnit instanceof Marine) {
				((Marine) theUnit).move(300, 300);
			} else if (theUnit instanceof FireBat) {
				((FireBat) theUnit).move(300, 300);
			} else {
				Medic m = (Medic) theUnit;
				m.move(300, 300);
				m.healing("마린");
			}

//          System.out.println(m1 instanceof Marine);
//          System.out.println(f1 instanceof FireBat);
//          System.out.println(md1 instanceof Medic);
		}

		// 해서 정확한 문법적 표현은 Instantiation 이라고 합니다.
		// 위에서 Marine()이 호출된 이후엔 Marine 클래스의 인스턴스가 생성되고
		// 해당 인스턴스는 JVM 이 괸리하는 heap 메모리 영역에 저장되어집니다.
//      Marine m2 = new Marine("Jackson", "병장", 20, 50);
//      m2.getHealing(1);
//      m1.name = "Jason";
//      m1.hp = 40;
//      m2.name = "Jackson";
//      m2.hp = 40;

//      System.out.println(m1.toString());
//      System.out.println(m2);
//      
//      m1.move(100, 100);
//      m2.move(110, 110);
	}

}
