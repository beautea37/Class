package jfcEx;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JTFPass extends JFrame implements ActionListener {
	Container con;
	JTextArea ta = new JTextArea("adfskfsajkfdasjfk");
	JScrollPane jsp = new JScrollPane(ta);
	// 라벨의 text정렬 우측으로
	JLabel lb = new JLabel("ID : ", JLabel.RIGHT);
	JTextField tf = new JTextField();
	JLabel lb1 = new JLabel("Pass : ", JLabel.RIGHT);
	JPasswordField jpf = new JPasswordField();

	public JTFPass() {
		init();
		start();
		this.setSize(300, 200);
		this.setVisible(true);
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		ta.replaceRange("ABCD", 0, 4); // 0~4까지 문자열을 abcd로 변경
	}

	void init() {
		con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.setBackground(Color.green);

		// JPanel(컨테이너)를 이용해서 다른 컴포넌트로 부착하는 것. 이것도 컨테이너라서 배치가 필요하다.
		// 그래서 생성 시 보더 레이아웃으로 배치를 지정
		JPanel jp = new JPanel(new BorderLayout());
		jp.add("West", lb);
		tf.setHorizontalAlignment(JTextField.CENTER);
		jp.add("Center", tf);
		jp.setBackground(Color.cyan);

		JPanel jp1 = new JPanel(new BorderLayout());
		jp1.setBackground(Color.pink);
		jp1.add("West", lb1);
		// 암호 필드에 값 입력 시 일력값을 대체하는 문자 지정.. abcd로 입력하면 지정된 문자로 표시된다. 간단히 메서드로 가능하다.
		jpf.setEchoChar('&');
		jp1.add("Center", jpf);
		con.add("South", jp1);
		con.add("North", jp);
		con.add("Center", jsp);

	}
	void start() {
		jpf.addActionListener(this);
	}
	public static void main(String[] args) {
		new JTFPass();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jpf) {
			String str = new String(jpf.getPassword());
			System.out.println("비밀번호 : " + str);
		}
	}
}
