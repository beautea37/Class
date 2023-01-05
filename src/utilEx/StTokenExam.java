package utilEx;

import java.util.StringTokenizer;

public class StTokenExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "hell,Java,World";
		
		StringTokenizer st = new StringTokenizer(msg, ",");
		
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			System.out.println(s);
		}
	}

}
