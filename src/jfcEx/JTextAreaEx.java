package jfcEx;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JTextAreaEx extends JFrame {
	Container con;
	JButton bt = new JButton("1");
	JButton bt1 = new JButton("2");
//	JTextArea ta = new JTextArea();
	JScrollPane jsp = new JScrollPane(new JTextArea());

	public JTextAreaEx() {
		init();
		start();

		this.setSize(300, 300);
		this.setLocation(200, 300);
		this.setVisible(true);
	}

	void init() {
		con = this.getContentPane();
		con.setLayout(new BorderLayout());
		// JPanel > 컨테이너의 일종으로 여키에 컴포넌트를 붙인 후 프레임이나 타른 컨테이너에 부착하는데에 사용되는 중간 컨테이너.

		JPanel jp = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		jp.add(bt);
		jp.add(bt1);

		// 구성된 컨테이너 jp를 Frame컨테이너에 부착한ㄷ.
		con.add("North", jp); // BorderLayout의 방위값의 첫 자는 반드시 대문자
		jsp.setWheelScrollingEnabled(true);
		con.add("Center", jsp);

	}
	void start() {
		
		new JTextArea();
	}
	public static void main(String[] args) {
		new JTextAreaEx();
	}
}
