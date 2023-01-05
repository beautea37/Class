package oopEx1;


//이 클래스는 마린을 정의한 클래스입니다.
//클래스에는 크게 3가지를 정의 할 수 있는데, 속성, 생성자 ,메서드입니다
//일반적으로 정의 순서는 위 순으로 합니다.
public class FireBat extends Terran implements Attackable {// 클래스에는 public or dafault 만 존재합니다.
	// public > protected > default > private ==> 접근제어자(Access Modifier)
	// 속성정의//Fields --> 객체를 구성하는 속성.. 즉 개체속성 멤버필드.
	private String name;// 마린의 이름
	private String rank;// 계급
	private int hp;// 피통
	private int damage;//

	// 객체의 정보를 외부에 표시하는 interface 역할을 하는 메서드를 정의한다.
	// 왜 이래 되는지 나중에 알게 된다.

	/*
	 * 생성자 생성자는 클래스가 인스턴스화 될 때 JVM을 호출하는 일종의 메서드와 같은 코드 위처럼 메서드와 같다는 말은 ()를 가지고 있다는
	 * 말인데, 틀린 점은 리턴타입을 선언해서는 안되고(하면 메서드됨) 생성자 명은 반드시 클래스명과 같아야 한다. 만약 생성자를 하난도
	 * 저으이하지 않은 경우엔 컴파일시 컴파일러가 기본생성자(DEFAULT)를 자동으로 클래스에 젛어준다. 하지만 하나라도 정의하면 컴파일러는
	 * 제공하지 않는다.
	 */

//	public FireBat() {  //Default 생성자. 컴파일러가 넣어주는 기본 생성자가 어떤 역할을 하는지 코드로 정의
//	  name = null;
//	  rank = null;
//	  hp = 0;
//	  damage = 0;
//  }
	
	
	
	public FireBat(String name, String rank, int hp, int damage) {
		super("테란");
		this.name = name;
		this.rank = rank;
		this.hp = hp;
		this.damage = 60;
	}

	public String toString() {
		return "이름은 " + this.name + " 계급은 " + this.rank + " HP : " + this.hp + " 공격력 : " + this.damage;
	}
	   public void sound()	{
		   System.out.println("Need a light, sir");
	   }
	// 이동하는 기능인 move 메서드를 정의한다.
//	public void move(int x, int y) {
//		System.out.println(this.name + "이 " + "[" + x + ", " + y + "]로 이동했습니다.");
//	}
//
//	public void getHealing(int hp) throws InterruptedException {
//		while (true) {
//			if (this.hp == 40) {
//				return;
//			}
//			Thread.sleep(1000);
//			this.hp += hp;
//			System.out.println(this.name + this.rank + "이 치료를 받고있습니다.");
//			System.out.println("+" + hp + " 증가");
//		}
//	}

	   @Override
	   public void attack(String target) {
			System.out.println(super.getTheUnit() + "이(가) " + target + "을 지지는 중입니다.");
		}
	   
	   
	   public void move(int x, int y) {
			System.out.println(this.name + "이 " + "[" + x + ", " + y + "]로 이동했습니다.");
		}
}