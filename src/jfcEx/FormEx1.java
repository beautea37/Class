package jfcEx;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class FormEx1 extends JFrame{
	
	private Container con;
	//아이콘 타입중 이미지 Icon객체를 이용해 image 얻어내기
	private ImageIcon im;
	
	public FormEx1() {
		super("이건 JFrame타이틀 제목입니다.");
		init();// >>> 초기화 메서드 호출해서 레이아웃이나 컨테이너에 붙일 컴포넌트를 생성하는 작업 수행.
		start();//이벤트 연결, 등록 및 쓰레드 작업 등 컨테이너가 화면에 보이기 전에 수행할 작업등 정의
		im = new ImageIcon("C:\\Users\\Manic-063\\Desktop\\th.jpg");
		this.setIconImage(im.getImage());
		this.setSize(300,200);
		
		//이번엔 영역객체인 Dimension을 이용해 프레임을 화면 중간에 띄웁니다.
		//이 때 사용하는 대표적 객체가 Toolkit이라는 객체이다.
		//static 메서드를 이용해 얻어내는데 화면의 크기, 해상도, 음성 출력 등 시스템 전반의 내용을 리턴하는 객체이다.
		//시스템 전반적인 내용을 리턴하는 객체이다.
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dm = tk.getScreenSize();
		Dimension dm1 = this.getSize();
		
		int x = (int)(dm.getWidth()/2 - dm1.getWidth()/2);
		int y = (int)(dm.getHeight()/2 - dm1.getHeight()/2);
		
		//좌표값을 정의한 Point객체를 이용해 위 좌표값을 설정한다.
		Point p = new Point(x, y);
		
		this.setLocation(p);
		this.setVisible(true);
		
	}
	private void init() {
		//JFrame에서 contentPane()을 호출해 Container를 얻어낸다.
		//이 위에 컴포넌트를 부탁한다.
		
		con = this.getContentPane();
	}
	private void start() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		//JFrame을 구성하는 방법
		//1. 생성자 호출해 구성하기
		//2. 상속받은 클래스가 JFrame되기
		new FormEx1();
		//프레임 객체 생성 메서드
//		JFrame jf = new JFrame();
//		//프레임의 사이즈를 정한다.
//		jf.setSize(300, 500);
//		jf.setLocation(300, 300);
//		jf.setVisible(true);
	}
}
