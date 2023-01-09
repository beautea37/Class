package Project1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class MemberJoin {

	public static void main(String[] args) {
		File file = new File("D:\\조기제 !! 건들지말아주세용 ㅠㅠ\\MemberInfo.txt");
		String id = null;
		String pw = null;
		try {
			FileWriter filewriter = new FileWriter(file, true);
			if(file.isFile() && file.canWrite()) {			//파일이 있고, 파일을 쓸 수 있는지 권한
				id = JOptionPane.showInputDialog("원하는 ID를 입력하세요.");
				filewriter.append(id + "    ");
				pw = JOptionPane.showInputDialog("원하는 pw를 입력하세요");
				filewriter.append(pw);
				filewriter.append("\n");
			}
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}