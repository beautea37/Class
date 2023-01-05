package ioEx;

import java.io.File;
import java.io.FileInputStream;

public class FileInputEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "myFirst.dat";
		File f = null;
		FileInputStream fis = null;

		try {
			// 아래는 위의 코드를 한방코드로 정리했다. 만약 한 번만 읽고 더이상 사용하지 않을거면 아래 코드로 사용해도 괜찮다.
			//FileInputStream fi = new FileInputStream(new File("myFirst.dat"));
			f = new File(fileName);
			fis = new FileInputStream(f);
			// 여기까지가 파일에 InputStream연결 끝.
			/*
			 * read()한 번 호출때마다 1byte씩 읽어온다. 만약 파일의 끝에 다다르면 더이상 읽을게 없기 때문에 예외가 발생하지 않고 -1을
			 * 리턴한다. 리턴값이 int를 스트림해서 읽은 byte를 int로 리턴한 것이지 int를 읽는 것이 아니니 주의하길 바란다.
			 */
			int data;
			while((data = fis.read()) != -1) {
				System.out.println("읽은 데이터 : " + (char)data);
				break;
			}
			fis.close();
		} catch (Exception e) {

		}
	}
}
