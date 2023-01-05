package basic;

import javax.swing.JOptionPane;

public class RealPlay {

	
	
	
	
	class email() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public RealPlay() {
		// TODO Auto-generated constructor stub
		play1();
	}

	
	public void play1() {
		// TODO Auto-generated method stub
		int com = (int)(Math.random()* 3);
		String me = null;
		String[] data = {"가위", "바위", "보"};
		String computer = data[com];



		do {
			me = JOptionPane.showInputDialog("무엇을 내시겠어요?");
		} while (!me.equals("가위") && !me.equals("바위") && !me.equals("보"));
			
	}

}
