package jfcEx;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/*
 * 거의 대부분의 이벤트 종류(자주 쓰는)
 * ActionEvent > 액션 리스너
 * FocusEvent > 포커스 리스너, FocusAdapter
 * Iten 이벤트 > item리스너
 * Key 이벤트(키보드 입력) > Key리스너
 * Mouse이벤트 > Mouse리스너
 * MouseMotion 이벤트 > MouseMotion리스너, MouseMotionAdapter
 * window 이벤트(프레임, 팝업, 다이얼로그 등의 윈도우에서 발생되는 이벤트) > window리스너, windowAdapter
 * 
 * 이벤트를 구현하는 방법
 * 1. 리스너를 구현한 클래스를 생성하여 이벤트 헨들러로 지정한다.
 * 2. Adapter클래스를 상속받아 필요한 메서드만 오버라이드 한 후 핸들러로 지정한다.
 * 3. 무명클래스로 정의하여 필요한 메서드만 오버라이드 한다.
 */

class MyMouseListen implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스를 클릭했다.");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override                                               
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

class MyKeyAdt extends KeyAdapter{
	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println(e.getSource());
		System.out.println(e.getID());
		System.out.println(e.getKeyChar());
		System.out.println(new Date(e.getWhen()));
		System.out.println("타이핑중이다.");
	}
}
public class EventEx extends JFrame {
	
	Container con;
	JButton close;
	JTextField jf;
	
	public EventEx() {
		start();
		this.setSize(300,300);
		this.add(close);
		this.setVisible(true);
		
	}
	void start() {
		con = this.getContentPane();
		con.setLayout(new BorderLayout());
		close = new JButton("닫기");
		con.add("North", close);
		jf = new JTextField(20);
		jf.setBackground(Color.cyan);
		con.add("South", jf);
		//여기선 이벤트 등록 및 구현 객체를 지정한다.
		MyMouseListen m = new MyMouseListen();
		close.addMouseListener(m);
		jf.addKeyListener(new MyKeyAdt());
	}
	
	public static void main(String[] args) {
		new EventEx();
		
	}
}
