package oopEx1_packageEx.sub1;

import oopEx1_packageEx.First;

public class Second extends First {

	public static void main(String[]args) {
		//다른 패키지에 있는 First 생성자 호출
		First f1 = new First();
		First f2 = new First("뿌잉뿌잉");
		
	}
}
