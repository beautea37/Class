package Gbb;

import javax.swing.JOptionPane;

public class GBW {
	public String [] hands = {"가위", "바위", "보"};
	public String [] answers = {"1", "2", "3"};
	public String [] wr = {"WIN", "LOSE", "DRAW"};
//	int winCnt = 0;
//	int losCnt = 0;
//	int drawCnt = 0;
	private String comValue;
	JOptionPane input;
	ShowStat stats = new ShowStat();
	
	public GBW() {
		ask();
	}
	
	private void ask() {
		String userAnswer = input.showInputDialog("게임 하실래요? (y n)");
		if(userAnswer.equals("y")) {
			startMenu();
		} else if(userAnswer.equals("n")) {
			input.showMessageDialog(null, "no? okay");
		} else {
			input.showMessageDialog(null, "wrong");
			ask();
		}
	}
	
	private void startMenu() {
		
		String menuAnswer = input.showInputDialog("1. 뉴게임 2. 전적보기 3. 나가기");
		if (menuAnswer.equals(answers[0])) {
			comHands();
		} else if (menuAnswer.equals(answers[1])) {
			input.showMessageDialog(null, stats.printStats());
		} else if (menuAnswer.equals(answers[2])) {
			System.exit(0);
		}
		
	}

	private void userHands() {
		String yourHand = input.showInputDialog("가위 바위 보 중에 하나를 입력하세요");
		if(!yourHand.equals(hands[0]) && !yourHand.equals(hands[1]) && !yourHand.equals(hands[2])) {
			yourHand = "";
			input.showMessageDialog(null, "잘못된 값임");
			userHands();
		} else if (yourHand.equals(hands[0]) && comValue.equals(hands[2]) || yourHand.equals(hands[1]) && comValue.equals(hands[0]) || yourHand.equals(hands[2]) && comValue.equals(hands[1])) {
			stats.win();
			stats.gameC();
			JOptionPane.showMessageDialog(null, wr[0] + "\n유저 : " + yourHand + "\n컴퓨터 : " + comValue);
			playAgain();
		} else if (yourHand.equals(hands[0]) && comValue.equals(hands[1]) || yourHand.equals(hands[1]) && comValue.equals(hands[2]) || yourHand.equals(hands[2]) && comValue.equals(hands[0])) {
			stats.lose();
			stats.gameC();
			JOptionPane.showMessageDialog(null, wr[1] + "\n유저 : " + yourHand + "\n컴퓨터 : " + comValue);
			playAgain();
		} else if (yourHand.equals(comValue)) { // 무승부일경우.
			stats.draw();
			stats.gameC();
			JOptionPane.showMessageDialog(null, wr[2] + "\n유저 : " + yourHand + "\n컴퓨터 : " + comValue);
			playAgain();
		}
	}

//	private void saveStats() {
//		input.showMessageDialog(null, "전적은 다음과 같습니다. \n" + "승 : " + winCnt + "\n무 : " + drawCnt + "\n패 : " + losCnt);
//		System.exit(0);
//	}

	private void playAgain() {
		int againAnswer = input.showConfirmDialog(null, "다시 할래요?");
		if (againAnswer == 0) {
			comHands();
		} else {
			startMenu();
		}
		
		
	}

	private void comHands() {
		comValue = hands[(int)(Math.random()*hands.length)]; // 컴퓨터의 가위바위보를 생성.
		userHands();
	}
	
}