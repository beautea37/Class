package basic;
//212212
//20230108 0051

//20230108 0108
public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 자바 배열(array) : 자바에서는 String, 배열은 모두 p type이 아닌 R type이다. 객체라는 뜻.
		 * 때문에 지금 알고있던 P type에 대한 개념과는 틀리니 잘 이해해야 한다.
		 * 배열을 생성할 때는 반드시 new라는 키워드를 이용해서 생성해야 한다.
		 * 또 배열은 객체라서 해당 객체를 ref하는 변수를 반드시 이용해서 뭔가 작업을 해줘야 한다.
		 * 즉, ref를 잃어버린 배열객체는 이후 더이상 사용 불가능하기 때문(몹쓸객체라는 뜻)
		 */
		
		//배열 생성식 1, 길이만 준다.
		int[] arr = new int[3]; //자바에서는 빈배열(length)가 없는 배열은 생성 불가.
		//따라서 반드시 length는 줘야한다.
		System.out.println(arr.length);
		//배열은 값을 주지 않고 생성하면 (기본배열객체) 자동으로 기본값으로 초기화됩니다.
		for(int a : arr)
			System.out.println(a);
		
		//배열 객체는 모든 타입(P and R type)을 배열로 생성할 수 있다.
		System.out.println("--------------------------------------------------------------");
		
		//배열생성식 2. 값을 주고 초기화하기.
		String strArr[] = {"Hello","World","Java"};
		for(String str : strArr)
			System.out.println(str);
			System.out.println(strArr);
			
		System.out.println("--------------------------------------------------------------");
		
		char[] stars = new char[] {'a','b','c'};
			System.out.println(stars);
		
		System.out.println("--------------------------------------------------------------");
			
			strArr = new String[3];
			System.out.println(strArr);
			for(String str : strArr)
				System.out.println(str);
			
		System.out.println("--------------------------------------------------------------");	
		
		char[] mych = 	new char[2]; //char2개의 length의 배열 생성된거. 값은 \u0000인거지 없는게 아니다.
		
		mych[0] = 'a';    //1번 배열에는 a라는 값을 기입한 것이다.
		mych[1] = 'b';
		//mych[2] = 'c';  
		//배열은 두갠데 세 번째 방까지 만들었다. f11했을 때 실행은 된다 ㅅㅂ 왜지?
		//왜냐면 문법상에는 문제가 없기 때문이다. 그래서 실행은 되는데 오류가 나온다. 알겠냐?
		for(int i = 0; i<mych.length; i++) {
			System.out.println(mych[i]);
		}
		
		System.out.println("--------------------------------------------------------------");			
		//	String[] tab, com, etc; 
		//	etc = new String[] {"가위", "바위", "보"};           //int처럼 선언만 미리 하고 값을 대입할거면 이런 식으로 써도 되나, 권고는 힘든 느낌... 아직 이해 잘 안됐음ㅋㅋ
		
			
			
			
			String[] com = {"가위", "바위", "보"};
			String comValue = com[((int)(Math.random()*com.length))];
			System.out.println(comValue);
			
		System.out.println("--------------------------------------------------------------");			
			
			
			
			
			
			
			
			
			
			
			
	}
}
