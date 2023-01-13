package jfcEx;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOpPanelEx extends JFrame {
Container con;
JOptionPane jap = new JOptionPane();

public JOpPanelEx() {
	init();
	start();
	this.setSize(300, 300);
	this.setLocation(100, 100);
	
	//JoptionPane은 Dialog의 일종이다.
	//자신을 열어준 부모 컴포넌트를 주게끔 되어있다.
	System.out.println(JOptionPane.showConfirmDialog(this, "저장할래", "저장", JOptionPane.OK_CANCEL_OPTION,
			JOptionPane.QUESTION_MESSAGE, new ImageIcon("th.jpg")));
}
void init() {
	con = this.getContentPane();
	con.setLayout(new BorderLayout());
}
void start() {

}
public static void main(String[] args) {
	new JOpPanelEx();
}
}
