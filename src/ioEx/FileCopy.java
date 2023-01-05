package ioEx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		C:\Users\Manic-063\Desktop\Fullstack Day 1\Full_Stack_works\myjava\src\basic

		FileInputStream fis = null;
		FileOutputStream fos = null;

		String origin = "C:\\Users\\Manic-063\\Desktop\\Fullstack Day 1\\Full_Stack_works\\myjava\\src\\basic\\Fruit.java";
		File backup = new File("Fruit.java.back");

		try {
			fis = new FileInputStream(origin);
			fos = new FileOutputStream(backup);
			int data = 0;
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}
			fis.close();
			fos.close();

			System.out.println(backup.getName() + "이 복사되었습니다.");
			// 읽어온 바이트 담는 방법
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
