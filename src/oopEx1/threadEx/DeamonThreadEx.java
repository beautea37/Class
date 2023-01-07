package oopEx1.threadEx;

public class DeamonThreadEx implements Runnable {
	
	static boolean autoSave = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new DeamonThreadEx());
		
		//데몬쓰레드로 설정합니다...........
		t.setDaemon(true);
		t.start();
		
		for(int i = 0; i<=10; i++) {
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println(i);
			
			//5초마다 저장쓰레드가 flag확인하여 저장기능 수행.
			if(i % 5 ==0)
				autoSave = true;
		} System.out.println("메인 종료됨. 부모쓰레드 종료)");
	}
	//아래 run()은 무한루프를 돌며 5초마다 자종저장됨이라는 메시지를 출력하게끔 한다.
	public void run() {
		while (true) {
			try{
				Thread.sleep(5*1000);
			}catch (InterruptedException e) {
				// TODO: handle exception
			}
			if(autoSave == true)
				autoSave();
			System.out.println("저장 완료");
			
		}
	}
	private void autoSave() {
		// TODO Auto-generated method stub
		
	}
}
