package oopEx1_packageEx;
import javax.swing.JOptionPane;

import oopEx1.Marine;
public class First {
	
	public String name;
	protected String addr;
	String password;
	
	
	//이 생성자는 public 이기에 다른 패키지에서도 호출이 가능하다.
//	public First() {
//		
//	}
	
	//이 생성자는 protected이기에 같은 패키지에서는 호출 가능하나 다른 패키지에선 오로지 자식 클래스만 호출 가능하다.
	protected First(String name) {
		this.name = name;
	}
	//이 생성자는 default이기에 같은 패키지에서만 호출 가능하다. 다른 패키지에선 호출 불가능하다.
	First(String addr, String password){
		this.addr = addr;
		this.password = password;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	protected void setAddr(String addr) {
		this.addr = addr;
	}
	void setPassword(String password) {
		this.password = password;
	}
	
	public static void main(String[] args) {
	
/*
 * 접근제어자(AccessModifier) : 접근제어자는 public > protected > deault > private 순이다.
 * 사용 범위는 public과 default는 클래스도 가능, 공통 네 개는 필드, 생성자, 메서드
 * 
 * 접근제어자를 선언하지 않을 시 컴파일러는 기본적으로 default(이름없는) 접근제어자를 넣어줍니다.
 * 
 * public은 패키지 쿠분없이 모두에게 참조 가능한 형태를 뜻하며 protected는 같은 패키지 내에선 접근 가능, 다른 패키지에서는 상속받은 자식 클래스만 가능
 * default는 같은 패키지에서만 가능
 * private은 오로지 자신의 클래스에서만 가능
 */

	}

}
