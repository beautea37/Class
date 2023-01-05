package Gbb;

import javax.swing.JOptionPane;

public class Rock {

	JOptionPane thePane;
	String userinput;
//	String com;
	int playCount;
	int win;
	int loss;
	String[] theMessage;
	boolean isCorrect;

	int intro, intro2, intro3, intro4;

	int com = (int) (Math.random() * 3);

	String me = null;
	String[] data = { "가위", "바위", "보" };
	String computer = data[com];
	ShowStat showstat = new ShowStat();

	public Rock() {
		ask();
	}
//	public Restart() {
//		rere();
//	}

	private void ask() {

		intro = JOptionPane.showConfirmDialog(null, "Do you wanna play a game?", "Confirm", JOptionPane.YES_NO_OPTION);
		int com = (int) (Math.random() * 3);
		String[] data = { "가위", "바위", "보" };
		String computer = data[com];
		if (intro == 0) {
			do {
				me = JOptionPane.showInputDialog("뭐 낼건가요");
			} while (!me.equals("가위") && !me.equals("바위") && !me.equals("보"));
//				me = JOptionPane.showInputDialog("다시 내세요");

			if ((me.equals("가위") && computer.equals("보")) || (me.equals("바위") && computer.equals("가위"))
					|| (me.equals("보") && computer.equals("바위"))) {
				JOptionPane.showConfirmDialog(null, "이겨서 좋냐? 다시 해 y눌러", "Message", JOptionPane.YES_NO_OPTION);
				showstat.getWin();
			} else if (me.equals(computer)) {
				JOptionPane.showConfirmDialog(null, "비겼네..", "Message", JOptionPane.YES_NO_OPTION);
				showstat.getDraw();
			} else {
				JOptionPane.showConfirmDialog(null, "응 너 짐ㅋㅋ", "Message", JOptionPane.YES_NO_OPTION);
				showstat.getLose();
			}

			if (intro == JOptionPane.YES_OPTION) {
				ask();
			} else if (intro == JOptionPane.NO_OPTION) {
				showstat.stat();
			}

//		private void re() {
//			String[] st = {"1", "2", "3"};
//			JOptionPane.showOptionDialog(F, "Msg", "Title", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null, st, "2");
//		}

//	}

		}
	}
}
