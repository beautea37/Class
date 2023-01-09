package netEx;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class inetEx2_Socket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] remoteAddr = { 14, 42, 124, 125 };
		int port = 8080;
		String url = "/web_program/04/Lesson04_JS.html";

		InetAddress ia = null;
		Socket socket = null;
		PrintWriter out = null;
		BufferedReader br = null;

		try {
			// 선생님 서버 진입
			ia = InetAddress.getByAddress(remoteAddr);
			System.out.println(ia.getHostName());

			// 연결 잘됐으면 스트림 얻어냄.
			// 지금은 서버에 브라우저로 요청한 것과 같은 효과를 내기 위해 in out stream 모두를 연결한다.

			socket = new Socket(ia, 8080); // 8080포트에 소켓 생성

			out = new PrintWriter(new BufferedOutputStream(socket.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			System.out.println(out);
			System.out.println(br);
			System.out.println("모든 스트림 연결 이상 없음");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("연결 오류 : " + e.getMessage());
		}
		/*
		 * 웹브라우저처럼
		 */
		out.println("GET http://" + new String(remoteAddr) + url);
		out.println("GET http://" + ia.getHostName() + url);
		out.flush();

		try {
			while (true) {
				String str = br.readLine();
				if (str == null) {
					break;
				}
				System.out.println(str);
			}
			socket.shutdownInput();
			socket.shutdownOutput();
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
