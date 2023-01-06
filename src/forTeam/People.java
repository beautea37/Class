package forTeam;

public class People {

	String name;
	int win;
	int draw;
	int lose;
	int total;
	
	public People(String name, int win, int draw, int lose) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.setWin(win);
		this.setDraw(draw);
		this.setLose(lose);
	
	}


	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public int getDraw() {
		return draw;
	}
	
	public void setDraw(int draw) {
		this.draw = draw;
	}
	public int getLose() {
		return lose;
	}
	
	public void setLose(int lose) {
		this.lose = lose;
	}

}
