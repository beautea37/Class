package ioEx;
/*
 * win, lose, total, rate를 read, write로 출력
 * 
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MakeMyData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int total = (int) (Math.random()*5);
//		int win =  
		String fileName = "RSP.dat";
		File f = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		
		int win = 0;
		int lose = 0;
		int total = 0;
		int	 rate = 0;

		try {
			f = new File(fileName);
			fos = new FileOutputStream(f);
			fos.write(win);
			fis = new FileInputStream(f);
			
			
			
			
			
			
			                                                                    
			
			
			
			
			
			
			
			
			
			
			
			
			fos.close();
			fis.close();
						
		} catch (Exception e) {
			
		}
		
	}

}
