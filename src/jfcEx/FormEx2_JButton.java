package jfcEx;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class FormEx2_JButton extends JFrame{
   
   private Container con;
   //아이콘 타입중 이미지 Icon객체를 이용해 image 얻어내기
   private ImageIcon im;
   JButton bt = new JButton("이건 버튼입니다0");
   JButton bt1 = new JButton("이건 버튼입니다1");
   JButton bt2 = new JButton("이건 버튼입니다2");
   JButton bt3 = new JButton("이건 버튼입니다3");
   JButton bt4;
   
   public FormEx2_JButton() {
      super("이건 JFrame타이틀 제목입니다.");
      init();// >>> 초기화 메서드 호출해서 레이아웃이나 컨테이너에 붙일 컴포넌트를 생성하는 작업 수행.
      start();//이벤트 연결, 등록 및 쓰레드 작업 등 컨테이너가 화면에 보이기 전에 수행할 작업등 정의
      im = new ImageIcon("bm.png");
      this.setIconImage(im.getImage());
      this.setSize(300,200);
      
      //이번엔 영역객체인 Dimension 을 이용해서 프레임을 화면 중간에 띄웁니다.
      //이때 사용하는 대표적 객체가 Toolkit 이라는 객체입니다.
      //static 메서드를 이용해서 얻어내는데, 화면의 크기, 해상도, 음성 출력 등
      //시스템에 전반적인 내용을 리턴하는 객체입니다.
      Toolkit tk = Toolkit.getDefaultToolkit();
      Dimension dm = tk.getScreenSize();
      Dimension dm1 = this.getSize();
      
      int x = (int)(dm.getWidth()/2 - dm1.getWidth()/2);
      int y = (int)(dm.getHeight()/2 - dm1.getHeight()/2);
      
      //좌표값을 정의한 Point 객체를 이용해서 위 좌표값을 설정함.
      Point p = new Point(x,y);
      
      this.setLocation(p);
      this.setVisible(true);
   }
   private void init() {
	   im = new ImageIcon("Screenshot 2023-01-11 at 12.41.05.JPG");
      //JFrame에서 contentPane()을 호출해 Container를 얻어낸다.
      //이 위에 컴포넌트를 부탁한다.
      con = this.getContentPane();
      //배치관리자를 컨테이너에 지정합니다.FlowLayOut 배치관리자입니다.
      con.setLayout(new FlowLayout(FlowLayout.LEFT));
      
      bt4 = new JButton("이건버튼4",im);

      bt.setEnabled(false);
      bt1.setMnemonic('a');
      bt2.setHorizontalAlignment(SwingConstants.RIGHT);
      bt2.setVerticalAlignment(SwingConstants.TOP);
      bt4.setMnemonic('b');
      bt.setPressedIcon(im);
      bt.setRolloverIcon(im);
      
      con.add(bt);
      con.add(bt1);
      con.add(bt2);
      con.add(bt3);
      con.add(bt4);
   }
   private void start() {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      
      //컴포넌트에 이벤트를 등록한다. addXXXListener(구현 객체)를 이용한다.
      bt.addMouseListener(new MouseListener() {
		
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			//마우스가 클릭되면 자동 호출되는 메서드
			System.out.println(e.getSource()+"를 클릭했다!");
			System.out.println(e);
			//이벤트 대상 객체를 찾아보기..getSource();
			if(e.getSource() == bt) {
				bt.setEnabled(true);
				bt.doClick(5000);
			}
		}
	});
   }
   public static void main(String[] args) {
      new FormEx2_JButton();
      
      //JFrame을 구성하는 방법
      //1. 생성자 호출해 구성하기
      //2. 상속받은 클래스가 JFrame되기
      
      //프레임 객체 생성 메서드
//      JFrame jf = new JFrame();
      //프레임의 사이즈를 정한다.
//      jf.setSize(300, 500);
//      jf.setLocation(300, 300);
//      jf.setVisible(true);
   }
}