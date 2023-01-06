package oopEx1.threadEx;
	/*
	 * run() 내부의 로직이 의미없는(연산을 하지 않는) 반복작업을 수행할 시엔 yield()를 호출해 자신을 대기상태로 전화?하도록 하고,
	 * 타 쓰레드에게 cpu점유를 양보하도록 제어하는 메서드입니다.
	 * 
	 * join()과 다른 점은 join()은 외부에서 호출하는 형태로 제어를 하지만
	 * yield()는 로직 내부에서 직접 제어하는 형태. 즉, 루프 드으이 조건에 따라서 yield()를 호출하게끔 하는 것이다.
	 */

class WorkerThread extends Thread{
	public boolean work = true;
	
	public WorkerThread(String name) {
		setName(name);
	}
	public void run() {
		while(true) {
			if(work)	{ //상태값에 따른 루프 분기작업. 즉 work가 true시에만 이 연산을 한다.
				System.out.println(getName() + "쓰레드가 연산을 수행한다.");
			} else {
				//이 조건에서는 아무것도 할게 없으니 다른 쓰레드에게 점유를 양보한다는 얘기.
				Thread.yield();
			}
		}
	}
}

public class YieldThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * WorkerThread 2개를 생성해서 하나에게는 루프의 flag값을 false로 주고 이후에 경쟁쓰레드가 cpu점유하는 상황을 봐라
		 * 이후 다시 flag를 true로 주면 다시 경쟁사애톨 넘어가게 된다. 이렇게 되는 이유는 내부적으로 yield()를 호출해서 그렇다.
		 */
		WorkerThread wThread1 = new WorkerThread("워커1");
		WorkerThread wThread2 = new WorkerThread("워커2");
		
		wThread1.start();
		wThread2.start();
		
		try {
			Thread.sleep(5000);
			
		}catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		wThread1.work = false; //<--쓰레드의 while()에서 else절로 빠지고, yield()를 호출해 실행대기로 양보시킨다.
		
		try {
			Thread.sleep(5000);
			wThread1.work = true;
		}catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
