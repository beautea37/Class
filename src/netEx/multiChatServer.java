package netEx;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class multiChatServer {

	// 채팅 사용자의 소켓 정보 및 스트림 정보를 관리하는 Hashmap 선언
	HashMap clients;
	
	public multiChatServer() {
		// 생성자를 통해 맴객체 초기화 및 동기화된 맵 get
		
		clients = new HashMap();
		// 아래의 Collections 메서드를 이용하면 동기화가 자동 적용된 Map객체로 변환된다.
		//synchronized << 얘가 동기화를 해주는 것이다. 그게 아니면 String으로 계속 돌아간다.
		Collections.synchronizedMap(clients);
	}

	public void start() {
		// 서버소켓 생성 및 클라이언트 별 쓰레드 생성 구현
		try {
			ServerSocket sSocket = new ServerSocket(40001);
			System.out.println("서버 시작됨..");
			Socket socket = null;

			while (true) {
				socket = sSocket.accept();
				System.out.println(socket.getInetAddress() + "의 사용자가 " + socket.getPort() + "로 접속함.");

				// 생성된 소켓을 쓰레드에 넘김
				ServerReceiver thread = new ServerReceiver(socket);
				thread.start();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	// 접속된 모든 사용자에게 Broadcasting(한 곳에서 다중으로 일방적인 송출)
	public void sendToAll(String msg) {
		Iterator it = clients.keySet().iterator();

		while (it.hasNext()) {
			try {
				DataOutputStream out = (DataOutputStream) clients.get(it.next());
				out.writeUTF(msg);
			} catch (Exception e) {
				System.out.println("브로드캐스팅 시 예외 : " + e.getMessage());
			}
		}//end of while
	}//end of sendToAll

	public static void main(String[] args) {
		new multiChatServer().start();
	}//end of main
	
	//서버 리시버 클래스를 inner로 정의한다.
	
	//outer의 멤버와 메서드를 사용하기 위함
	class ServerReceiver extends Thread{
		Socket socket;
		DataInputStream in;
		DataOutputStream out;
		
		public ServerReceiver(Socket socket) {
			this.socket = socket;
			
			try {
				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
			}catch (Exception e) {
				System.out.println("서버 리시버 쓰레드 스트림 예외 : " + e.getMessage());
			}
		}//end of 생성자
		@Override
		public void run() {
			String name = "";
			try {
				name = in.readUTF();	//
				sendToAll("[" + name + "]님이 입장하였습니다.");
				
				//접속한 사용자의 name을 key, outputstream 객체를 value로 넣어준다.
				clients.put(name,  out);
				System.out.println("현재 접속자 수 : " + clients.size());
				while(in != null) {
					sendToAll(in.readUTF());
				}
			} catch (Exception e) {
				System.out.println("쓰레드의 클라이언트 메시지 전송 예외 : " + e.getMessage());
			} finally {
				sendToAll(name + "님이 퇴장하셨습니다.");
				clients.remove(name);
				System.out.println("현재 사용자 수 : " + clients.size());
			}
		}//end of run()
	}//end of class
}
