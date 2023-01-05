package utilEx;

import java.util.ArrayList;

import oopEx1.FireBat;
import oopEx1.Ghost;
import oopEx1.Marine;
import oopEx1.Medic;

public class ArrayListEx2 {

	public static void main(String[] args) {
//		 Collection의 Generic
		/*
		 * Generic이란 jdk 1.5부터 지원하는 개념이다.
		 * Collection의 요소로 Object로 기본적으로 채웠을 떄, 채우기는 쉬우나 만약 다른 객체들이 추출되어진다면
		 * 각 객체의 특정 메서드 등을 호출할 때 문제가 발생한다.
		 * 때문에 instanceof를 이용 객체 타입을 일일히 비교하여 호출하는 방법밖에 없다.
		 * 
		 * 그래서 Generic이라는 개념을 도입해 Element요소를 한정하도록 하는게 목적이다.
		 * 문법은 <Element Type>을 선언하면 된다. 이 때 추가되는 모든 요소는 반드시 <Element Type>이어야 한다.
		 */
		Marine marine = new Marine(null, null, 0, 0);
		FireBat firebat = new FireBat(null, null, 0, 0);
		Medic medic= new Medic(null, null, 0, 0);
		Ghost ghost = new Ghost(null, null, 0, 0);
		
		ArrayList terran = new ArrayList();
		terran.add(marine);
		terran.add(firebat);
		terran.add(medic);
		terran.add(ghost);

		for(int i = 0; i<terran.size(); i++) {
			Medic m = (Medic)terran.get(i);
		}
	}

}
