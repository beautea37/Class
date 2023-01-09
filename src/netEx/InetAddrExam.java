package netEx;

import java.net.InetAddress;
import java.util.Arrays;

public class InetAddrExam {

	public static void main(String[] args) {
		try {
			// localhost의 InetAddress객체 얻기.
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 PC의 IP주소 : " + local.getHostAddress());
			System.out.println(Arrays.toString(local.getAddress()));
			System.out.println(InetAddress.getLoopbackAddress());

			// daum에 대한 호스트 정보 얻기
			InetAddress[] daum = InetAddress.getAllByName("www.naver.net");
			for (InetAddress addr : daum) {
				System.out.println("다음에 할당된 IP : " + addr.getHostAddress());
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}