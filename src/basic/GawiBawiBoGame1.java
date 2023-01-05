package basic;

import javax.swing.JOptionPane;

/*
 * 가위바위보게임을 만드세요.
 * 조건은 아래와 같습니다.
 * 
 * 1. 프로그램 시작하면 게임 하실래요(y/n)? 라고 묻고 y 입력시 게임 시작됩니다.   ddddd
 * 2. 시작되면 사용자에게 값을 입력토록 하세요(가위, 바위, 보 중 하나)			ddddd
 * 2. 만약 위 값이 아닌 다른값이 들어오면 "틀린 값입니다" 출력후 프로그램 종료.		ddddd
 * 3. 만약 올바른 값이 입력되면, Math.random() 을 이용해서 1 ~ 3 까지 생성하세요
 * 4. 생성된 값을 이용해서 사용자와 컴퓨터간의 게임을 진행후 아래처럼 출력시키세요
 * 5. 축 당신 승(컴 : 보, 당신 : 가위) or ㅠㅠ 컴 승(컴 : 주먹, 당신 : 가위)
 * 6. 위 메세지가 출력된후 프로그램을 종료 하세요.  
 */
public class GawiBawiBoGame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// JOptionPane.showSelectDialog(1,2,3)

		int intro;
		int com = (int) (Math.random() * 3);

		String me = null;
		String[] data = { "가위", "바위", "보" };
		String computer = data[com];

		intro = JOptionPane.showConfirmDialog(null, "Do you wanna play a game?(직쏘 톤으로)", "Confirm",
				JOptionPane.YES_NO_OPTION);


//			fir = JOptionPane.showInputDialog("뭐 낼 것이냐.");
//			if(fir == "가위" && fir == "바위" && fir == "보") {
//				System.out.println(fir);
//			} else {
//				System.out.println("다시 써라");
//			}
			/// 질
		if (intro == 0) {
			do {
				me = JOptionPane.showInputDialog("뭐 낼건가요");
			} while (!me.equals("가위") && !me.equals("바위") && !me.equals("보"));
//				me = JOptionPane.showInputDialog("다시 내세요");

			String result = "";
			if ((me.equals("가위") && computer.equals("보")) || (me.equals("바위") && computer.equals("가위"))
					|| (me.equals("보") && computer.equals("바위"))) {
				result = JOptionPane.showInputDialog("축 당신 승 ( 컴퓨터 : " + computer + ", 당신 : " + me);
			} else if (me.equals(computer)) {
				result = JOptionPane.showInputDialog("비겼습니다");
			} else {
				result = JOptionPane.showInputDialog("ㅠㅠ 컴 승 ( 컴퓨터 : " + computer + ", 당신 : " + me);
			}

			// 결과 출력

//			{
//				// JOptionPane.showInputDialog("다시 입력하세요");
//			}

		} else {
			JOptionPane.showConfirmDialog(null, "ㅇㅇㅂㅂ", "Message", JOptionPane.ERROR_MESSAGE);
		}

//		String[] com = {"가위", "바위", "보"};
//		String comValue = com[((int)(Math.random()*com.length))];
//		System.out.println(comValue);

	}

}
