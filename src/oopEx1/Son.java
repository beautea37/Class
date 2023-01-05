package oopEx1;

public class Son extends Parent {
	private String name;
	private String job;
	private String addr;

	public Son(String name, String job, String addr) {
		super("미국 Ja");
		this.name = name;
		this.job = job;
		this.addr = addr;

	}

	public String toString() {
		return super.toString() + this.name + "아들의 직업은 " + this.job + ", 주소는 " + this.addr;
	}

	public void dojob() {
		System.out.println("프로그래머");
	}
}
