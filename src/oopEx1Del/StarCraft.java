package oopEx1;

public class StarCraft {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//테란 유닛은 실제 없지마, 객체 테스트 용으로 만들어봄..
		//Terran terran = new Terran();
		
		Marine m1 = new Marine("Jason","이등병",40,60);//Instance 화 하는 단계 즉,
		FireBat f1 = new FireBat("불추장", "상병", 60, 80);
		Medic md1 = new Medic("간호사","하사",60,0);
		
		System.out.println(m1);
		System.out.println(f1);
		System.out.println(md1);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
