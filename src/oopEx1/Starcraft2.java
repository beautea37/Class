package oopEx1;

import oopEx1.TerranSteamPack.SteamPack;

/*
 * Interface 강의
 * 상속받은 자식 입장에서는 슈퍼타입으로 존재가능하며 다형성을 그대로 적용 가능하며 다형성을 그대로 적용 하긍하다.
 * 그래서 오버라이드가 그대로 구현이 가능하다.
 * 
 * 메서든, 무조건 추상메서드로 컴파일해야한다. 애초에 body를 만들 수가 없음.
 * 또한 모든 필드, 메서드는 자동으로 public을 부여받는다. (공유 목적이기 떄문)
 * 필드는 공유의 목적으로 사용되기 때문에 컴파일과 동시에 public static final이 부여된다. << 즉 공유 상수화 되어진다.
 *
 * 인터페이스는 클래스가 아니라서 인터페이스 간에는 다중 상속이 가능하다. 상속시에는 extends 키워드를 쓰고 ","를 이용해 부모 인터페이스를 나열한다.
 * 
 */
public class Starcraft2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Terran marine = new Marine("Jason", "이병", 60, 60);
		   Terran firebat = new FireBat("불쏘시개", "상병", 40, 70);
		   Terran medic = new Medic("Julia", "하사", 50, 0);
		   
			((Attackable) marine).attack("저그");
			((Attackable) firebat).attack("저그");
					
			((Moveable) medic).move(100, 100);
			
			TerranSteamPack.SteamPack steamPack = new SteamPack(marine);
			TerranSteamPack.SteamPack steamPack2 = new SteamPack(firebat);
			
			steamPack.steamPack();
			steamPack2.steamPack();
			
			Ghost ghost = new Ghost("유령", "대위", 30, 20);
			ghost.nuclearLaunch(550, 350);
			
	}

}
