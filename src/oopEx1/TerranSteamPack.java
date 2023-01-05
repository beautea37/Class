package oopEx1;

/*
 * @author manic-002
 */
public interface TerranSteamPack {
//	인터페이스 내부에는 목적에 따라 클래스를 정의할 수 있다. 이러한 클래스를 중첩(Nested)클래스라고 하는데
//	나중에 따로 다시 공부할 것.
//	여튼 지금은 inner Class를 정의해서 외부에서 해당 클래스를 객체화하여 구현할 수 있도록 할 예정

//마린과 파이어뱃이 스팀팩이 사용 가능하다.
	class SteamPack {
		Terran terran;
		public SteamPack(Terran theUnit) {
			if(theUnit instanceof Terran)
					this.terran = theUnit;
		}
		public void steamPack()	{
			System.out.println("스팀팩을 이용해 공격합니다. 체력 -10%, 공격력 +10%");
		}
	}
}
