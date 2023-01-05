package utilEx;

import java.util.Date;

public class DateEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *System.currentTimeMillis() : 시스템으로부터 현재시간을 long으로 리턴함 
		 */
		System.out.println(System.currentTimeMillis());
		
		Date now = new Date();
		Date now2 = new Date(System.currentTimeMillis() + (1000 * 60*60));  //시간을 늘릴 수 있다. 1000(1초) * 60(분) * 60 = 1시간
		System.out.println(now);
		System.out.println(now2);
		now.setTime(System.currentTimeMillis() + (1000*60*60*24));
		System.out.println(now);
		now.getTime(System.currentTimeMillis());
		System.out.println(now);
	
		
		
		
	}

}
