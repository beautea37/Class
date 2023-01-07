package oopEx1.threadEx;

import javax.swing.JOptionPane;

public class WhyMulti {

	public static void main(String[] args) {
Thread countThread = new Thread() {
			
			public void run() {
				for (int i = 10; i>0; i--) {
					System.out.println(i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
						
					}
				}
			}
		};
		countThread.start();
		String input = JOptionPane.showInputDialog("아무 값이나 입력");
		System.out.println("입력한 값은 " + input + "입니다.");

		//아래는 쓰레드가 위의 입력을 기다리는 동안 블락킹 상태가 되어 아무 것도 못하는 것을 구현한 예제
		//이를 극복하기 위해 카운트하는 쓰레드를 정의해 각각 실행해보자.
		
		
//		for(int i = 10; i>0; i--) {
//			System.out.println(i);
//			
//			/*
//			 * 아래 쓰레드 메서드는 주어진 millis만큼 실행중인 쓰래드를 실행대기로 만들어주는 메서드. 알려진 예외가 throws되었기에 반드시
//			 * 핸들링하세요.
//			 */
//			try {
//				Thread.sleep(1000*10);
//			}catch (InterruptedException e) {
//				// TODO: handle exception
//				e.printStackTrace();
//			}
//		}
	}
}
