package Gbb;

public class Gawibawibo {

	MemberDTO member;

	private void start() {
		// 이 메서드가 호출되면 play가 호출되어 게임 인이 시작됩니다.
		member = new MemberDTO();

	}

//	private void play() {
//		// 여기서 사용자 이메일 입력받는 객체 생성, 입력받는 메서드 호출해라.
//		member = new MemberDTO();
//	}
//	private void rcp() {
//		rock();
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Gawibawibo().start();

		}
}
