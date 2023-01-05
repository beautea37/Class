package ioEx;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileOutputStream fos = new FileOutputStream("123.txt");
			
			//버퍼 크기 5로 지정한 스트림
			BufferedOutputStream bos = new BufferedOutputStream(fos,5);
			for(int i = '1'; i<='9'; i++) {
				bos.write(i);
			}
			bos.close();
			
		} catch(Exception e) {
			
		}
		
	}

}
