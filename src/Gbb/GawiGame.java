package Gbb;

import javax.swing.JOptionPane;

public class GawiGame {


public game() {
	startGame();
}
public startGame() {

		int com = (int) (Math.random() * 3);

		String me = null;
		String[] data = { "가위", "바위", "보" };
		String computer = data[com];
}
		do {
			me = JOptionPane.showInputDialog("뭐 낼건가요");
		} while (!me.equals("가위") && !me.equals("바위") && !me.equals("보"));
//			me = JOptionPane.showInputDialog("다시 내세요");

		String result = "";
		if ((me.equals("가위") && computer.equals("보")) || (me.equals("바위") && computer.equals("가위"))
				|| (me.equals("보") && computer.equals("바위"))) {
			result = JOptionPane.showInputDialog("축 당신 승 ( 컴퓨터 : " + computer + ", 당신 : " + me);
		} else if (me.equals(computer)) {
			result = JOptionPane.showInputDialog("비겼습니다");
		} else {
			result = JOptionPane.showInputDialog("ㅠㅠ 컴 승 ( 컴퓨터 : " + computer + ", 당신 : " + me);
		}
	}
}
		// 결과 출력

//		{
//			// JOptionPane.showInputDialog("다시 입력하세요");
//		}
//
//	} else {
//		JOptionPane.showConfirmDialog(null, "ㅇㅇㅂㅂ", "Message", JOptionPane.ERROR_MESSAGE);
//	}
//	public void setPlayCount(int playCount) {
//		this.playCount = playCount;
//	}
//
//	public void setLoss(int loss) {
//		this.loss = loss;
//	}
//
//	public void setWin(int win) {
//		this.win = win;
//	}
//	
//	public int getLoss() {
//		return loss;
//	}
//	public int getWin() {
//		return win;
//	}
//	public int getPlayCount() {
//		return playCount;
//	}
//
//}
