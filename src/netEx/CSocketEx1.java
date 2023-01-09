package netEx;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * Client socket은 Socket생성 시에 서버의 IP, Port정보를 가지고 객체를 생성한다.
 * 문제가 없다면, 이후 Stream을 얻고 메시지를 송-수신한다.
 * 지금은 서버에서 보낸 메시지를 수신만 하도록 정의한다.
 */
public class CSocketEx1 {
public static void main(String[] args) {
	try {
		//14.42.124.103
		String ip = "14.42.124.97"; int port = 40001;
		Socket socket = new Socket(ip, port);
		//연결된 소켓에 스트림을 얻어낸다.
		DataInputStream dis = new DataInputStream(socket.getInputStream());
		
		String msg = "공격 시작.. 제발 모니터 불났으면... 컴퓨터 터졌으면....";
		PrintWriter pw = null;
		BufferedWriter bw = null;
		
		OutputStream out = socket.getOutputStream();
		bw = new BufferedWriter(new OutputStreamWriter(out));
		pw = new PrintWriter(bw);
		
		//outputstream을 bw객체로 변환했으니 println()을 이용해 메시지 전송
		pw.println(msg);
		pw.flush();
		
		
		System.out.println("소켓으로 받은 데이터 출력 : " + dis.readUTF());
		//스트림, 소켓 종료
		pw.close();
		dis.close();
		socket.close();
		
		
		
		
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
}
