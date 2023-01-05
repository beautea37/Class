package ioEx;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;

public class FileReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		/C:\\Users\\Manic-063\\Desktop\\Fullstack Day 1\\Full_Stack_works\\myjava\\src\\basic\\ArrayEx.java
		
		
//		try {
//			LineNumberReader reader = new LineNumberReader(new FileReader("C:\\Users\\Manic-063\\Desktop\\Fullstack Day 1\\Full_Stack_works\\myjava\\src\\basic\\ArrayEx.java"));
//			
//			int asdf;
//			while (reader.readLine() != null) {
//				asdf = reader.getLineNumber();																				내가 성공한거!!(사실 조금 실패)
//						System.out.println(asdf);
//			}
//			
//		}catch (Exception e) {
//			// TODO: handle exception
//		}
		File file = new File("C:\\Users\\Manic-063\\Desktop\\Fullstack Day 1\\Full_Stack_works\\myjava\\src\\basic\\ArrayEx.java");
		FileReader fr = null;
		BufferedReader br = null;
		LineNumberReader lr = null;
		String msg = null;
		int readData;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			lr = new LineNumberReader(br);
			
			String msg2;
			
			while((msg2 = lr.readLine()) != null) {
				System.out.print(lr.getLineNumber() + "   ");
				System.out.println(msg2);
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
//		try {
//			fr = new FileReader(file);
//			
//			//순수하게 read()만 이용해 읽기
//			
//			int readData;
//			while((readData = fr.read()) != -1) {
//				System.out.print((char)readData);
//			} 
//			fr.close();
//		}catch (Exception e) {
//			// TODO: handle exception
//		}
	}

}
