package basic;

public class Fruit {

	public static void main(String[] args) {
	 /* 6. 여러분이 과수원을 한다고 생각하시고 하루에 생산되는 과일의 평균을
	 * 구하는 로직을 작성합니다. 과일로는 사과, 배, 오렌지가 있고
	 * 각각 3, 5, 9 개씩 하루에 생산 됩니다.
	 * 하루를 기준으로 시간당 몇개가 생산되는지를 출력하세요
	 * 단 아래의 조건을 만족 시키세요.
	 * a.반드시 한번의 casting 을 사용하세요.
	 * b.결과 값은 float 타입으로 선언된 변수에 담고 출력시키세요
	 * c.반드시 한번의 리터럴을 사용하세요.
	 * d.위 문제는 Fruit.java 파일을 생성후 main() 내부에 정의하세요.
	 */

		
		
		
		
	int apple = 3;
	int pear = 5;
	int orange = 9;
	/*
	int total = apple + pear + orange;
	int ave = total / 24;
	int ave = (int)float;
	
		System.out.println("하루 시간당 평균 " + ave + "개를 생산합니다.");
		*/
		
	int total = apple + pear + orange;
	float average = (float)(total/24); 



		System.out.println("시간당 과일 생산량은 " + average + "개입니다.");
		
		
		
		
		
		
		
		
		
	}
}

