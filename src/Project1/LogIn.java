package Project1;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class LogIn {

	public static void main(String[] args) {
		int pass = 0;
		String id = JOptionPane.showInputDialog("아이디를 입력하세요.");
		String pw = JOptionPane.showInputDialog("비밀번호를 입력하세요.");
//		File file = new File("E:\\Project\\MemberInfo.txt");
		try {
			FileReader filereader = new FileReader(new File("D:\\조기제 !! 건들지말아주세용 ㅠㅠ\\MemberInfo.txt"));
			BufferedReader bufferReader = new BufferedReader(filereader);
			String line = "";
			try {
				while ((line = bufferReader.readLine()) != null) {
					JOptionPane.showConfirmDialog(null, line.indexOf(id) + "    " + line.indexOf(pw));
					int passId = line.indexOf(id);
					int passPw = line.indexOf(pw);
					if (passId != -1 && passPw != -1) {
						JOptionPane.showMessageDialog(null, "로그인 성공!");
					}
					if (pass == 0) {
						JOptionPane.showMessageDialog(null, "로그인 실패");
					}
				}
			} catch (HeadlessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
