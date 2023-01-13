package jfcEx;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JToggleButton;

/*Grid 레이아웃 : 격자모양으로 컴포넌트를 배치하는 레이아웃
아래의 파라미터 4개는 각각 row, column,hgap(상하여백), vgap(좌우여백)이겠지~*/

public class JToggleExam extends JFrame{
	private GridLayout grid = new GridLayout(2, 2, 5, 5);
	private JToggleButton tb = new JToggleButton("1", true);
	private JToggleButton tb1 = new JToggleButton("2", false);
	private JToggleButton tb2 = new JToggleButton("3", false);
	private JToggleButton tb3 = new JToggleButton("4", false);
	
	//위의 토글 버튼을 그룹으로 관리하는 ButtonGroup 객체 생성
	
	ButtonGroup bg = new ButtonGroup();
	private Container con;
	
	public JToggleExam() {
		init();
		start();
//		this.pack(); // VM에게 프레임 사이즈를 일임함.
		this.setSize(300, 100);
		this.setLocation(300, 300);
		this.setVisible(true);
	}
	private void init() {
		con = this.getContentPane();
		con.setLayout(grid);
		
		bg.add(tb);
		bg.add(tb1);
		bg.add(tb2);
		bg.add(tb3);
		
		//토글버튼 컨테이너에 add시킨다.
		
		con.add(tb);
		con.add(tb1);
		con.add(tb2);
		con.add(tb3);
	}
	private void start() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JToggleExam();
	}
}
