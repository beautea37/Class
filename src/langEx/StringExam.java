package langEx;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;

import org.graalvm.compiler.hotspot.aarch64.AArch64HotSpotLoadAddressOp;

public class StringExam {

	public static void main(String[] args) throws UnsupportedEncodingException {

//		""을 이용해 생성된 문자열은 모두 String pool에 저장되고 새로운 리터럴을 생성할 시엔 모두 pool내에 같은 값이 있는 개체가 존재하는지,
//		만약 있다면 해당 Ref를 리턴한다. 이 조건은 오직 ""(리터럴)String 객체에만 적용된다.

//		String a = "abc";
//		String b = "abc";
//
//		String c = new String();
//		String d = new String();
//
//		if (d == b) {
//			System.out.println("같은 객체, 값도 같다");
//		} else {
//			System.out.println("틀린 객체, 값이 같은지는 모름");
//		}
//		if (b.equals(d)) {
//			System.out.println("다른 객체지만 값은 같음");
//		} else {
//			System.out.println("다른 문자열 객체이며 값도 틀리다");
//		}
//
//		byte[] bArr = { 65, 66, 67, 68, 69 };
//		bArr = "안녕하세요.".getBytes();
//		System.out.println(bArr);
//
//		System.out.println(Arrays.toString(bArr));
//
//		String bStr = new String(bArr, 2, 6);
//		System.out.println(bStr);
//
//		System.out.println(Charset.availableCharsets());
//
//		Charset charset = Charset.defaultCharset();
//		System.out.println(charset);
//
//		char[] chArr = { '오', '늘', '하', '루', '고', '생', '함' };
//		String chStr = new String(chArr);
//		System.out.println(chStr);
//		
//		System.out.println((int)("오".charAt(0)));
//		
//		char[] uniCodes = chStr.toCharArray();
//		int[]	converUni = new int[uniCodes.length];
//		for(int i = 0; i<uniCodes.length; i++) {
//			converUni[i] = uniCodes[i];
//		}
//		System.out.println(Arrays.toString(converUni));
//		
//		String uniStr = new String(converUni,0,converUni.length);
//		System.out.println(uniStr);
//		

//		//내가 삽질한거
//		String myMsg = "오늘의 자바는 문자열 객체까지 했습니다.";
//		byte[] aaa = myMsg.getBytes();
//		String ddd = aaa.toString();
//		String ccc = new String(ddd);
//		
//		System.out.println(aaa);
//		System.out.println(ddd);
//		System.out.println(ccc);
//		
//		System.out.println(Arrays.toString(aaa));
//		
//		char[] xxx = myMsg.toCharArray();
//		String[] yyy = new String[xxx.length];
//		String zzz = new String(yyy,0,yyy.length);
//		
//		
//		System.out.println(yyy.toString());

//		byte[] bt = "오늘의 자바는 문자열 객체까지 했습니다.".getBytes();
////		String btStr = new String(bt, 0, bt.length, "ISO-8859-1");
//		String btStr = new String(bt, 0, bt.length);
//		System.out.print(btStr);
//		
//
//		System.out.println(btStr.length());
//		
//		for(int i=0; i<btStr.length(); i++) {
//			char ch = btStr.charAt(i);
//			System.out.println(ch);
//		}
//		System.out.println();
//		System.out.println(Integer.toHexString(btStr.codePointAt(0)));
//		
//		char uniCar = '\uc624';
//		System.out.println(uniCar);
//		
//		String msg = "오늘";
//		String msg2 = msg.concat("하루도 즐겁게");
//		System.out.println(msg);
//
//		System.out.println(msg2.contains("즐겁게"));
//		
//		
//		 String hi = String.copyValueOf(new char[] {'h', 'e'});
//		 System.out.println(hi);
//		 
		String email = "asdf123@naver.com";
		if (email.endsWith(".com") || email.endsWith("co.kr")) {
			System.out.println("올바른 서버명입니다.");
		}

		// format() : static이면서 문자열, 수치형 등을 모두 특정 형식대로 포맷하여 설정할 수 이다.
		/*
		 * 간단한 문법들 %d(10진수), %s(문자열), %f(실수), Locale(날짜 등의 형식) 기본적으로 포맷을 적용하면 우측정렬이다. 만약
		 * - 표시를 하면 왼쪽 정렬이 될 것이다.
		 */

		int i = 23;
		System.out.println(String.format("%d", i));
		System.out.println(String.format("%d_", i));
		System.out.println(String.format("%5d_", i));
		System.out.println(String.format("%-5d_", i));
		System.out.println(String.format("%05d_", i));

		// 십진수 정수의 큰 값을 특정 포맷대로 출력시켜보기
		int i2 = 123456789;
		System.out.println(String.format("%,d", i2));
		System.out.println(String.format("%,015d", i2));

		// 문자열 표시하기
		String str = "hello";
		System.out.println(String.format("%s", str));
		System.out.println(String.format("%s_", str));
		System.out.println(String.format("%5s_", str));
		System.out.println(String.format("%-12.2s", str));

		// 실수형 표기 키워드 f
		double n = 123.456789;
		System.out.println(String.format("%f", 3.4));
		System.out.println(String.format("%f", n));
		System.out.println(String.format("%.3f", n));

		// 이메일

		int idx = email.indexOf('n', email.indexOf('n') + 1);
		System.out.println(idx);

		if ("".isEmpty()) {
			System.out.println("문자열에 값이 없어요");

		}
		
		// delimeter는 문자열의 구분자를 뜻한다. ",/"
		String deliStr = "Hello, My, Friend";
		deliStr = String.join("-", "Hello", "Java", "World");
		System.out.println(deliStr);

		System.out.println(email.lastIndexOf('-')); // -1

		email.replace('@', 'a');
		System.out.println(email);

		
		// 이메일의 서버명, green.com으로 변경
		String server = email.substring(email.indexOf('@') + 1);
		String id = email.substring(email.indexOf('@'));
		String newServer = server.replace(server, "green.com");

		String newEmail = id.concat(newServer);
		System.out.println(newEmail);
		
		String sdfdsf = "     h         ";
		System.out.println(sdfdsf.trim().length());
		
		int aa = 11;
		String aaStr = String.valueOf(aa);
		System.out.println(aaStr + 1);
		
		
		/*
		 * 사용자 이메일을 받아 아래 조건 출력
		 * 
		 * 1. 아이디 입력
		 * 입력후 빈문자열인지 검사
		 * 빈문자열 아니면 아래처럼 검사
		 * 아이디와 서버로 분리해 id를 검증(idValidate()
		 * 기리가 8~12자 사이고 반ㄷ시 ㅓㅅ 자는 대문자
		 * 
		 * 또한 id중에는 반드시 숫자가 하나 이상 있어야
		 * 만약 위 조건ㅇㅣ틀리면 뭐가  틀렸는지 메시지 띠우고 모두 정상이면 로그인 되게끔
		 * 
		 */
		
	}
}
