package langEx;

public class IntegerExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Wrapper 클래스 : 자바의 모든 P type의 정보를 관리하는 클래승
		 */
		int i = Integer.valueOf(10) + 1;
		System.out.println(i);
		
		
		System.out.println(Integer.compare(11,  12));
		String s = "10.0";
		Double.parseDouble(s);
		System.out.println(s);
		
		System.out.println(Integer.toBinaryString(i));
	}

}
