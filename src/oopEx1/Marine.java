package oopEx1;

//이 클래스는 마린을 정의한 클래스입니다.
//클래스에는 크게 3가지를 정의 할 수 있는데, 속성, 생성자 ,메서드입니다
//일반적으로 정의 순서는 위 순으로 합니다.
 public class Marine extends Terran implements Attackable{
	 //	클래스에는 public or dafault 만 존재합니다.
	// public > protected > default > private ==> 접근제어자(Access Modifier)
	// 속성정의//Fields --> 객체를 구성하는 속성.. 즉 개체속성 멤버필드.
	private static final int All_UNIT_MIN_HP = 0;
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

//	public Marine() {  //Default 생성자. 컴파일러가 넣어주는 기본 생성자가 어떤 역할을 하는지 코드로 정의
//	  name = null;
//	  rank = null;
//	  hp = 0;
//	  damage = 0;
//  }
	
	
	public Marine(String name, String rank, int hp, int damage) {
		super("테란");
		this.name = name;
		this.rank = rank;
		this.hp = hp;
		this.damage = damage;
	}
// 부모에게 상속받은 메서드의 내옹부만 재정의해서 자식에게 맞게 정의한 것을 객체지향에선 메서드 오버라이드(oVERRIDE)라고 합니다.
//	반드시 지켜야할 조건 : 접근제어자는 부모보다 같거나 커야하며 리턴타입, 시그니처는 반드시 동일해야 한다.
	
	public String toString() {
		return "이름은 " + this.name + " 계급은 " + this.rank + " HP : " + this.hp + " 공격력 : " + this.damage;
	}
	
	   public void sound()	{
//		   implements는 추상 메서드에 내용부 {}를 정의한 형태를 말한다.
//		   만약 상속받은 메서드의 {body}가 이미 존재하는 경우 
//		   그 내용부만 변경할 때 재정의(Override)했다라고 하고 
//		   그렇지 않은 경우(메서드가 선언만 된경우)에 내용을 정의한 형태를 메서드 구현(implements)했다 라고 한다.
		   System.out.println("Gogogo");
	   }
	  
	// 이동하는 기능인 move 메서드를 정의한다.
	public void move(final int x, final int y) {
		
		System.out.println(this.name + "이 " + "[" + x + ", " + y + "]로 이동했습니다.");
	}
	
	
	
	
	

	public void getHealing(int hp) throws InterruptedException {
		while (true) {
			if (this.hp == Marine.All_UNIT_MIN_HP) {
				
				System.out.println("마린이 죽었습니다.");
				
			}		

			Thread.sleep(1000);
			this.hp += hp;
			System.out.println(this.name + this.rank + "이 치료를 받고있습니다.");
			System.out.println("+" + hp + " 증가");
		}
	}
	@Override
	public void attack(String target) {
		System.out.println(super.getTheUnit() + "이(가) " + target + "을 총으로 공격합니다.");
	}

//	 public void move(int x, int y) {
//			System.out.println(this.name + "이 " + "[" + x + ", " + y + "]로 이동했습니다.");
//		}
}