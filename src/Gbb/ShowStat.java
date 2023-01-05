package Gbb;

import javax.swing.JOptionPane;

public class ShowStat {

	
	private int win = 0;
	private int draw = 0;
	private int lose = 0;
	
	
	
	public void getWin() {
		this.win++;
	}

	public void getDraw() {
		this.draw++;
	}

	public void getLose() {
		this.lose++;
	}

	public ShowStat() {
		stat();
	}

	public void stat() {
		JOptionPane.showConfirmDialog(null, "승 : " + win + ", 무 : " + draw + "패 : " + lose);

	}

}
