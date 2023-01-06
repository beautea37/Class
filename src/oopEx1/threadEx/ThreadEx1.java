package oopEx1.threadEx;

/*
쓰레드 생성하는 법
1. 내 자신이 쓰레드를 상속받는 방법
2. 그냥 쓰레드 객체를 생성해 run()을 구현하는 방법(익명 클래스 정의법)
3. Runnable type으로 생성해 Thread(Runnable)에 탑재하는 법
위 3개 중 뭐가 됐던 반드시 run()을 오버라이드해야하ㅏ며 Runnable 상태로 정이되기 위해서는 반드시 start()를 호출해야 한다.

*/
class ThreadEx1_1 extends Thread { // 쓰레드를 상속했기 때문에
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			System.out.println("Clase1 쓰레드 이름 : " + i);
		}
	}
}

class ThreadEx1_2 extends Thread { // 쓰레드를 상속했기 때문에
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			System.out.println("Case2 쓰레드 이름 : " + getName());
		}
	}
}

class MyThread implements Runnable {
	public void run() {
		System.out.println("이건 runnable 타입의 스레드 내용입니다.");
	}
}

public class ThreadEx1 {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName() + "이 수행 시작.");

		// thread객체 생성
		ThreadEx1_1 t1 = new ThreadEx1_1();
		ThreadEx1_2 t2 = new ThreadEx1_2();
		
		////한방코드
//		Thread t3 = new Thread(new MyThread());
		MyThread my = new MyThread();
		Thread t3 = new Thread(my);
		
		//익명클래스를 이용한 
		Thread t4 = new Thread(new Runnable() {
			
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("여긴 main()에서 수행된 쓰레드의 내용" + Thread.currentThread().getName());
				}
			}
		});
		t4.setName("t4 쓰레드");
		
		Thread t5 = new Thread() {
			public void run() {
				System.out.println("여긴 t5 쓰레드입니다." + getName());
				
			}
		};
		t5.start();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// thread 시작
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		System.out.println(Thread.currentThread().getName() + "이 뿌잉뿌잉."); /// 테스트용
		for (int i = 0; i < 5; i++) {
			System.out.println("main : " + i);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}
}
