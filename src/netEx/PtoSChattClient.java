package netEx;

import java.io.IOException;
import java.net.Socket;

public class PtoSChattClient {

	public static void main(String[] args) {
		/*
		 * 서버에 소켓 연결 후 연결된 소켓을 쓰레드에 바인딩 후 쓰레드 start()를 실행
		 */
		String serverIp = "14.42.124.102";
		int port = 40001;

		try {
			Socket socket = new Socket(serverIp, port);

			Thread sThread = new Sender(socket, "기제");
			Thread rThread = new Reciever(socket);

			sThread.start();
			rThread.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
