package Rock;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.swing.JOptionPane;

public class Intro {
	String userId;
	String id = "";
	int i = 0;
	String line1;
	String line2;
	FileWriter fw;
	BufferedWriter bw;
	FileReader fr;
	BufferedReader br;

	private static Intro inst = new Intro();

	public static Intro getInst() { // 34~39 기제가 추가한 영역
		return inst;

	}

	public Intro() {
		first();
	}

	public void first() {

		String[] firButton = { "로그인하기", "사용자 계정 생성", "기타 메뉴" };

		int selected = JOptionPane.showOptionDialog(null, "원하는 항목을 누르시오", "게임 실행하기", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, firButton, firButton[0]);
		MemberDAO dao = MemberDAO.getInstance();
		if (selected == 0) {
			butt1();
		} else if (selected == 1) {
			dao.Crmem();
		} else if (selected == 2) {

		}
		return;

	}

	public void butt1() {
		Properties prop = new Properties();
		// 아이디 입력하는 부분. 아이디 비번 파일에서 땡겨온 후, 일치한다면 아랫 줄 비밀번호 실행
		id = JOptionPane.showInputDialog("아이디를 입력하세요");
		userId = id.substring(0, id.indexOf('@'));
		try {
			prop.load(new BufferedReader(new FileReader("C:\\members\\" + userId + ".properties")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("아이디를 불러오지 못했습니다." + e.getMessage());
		}

		if (userId.equals(prop.getProperty("ID"))) {
			System.out.println(id);
		} else if (!userId.equals(prop.getProperty("ID"))) {
			JOptionPane.showMessageDialog(null, "아이디가 존재하지 않습니다. \n 다시 시작하시기 바랍니다.");
			butt1();
		}
		passch();
	}

	public void passch() {

		Properties prop = new Properties();
		String pw = JOptionPane.showInputDialog("비밀번호를 입력하세요");

//		String pw1 = prop.getProperty("Password");

		try {
			String	propFile = "C:\\members\\" + userId + ".properties";
			prop.load(new BufferedReader(new FileReader("C:\\members\\" + userId + ".properties")));
			FileInputStream fis = new FileInputStream(propFile);
			prop.load(new java.io.BufferedInputStream(fis));
			
			String	log		=	prop.getProperty("LLO");
//			System.out.println(log);
			Date date_now = new Date(System.currentTimeMillis());
			SimpleDateFormat new_date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
			prop.setProperty("LLO", String.valueOf(new_date.format(date_now)));
			prop.store(new FileOutputStream(propFile), null);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("아이디를 불러오지 못했습니다." + e.getMessage());
		}

		if (pw.equals(prop.getProperty("Password"))) {
			JOptionPane.showMessageDialog(null, id + "님 로그인을 환영합니다.");

			// logInTime 넣어주기.
			// 비밀번호 틀릴 경우
		} else if (!pw.equals(prop.getProperty("Password"))) {
			// 틀릴 시 3회 반복분

			while (i < 3) {
				pw = JOptionPane.showInputDialog("비밀번호를 " + (i + 1) + "회 잘못 입력하셨습니다.\n");
				i++;
				if (pw.equals(prop.getProperty("Password"))) {
					JOptionPane.showMessageDialog(null, "로그인 성공");

					break;
				} else if (!pw.equals(prop.getProperty("Password"))) {
					System.out.println("로그인 실패!");
					if (i == 3)
						JOptionPane.showMessageDialog(null, "비밀번호 입력 횟수가 초과되었습니다.\n 프로그램을 종료합니다.");
					continue;
				}

			} // 비밀번호 확인 파트
		}
	}

	public static void main(String[] args) {
		

	}

}

// 회원 아이디, 비밀번호 찾기가 필요할 것 같은데....?
