package utilEx;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

/*
	 * 이진 트리기반 맵, 키와 밸류를 같이 저장하는건 같다. 단 key를 기준으로 자동 정렬된다.
	 * 검색관련 메서드는 해당 TreeMap클래스에만 존재해서 이 메서드를 활용하기 위해서는 다형성으로 생성 불가하다.
	 */
public class TreeMapExam {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		
		treeMap.put("Orange", 1000000);
		treeMap.put("Kiwi", 500);
		treeMap.put("Apple", 1000);
		treeMap.put("기제", 300);	
		treeMap.put("자바", 1);
		treeMap.put("JS", 10);
		
		
		//기본. 정렬된 트리 출력해보기.
		Set<Entry<String, Integer>>entrySet = treeMap.entrySet();
		
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println("key : " + entry.getKey() + ", value : " + entry.getValue());
		}
		
		//특정 키에 대한 정보 얻는 법
		Entry<String, Integer> entry = null;
		entry = treeMap.firstEntry();
		System.out.println("firstEntry의 key은 " + entry.getKey());					//firstEntry는 value값이 가장 높은 아이
		System.out.println("firstEntry의 value은 " + entry.getValue());
		entry = treeMap.lastEntry();
		System.out.println("lastEntry의 key는" + entry.getKey());						//lastEntry는 value값이 가장 낮은 아이
		System.out.println("lastEntry의 value는" + entry.getValue());
		entry = treeMap.lowerEntry("기제");
		System.out.println("lowerEntry의 key는" + entry.getKey());					//key값 '기제'를 기준으로 낮은데 가장 높은 애 출력
		System.out.println("lowerEntry의 value는" + entry.getValue());
		
		NavigableMap<String, Integer> descMap = treeMap.descendingMap()	;
		Set<Entry<String, Integer>> descSet = descMap.entrySet();
		
		for(Entry<String, Integer> e : descSet) {
			System.out.println(e.getKey() + " : "  + e.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static Object entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

}
