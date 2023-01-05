package ioEx;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
	 * DataInputStream을 이용해 Data를 읽을 때 주의할점
	 * 
	 * 1. 반드시 쓰인 순서 그대로 읽어야한다. 즉, int, double,float으로 썼으면 읽을 때도 같은 순으로 읽는다.
	 * 
	 * 2. read();를 루프 등을 이용해 사용할 때, 데이터의 끝은 -1이 아니라 EOFException을 발생시켜 끝을 낸다.
	 * 따라서 예외를 사용하여 적절히 읽는 일의 끝을 처리해야한다.
	 */
public class DataInputEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * try { DataInputStream dis = new DataInputStream(new FileInputStream(new
		 * File("Sample.dat"))); System.out.println(dis.readInt());
		 * System.out.println(dis.readFloat()); System.out.println(dis.readBoolean());
		 * 
		 * dis.close();
		 */
		try {
			int[] score = { 100, 85, 63, 95, 86, 58 };

			DataOutputStream dos = new DataOutputStream(new FileOutputStream(new File("sample.dat")));
			for (int i = 0; i < score.length; i++) {
				dos.writeInt(score[i]);
			}
			dos.close();
		} catch (Exception e) {

		}
	}

}
