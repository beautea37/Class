package langEx_exceptionEx;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//익명 클래스. 말그대로 이름이 없는 클래스
//이 뜻은 특정 클래스 또는 인터페이스 타입에 적용된 메서드나 생성자에 바로 클래스르 정의 후 특정 메서드를 호출하는 방식이다

//이렇게 정의도니 클래스는 익명으로 처리되어 생성 및 작업 후 사라지게 되는 형태이다.

interface TestAnonyInner {
	int data = 10000;

	void printData();

	void yourMethod();
}

class UseAnonyInner {
	public void test() {
		new TestAnonyInner() {
	
		
	public void yourMethod() {
		
	}
	public void printData() {
		System.out.println(data);
	}
		}.printData();
	
		
	}
}

//ActionListener를 구현하는 클래스 정의. 내가 해당 타입의 클래스가 된다.
class MyActionListen implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("사용자가 버튼을 눌렀다.");
		System.exit(0);
	}
}
public class AnonyInnerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseAnonyInner u = new UseAnonyInner();
		u.test();
		
		Frame f = new Frame("새해복~");
		f.setSize(300,300);
		Button button = new Button("닫기");
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("이건 익명클래스에서 호출됨.");
				System.exit(0);
			}
		});
		
//		button.addActionListener(new MyActionListen());
		f.add(button);
		f.setVisible(true);
		
	}

}
