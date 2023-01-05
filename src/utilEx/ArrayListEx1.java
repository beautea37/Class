package utilEx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListEx1 {

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list 1 : " + list1);
		System.out.println("list 2 : " + list2);
		System.out.println();
	}

	public static void main(String[] args) {

//		List list1 = new ArrayList();
//
		ArrayList list2 = new ArrayList();
//		Collection list3 = new ArrayList();
		
		list2.add(1);	list2.add(3);	list2.add(5);	list2.add(6);	list2.add(3);	list2.add("1");	list2.add(Integer.valueOf(3));
		
//		list2의 일정부분을 분리해 새로운 ArrayList를 생성하는 법
//		ArrayList list3 = (ArrayList)list2.subList(1, 4);
		ArrayList list3 = new ArrayList(list2.subList(1, 4));
		
		print(list2, list3);
		
		//add()를 이용해 추가해보겠다.
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		print(list2, list3);
		
		list2.set(3,  "kkk");  //교체하는거
		print(list2, list3);
		
		list2.retainAll(list3); //중복값만 출력
		print(list2, list3);
		
		//정렬. 기본적으로 Collection 클래스에는 이런 Collection 하위 타입에 대한 지원메서드가 많이 존재한다. 정렬을 해보자.
		Collections.sort(list2);
		Collections.sort(list3);
		print(list2, list3);
		
		//특정 리스트가 값으로 존재하는지 파악하는 법
		System.out.println(list2.containsAll(list3)); //list3이 list2에 포함되어 있느냐
		
		//특정 객체가 존재하는지 알아보기
		System.out.println(list2.contains(2));		//2가 있느냐
		System.out.println(list2.indexOf(5));		//5가 몇 번쨰에 있느냐
		
		//get(), remove()를 이용해 Element 삭제하기
		for(int i = list3.size()-1; i >= 0; i--){
			if(list2.contains(list3.get(i)))	{
				list2.remove(i);
			}
		}
		print(list2, list3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
