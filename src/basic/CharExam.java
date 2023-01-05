package basic;

public class CharExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			char c = 'a'; //싱글쿼트, 문자 하나만 받을 수 있다.
			System.out.println(++c + 1);
	
   //char 기본값은 |u0000
	char c2 = '\u0000';
	System.out.println(c2);
	
	c2 = '조';
	System.out.println((int)c2);
	
	c2 = 45432;
	System.out.println(c2);
	
	short s = (short)c2;
	System.out.println(Integer.toHexString(45432));
	
	/*자바 escape 문자열.
	 * escape란 출력 시 특정 기호를 사용하여 탭, 라인변경, 줄바꿈 등을 할 수 있는 문자.
	 * 사용법은 반드시 문자열 내에 \(escape)를 사용해야 한다.
	 * n 라인 변경, t 탭, r, n  엔터 ,//역슬래시. ' 싱글쿼트
	 */
	System.out.print("1\'" + "A" + "\'\\");
	System.out.println("2");
	}
}