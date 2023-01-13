package Project1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class sdf {

	private String id = null;
	private String fName = "members";
	private File newFile = null;
	FileWriter fw = null;
	BufferedWriter bw = null;
	FileReader fr = null;
	BufferedReader br = null;

	public void crDate() {
		try {
			fw = new FileWriter(newFile);
			bw = new BufferedWriter(fw);
			fr = new FileReader(newFile);
			br = new BufferedReader(fr);
			Date date_now = new Date(System.currentTimeMillis());
			SimpleDateFormat new_date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
			if (br.readLine() == null) {

				bw.write("최근 로그인 날짜 : " + new_date.format(date_now) + "\n");
				bw.flush();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
