package utilEx;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

/*
 * 우리가 게임을 짤 때 메뉴를 보여주는 것처럼 특정 명령어(history)를 입력하면
 * 입력한 명영어를 입력 순으로(Queue)보여지도록 하는 구현 클래스입니다.
 */
public class UseCaseQueue {

	static Queue<String> q = new LinkedList<String>();
	static final int MAX_INPUT_SIZE = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("help를 입력하면 도움말 보기 가능");
		try {
		while (true) {
			System.out.println(">>> ");
			
			Scanner s = new Scanner(System.in);
			String input = s.nextLine().trim();

			if (input.equals(""))
				continue;

			if (input.equalsIgnoreCase("q")) {
				System.exit(0);
			} else if (input.equalsIgnoreCase("help")) {
				System.out.println("help 도움말 보기");
				System.out.println("q or Q : 프로그램 종료하기");
				System.out.println("history : 최근 입력 명령어를 " + MAX_INPUT_SIZE + "보여줍니다.");
			} else if (input.equalsIgnoreCase("history")) {
				int i = 0; // 저장된 명령어의 순번 Sequence

				// history 자체도 명령어다. 따라서 저장한다.
				saver(input);

				// 아래는 조금 있다가 배울 Iterable로 변환해서 Q에 있는 명령어를 추출한다.
				LinkedList<String> temp = (LinkedList<String>) q;
				ListIterator<String> it = temp.listIterator();
				
				// Iterator타입(내부 순환자)의 대표적 메서드로 요소가 존재하면 true 리턴, 이걸 이용해 요소의 끝까지 리턴받기가 가능하다.
				while (it.hasNext()) {
					System.out.println(++i + ". " + it.next());
				}
			} // End history
			else { // 그냥 명령어만 입력한 경우
				saver(input);
				System.out.println(input);
			}
		} // End while
	}	catch (Exception e) {
		System.out.println("입력오류");
	}
} // End Main

	public static void saver(String input) {
		if (!"".equals(input)) {
			q.offer(input);
		}
		// Q의 최대 크기를 넣으면 제일 처음 입력된 것은 삭제되게끔
		if(q.size() > MAX_INPUT_SIZE) {
			q.remove();
		}
		
	}
	// 사용자의 명령어를 저장하는 기능의 메서드 구현
}
