package jfcEx;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/*Grid 레이아웃 : 격자모양으로 컴포넌트를 배치하는 레이아웃
아래의 파라미터 4개는 각각 row, column,hgap(상하여백), vgap(좌우여백)이겠지~*/

public class JRadioExam extends JFrame{
	private GridLayout grid = new GridLayout(2, 4, 5, 5);
	
	private JLabel jb1 = new JLabel("선택1");
	private JLabel jb2 = new JLabel("선택2");
	private JLabel jb3 = new JLabel("선택3");
	private JLabel jb4 = new JLabel("선택4");
	
	private JRadioButton cb1 = new JRadioButton("1번", true);
	private JRadioButton cb2 = new JRadioButton("2번", false);
	private JRadioButton cb3 = new JRadioButton("3번", true);
	private JRadioButton cb4 = new JRadioButton("4번", false);
	
	//위의 토글 버튼을 그룹으로 관리하는 ButtonGroup 객체 생성
	
	ButtonGroup gb = new ButtonGroup();
	ButtonGroup gb1 = new ButtonGroup();
	private Container con;
	
	public JRadioExam() {
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
		jb1.setBackground(Color.cyan);
		jb1.setAlignmentX(LEFT_ALIGNMENT);
		//버튼그룹 add
		gb.add(cb1);
		gb.add(cb2);
		gb1.add(cb3);
		gb1.add(cb4);
		
		//토글버튼 컨테이너에 add시킨다.
		con.add(jb1);
		con.add(jb2);
		con.add(jb3);
		con.add(jb4);
		
		con.add(cb1);
		con.add(cb2);
		con.add(cb3);
		con.add(cb4);
	}
	private void start() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JRadioExam();
	}
}

