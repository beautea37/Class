package forTeam;
/*
 * 공유객체 내부에 동기화 메서드와 블럭이 여러개면 쓰레드가 이중 하나를 점유(실행)을 하면
 * 다른 쓰레드는 해당 메서드와 다른 동기화 블럭 메서드 또한 접근이 차단된다.(객체에 lock걸림)
 * 하지만 일반 메서드는 수행이 가능하다.
 * 
 * 쓰레드와 동기화메서드를 실행하는 즉시 객체엔 Lock, 수행 후엔 Lock해제, 이 때 대기중인 쓰레드는
 * 잘못하면 데드락(Dead lock)상태에 빠질 수 있으며 이 땐 아무 것도 하지 못하는 상태가 될 수 있다.
 * 
 * 만약 메서드 전체에 동기화를 걸지 않고 일부만 적용하고 싶을 때 동기화 블럭을 사용한다.
 * 형식은 >>>> void someMethod(){synchronized(공유객체){동기화 적용 로직}
 */

/*
아래 클래스는 잔액을 계산하는 기능을 가진 클래스다.
각각의 메서드를 통해 하나느 금액을 set, 하나는 get하도록 해야한다.
이 때 이 객체를 다중의 쓰레드가 접근하면서 각기 다른 메서드를 호출하면 오류된 값이 나오는데,
이를 동기화 메서드와 블럭을 이용해 적절히 제어해야한다.
*/

class Calculator {
	private int money;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " : " + this.money);
	}// end of set money

	public synchronized void setMoney2(int money) {
//		synchronized (this) { // 자신이 공유객체임을 선언하는 것.
//			this.money = money;

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " : " + this.money);
		}
	}// end of set money2
//}

//아래는 공유객체인 Calculator를 이용하는 쓰레드 정의
class User1Thread extends Thread {
	private Calculator calculator;

	public User1Thread() {
		setName("User1Thread");

	}

	public void setCalculater(Calculator cal) {
		this.calculator = cal;
	}

	public void run() {
		calculator.setMoney(50);
	}
}

class User2Thread extends Thread {
	private Calculator calculator;

	public User2Thread() {
		setName("User2Thread");

	}

	public void setCalculater(Calculator cal) {
		this.calculator = cal;
	}

	public void run() {
		calculator.setMoney2(500);
	}
}

public class SyncExam2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 공유객체 생성
		Calculator cal = new Calculator();

		// call 객체를

		User1Thread u1 = new User1Thread();
		u1.setCalculater(cal);
		u1.start();
		User2Thread u2 = new User2Thread();
		u2.setCalculater(cal);
		u2.start();

	}

}
