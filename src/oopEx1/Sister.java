package oopEx1;

public class Sister extends Parent {
	private String name;
	private String job;
	private String addr;

	public Sister(String name, String job, String addr) {
		super("미국 Ja");
		this.name = name;
		this.job = job;
		this.addr = addr;

	}

	

	public String toString() {
		return super.toString() + this.name + "딸의 직업은 " + this.job + ", 주소는 " + this.addr;
	}

	public void dojob() {
		System.out.println("웹디자이너");
	}
}
