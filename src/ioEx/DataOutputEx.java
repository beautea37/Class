package ioEx;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.DataOutputStream;

public class DataOutputEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		BufferedOutputStream bos = null;
				
		try {
			fos = new FileOutputStream("sample.dat");
			//dos는 생성자 파라미터로 outputStream을 받는다.
			dos = new DataOutputStream(fos);
			
			//아래에서 사용되는 메서드는 자바데이터를 그대로 쓰기 때문에 쓰여진(생성된) 파일의 크기를 확인해보면 이해할 수 있다.
			
			dos.writeInt(10);
			dos.writeFloat(20.0F);
			dos.writeBoolean(true);
			dos.writeUTF("hello");
			
			dos.close();
		}	catch(Exception e) {
			e.printStackTrace();
		}
	}
}
