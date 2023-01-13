package netEx;
//선생님이 삭제하라셨음
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.HashMap;

public class ServerReceiver extends Thread {
	Socket socket;
	DataInputStream in;
	DataOutputStream out;
	HashMap clients;
	
	public ServerReceiver(Socket sockt) {
		this.socket = socket;
		try {
			in = new DataInputStream(socket.getInputStream());
			out = new DataOutputStream(socket.getOutputStream());
			
		} catch (Exception e) {
			System.out.println("서버 리시버의 스트림 예외 발생 : " + e.getMessage());
		}
	}
	
	@Override
	public void run() {
		//아래는 사용자의 id
		String name = "";
		try {
			name = in.readUTF();
			
//			사용자가 접속햄ㅅ음을 sendToAll을 이용, 모두에게 알리는 것
//			sendToAll("#" + name + "님이 접속하였습니다.");
//			사용자의 id, outputstream을 Map에 Put한다.
			
			clients.put(name, out);
			System.out.println("현재 접속한 사용자 수 : " + clients.size() + "명");
			
			while(in != null) {
				//메시지 전송칸
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
//			사용자가 채팅룸 나간 경우 해당 id를 map에서 삭제
			clients.remove(name);
			System.out.println(socket.getInetAddress() + "님이 퇴장함.");
			System.out.println("현재 사용자 수 : " + clients.size());
		}
	}
}
