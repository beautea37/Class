package utilEx;

import java.util.Calendar;

public class CalenderExam {
	static String toString(Calendar cal)	 {
		return cal.get(Calendar.YEAR) + "년 " + cal.get(Calendar.MONTH)+1 + "월 " + cal.get(Calendar.DATE) + "일";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		  Calendar rightNow = Calendar.getInstance();
//		  System.out.println(rightNow);
		  final String[] DAY_OF_WEEK = {"", "일","월","화","수","목","금","토"};
		  
		  Calendar rightNow = Calendar.getInstance();
		  Calendar rightNow2 = Calendar.getInstance();
		  
		  rightNow.set(Calendar.YEAR, 2022);
		  rightNow.set(Calendar.MONTH, 0);
		  rightNow.set(Calendar.DATE, 4);
		  
		  System.out.println("rightNow는   " + toString(rightNow) + " " +
				  DAY_OF_WEEK[rightNow.get(Calendar.DAY_OF_WEEK)] + "요일입니다.");
		  System.out.println("rightNow2는 " + toString(rightNow2) + " " +
				  DAY_OF_WEEK[rightNow2.get(Calendar.DAY_OF_WEEK)] + "요일입니다.");
	long differ = (rightNow2.getTimeInMillis() - rightNow.getTimeInMillis())/1000;
	System.out.println("작년부터 지금까지 " + differ + "초 지남");
	System.out.println("작년부터 지금까지 " + differ/60/60/24 + "일 지남");
	
	}

}
