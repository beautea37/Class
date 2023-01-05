package oopEx1;

import java.util.Arrays;

public class CallByRef_Value {

	/*
	 * 매우 중요한 내용.
	 * 객체의 참조에 대해 꼭 생각하고 숙지해야한다.
	 * 
	 * CallByValue라는 개념은 메서드 간의 call 시 파라미터를 P-type으로 주고받는 경우에 일어난다.
	 * 이 때는 전에 JS시간에 말했듯 값을 보내기 전에 다른 메모리에 복사 후 복사된 메모리에서 값을 꺼내 전달하기 때문에 전달받은 쪽에서 값을 변경해도
	 * 전달한 쪽의 값은 변함이 없다.
	 */
	static void callByValue(int a) {
		a = a + 10;
		System.out.println("파라미터로 전달받은 a " + a);
	}
	static void callByRef(int[] arr) {
		arr[1] = 100;
		arr[2] = 200;
		arr[3] = 300;
		
		System.out.println("CallByRef에서의 배열 값 : " + Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		callByValue(a);
		System.out.println(a);
		
		int[] arr = {1, 2, 3};
		System.out.println("CallByRef() 호출 전 배열 값 : " + Arrays.toString(arr));
		callByRef(arr);
		System.out.println("CallByRef() 호출 전 배열 값 : " + Arrays.toString(arr));
		}
	}


