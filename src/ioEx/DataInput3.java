package ioEx;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInput3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int score = 0;

		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			fis = new FileInputStream("Sample.dat");
			dis = new DataInputStream(fis);

			// 파일에 있는 int를 읽어서 int로 리턴하는 reatInt()사용~
			while (true) {
				score = dis.readInt();
				System.out.println(score);
				sum += score;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			//DataInput의 readInt()가 더 읽을게 없을 때 이 예외 발생.
			//따라서 여기에 적절히 예외처리를 해주어야 한다.
			System.out.println("점수 총합 : " + sum);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if(dis != null)	{
				try {
					dis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
