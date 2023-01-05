package oopEx1Del;

public class Stats {
	private int win =0;
	private int lose = 0;
	private int tie = 0;
	private int count = 0;
	private double avg = 0;
	
	public void gameWin() {
		this.win++;
	}
	public void gameLose() {
		this.lose++;
	}
	public void gameTie() {
		this.tie++;
	}
	public void gameCount() {
		this.count++;
	}
	public String printStats() {
		avg = ((double)win / count) * 100;
		return "전적 :  총 " + count + "게임중 " + win + "승 " + tie +"무 "+ lose + "패 " + "승률 : "+ avg +"% 입니다."; 
	}
}
