package utilEx;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
	 * SimpleDateFormat : 가장 많이 쓰이는 날짜 포메터
	 * 지정된 Letter를 조합해서 Date 객체를 format()에 파라미터를 넘기면 포맷대로 출력된다.
	 * 
	 * Letter를 조합하여 만든걸 pattern이라고 하는데 이 패턴을  SimpleDateFormat의 생셩자에 넘기면 그대로 포메팅 된다.
	 */
public class SimpleDtFormatEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();

		SimpleDateFormat sdf1, sdf2, sdf3, sdf4, sdf5;

		sdf1 = new SimpleDateFormat("yyy-MM-dd");
		sdf2 = new SimpleDateFormat("yy년 MMM dd일 E요일");
		sdf3 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		sdf4 = new SimpleDateFormat("yyyy년 MM-dd hh:mm:ss a");
		sdf5 = new SimpleDateFormat("yyyy년 KK a");
		
		//위 cal 객체를 Date객체로 변환, format 파라미터로 넘긴다.
		System.out.println(sdf1.format(cal.getTime()));
		System.out.println(sdf2.format(cal.getTime()));
		System.out.println(sdf3.format(cal.getTime()));
		System.out.println(sdf4.format(cal.getTime()));
		System.out.println(sdf5.format(cal.getTime()));
		
	}

}
