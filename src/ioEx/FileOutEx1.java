package ioEx;

import java.io.File;
import java.io.FileOutputStream;

public class FileOutEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =1;
		byte b = 100;
		int han = '조';
		System.out.println(Integer.toBinaryString(han));//51312			//1100100001110000

		
		/*
		 * 파일에 데이터를 쓰는 순서 OutputStream을 연다.
		 * 쓴다 write();
		 * 닫는다 (flush(), close())
		 * 참고론 close()는 내부적으로 flush()를 호출한다.
		 */
		
		String fileName = "myFirst.dat";
		File file = null;
		FileOutputStream fos = null;
		
		try {
			file = new File(fileName);
			fos = new FileOutputStream(file);
			//여기까지가 파일에 스트림을 연결하는 작업임.
			
			// 여기부턴 파일에 쓰는 작업임.
			fos.write(han);
			fos.write(a);
			fos.write(b);
			
			//다 썼으면 닫는다. 내부적으로 flush호출되고 close됨.
			fos.close();
			
			System.out.println("파일에 다 썼습니다.");
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (Exception e)	{
			
		}
	}
}