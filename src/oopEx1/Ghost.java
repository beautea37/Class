package oopEx1;

public class Ghost extends Terran implements GhostAbility {

	private String name;// 마린의 이름
	private String rank;// 계급
	private int hp;// 피통
	private int damage;//

	public Ghost(String name, String rank, int hp, int damage) {
		// TODO Auto-generated constructor stub
		super("테란");
		this.name = name;
		this.rank = rank;
		this.hp = hp;
		this.damage = 60;
	}
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Ghost says : There's No One Here!");
		
	}
	
	public String toString() {
		return "이름은 " + this.name + " 계급은 " + this.rank + " HP : " + this.hp + " 공격력 : " + this.damage;
	}
	
	public void getHealing(int hp) throws InterruptedException {
		while (true) {
			if (this.hp == 40) {
				return;
			}
			Thread.sleep(1000);
			this.hp += hp;
			System.out.println(this.name + this.rank + "이 치료를 받고있습니다.");
			System.out.println("+" + hp + " 증가");
		}
	}
//	public void move(int x, int y) {
//		System.out.println(this.name + "이 " + "[" + x + ", " + y + "]로 이동했습니다.");
//	}
	
	@Override
	public void attack(String target) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void nuclearLaunch(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("핵폭탄을 " + x + ", " + y + "좌표에 떨어뜨립니다.");
	}
	
	
}
