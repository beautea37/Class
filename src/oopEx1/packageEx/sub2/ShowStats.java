package basic;

public class ShowStats {
	
	private int winCnt;
	private int losCnt;
	private int drawCnt;
	private int gameCnt;
	
	public void win() {
		this.winCnt++;
	}
	public void lose() {
		this.losCnt++;
	}
	public void draw() {
		this.drawCnt++;
	}
	public void gameC() {
		this.gameCnt++;
	}
	
	public String printStats() {
		
		return "전적은 다음과 같습니다. \n게임수 : " + gameCnt + " \n승 : " + winCnt + "\n무 : " + drawCnt + "\n패 : " + losCnt;
	}
}
