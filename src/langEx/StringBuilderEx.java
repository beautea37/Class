package langEx;

public class StringBuilderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb = sb.append(new String("Java World...졸려도 일어나세요!!").toCharArray());
		
		System.out.println(sb.capacity());
		System.out.println(sb.delete(0, 5));
		sb.ensureCapacity(200);
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.capacity());
		System.out.println(sb);
//		System.out.println(sb.delete(0, 18));
		
		 //18번 index
		//sb 결과 내용에 insert를 이용해 아래 addMsg를 일어나세요 앞에 추가해보세요.
		char[] addMsg = "기지개좀 켜고".toCharArray()	;
		sb.insert(sb.indexOf("일어"), addMsg);
		System.out.println(sb);
		
		
		sb.setCharAt(0, 'k');
		System.out.println(sb);
		
		sb.setLength(9);
		System.out.println(sb);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
