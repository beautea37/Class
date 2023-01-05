package ioEx;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FileInputStream을 요소로 갖는 Vector
		Vector<InputStream> streams = new Vector<InputStream>();
		
		//하나 이상의 입력 스트림을 하나로 처리하는 seq스트림 선언
		SequenceInputStream sis = null;
		
		//객체 선언
		File f1 = new File("myFirst.dat");
		File f2 = new File("123.txt");
		
		//객체 읽는 스트림 선언
		FileInputStream fis1 = null;
		FileInputStream fis2 = null;
		
		try {
			fis1 = new FileInputStream(f1);
			fis2 = new FileInputStream(f2);
			//위 두개의 입력스트림 객체를 Vector에 add
			streams.add(fis1);
			streams.add(fis2);
			
			//sequenceinputstream의 생성자에 enumeration객체로 스트림을 넘겨주기 위해 vector의 enumeration을 리턴하는 메서드 호출
			Enumeration<InputStream> er = streams.elements();
			
			//sequenceInputStream객체를 생성하면서 입력대상인 er객체를 파라미터로 준다.
			sis = new SequenceInputStream(er);
			
			//sequenceInputStream에 오버로드된 read() 중 맘에드는걸 호출해 하나로 연결된 파일 스트림의 내용을 읽어들인다.
			int data = 0;
			while((data = sis.read()) != -1) {
				System.out.println(data);
				sis.close();
			}
			
		} catch(Exception e) {
			
		}
	}

}
