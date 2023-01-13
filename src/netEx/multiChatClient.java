package netEx;
/*
 * 송신쓰레드, 수신 쓰레드 구현
 * 송수신 쓰레드는 사용자의 id를 먼저 보내는 것 외에는 이전 것과 다름없다.
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

class ClientSender extends Thread {
	Socket socket;
	DataOutputStream out;
	String name;
	
	public ClientSender(Socket socket, String name) {
		//서버와 소켓 연결과 동시에 서버에 name(id)를 전송한다.
		this.socket = socket;
		try {
			out = new DataOutputStream(socket.getOutputStream());
			this.name = name;
		} catch (Exception e) {
			System.out.println("클라이언트 소켓 생성 예외 : " + e.getMessage());
		}
	}
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		try {
			if(out != null) {
				out. writeUTF(name);
			}
			while(out != null ) {
				out.writeUTF("[" + name + "]" + sc.nextLine());

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
} // End of ClientSender Thread

class ClientReceiver extends Thread {
	Socket socket;
	DataInputStream in;
	
	public ClientReceiver(Socket socket) {
		this.socket = socket;
		try {
			in = new DataInputStream(socket.getInputStream());
		}catch (Exception e) {
			// TODO: handle exception
			  System.out.println(e.getMessage());

		}
	}
	@Override
	public void run() {
		while(in != null) {
			try {
				System.out.println(in.readUTF());
			} catch (Exception e) {
				// TODO: handle exception
				  System.out.println(e.getMessage());

			}
		}
	}
}
public class multiChatClient {
	public static void main(String[] args) {
		//클라이언트 시작 시에 배열의 값을 사용자의 아이디로 이용한다.
		if(args.length != 1) {
			System.out.println("ID를 반드시 넣고 시작하세요.");
			System.exit(0);
		}
		String serverIp = "14.42.124.125";
		int port = 40001;
		try {
			Socket socket = new Socket(serverIp, port);
			System.out.println("서버에 연결됨");
			//서버에 연결 완료. 제일먼저 id를 보여주자 Thread이용
			
			Thread sender = new Thread(new ClientSender(socket, args[0]));
			Thread receiver = new Thread(new ClientReceiver(socket));
			
			sender.start();
			receiver.start();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
