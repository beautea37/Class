package netEx;

import java.awt.image.ImagingOpException;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

/*
 * JSON 데이터 형식 : JSON은 네트워크 상에서 데이터를 주고받는 형식 중에 가장 유명하고 많이 쓰이는 형식이다.
 * 형태는 Map과 유사하며 key:value형태로 데이터를 저장 관리한다.
 * 그런데 이렇게 key:value 로만 생성하면 데이터의 한계가 있기 때문에 여기에 객체와 배열까지 추가하여 실질적으론 모든 데이터를 표기 가능한 형식이다.
 * 
 * 형식 1 : {} 중괄호는 JSON의 데이터 기본형식 구문이다.
 * 형식 2 : 위 괄호 내에 다음처럼 key : value를 추가한다.
 * 2-1 : "속성명": 속성값, "속성명" : 속성값..........
 * 2-2 : 2-1의 규칙 > 속성명은 반드시 ""로 감싸야 한다.
 * 값으로 가능한 것은 "문자열(반드시더블쿼트로)", number, boolean, 객체{}(내부적으로 값이 객체 형태인 것은 {}를 이용해서 정의해야함. [] > 배열
 * 2-3 : 배열은 각각의 값을 ","로 구분하여 정의할 수 있다.
 * 값으로 가능한 타입은 "문자열", numbeer, bolean, {객체}, [배열]
 * 
 * 참고로 객체를사용해야할 필요가 있는 경우는 아래와 같다.
 * 예를 들어 이름 : 값은 1 key에 1 value가 일반적이지만 전화번호 tel같은 경우엔 하나의 속성에 값으로는 home_tel, Cell_tell 등으로 나뉘어질 수 있다. 이때 객체를 이용한다.
 * 
 * 배열은 알다시피 하나의 속성에 값이 다양할 때 사용된다.
 * 
 * http://github.com/stleary/JSON-java
 * Example
 * {
 * "name" : 
 */
public class JSONEx1 {

	public static void main(String[] args) throws IOException {
		//json객체 생성
		JSONObject root = new JSONObject();
				
		//속성 부여
		root.put("id", "joe");
		root.put("name", "조기제");
		root.put("age", 30);
		root.put("isStu", false);
		//일반 속성 값
		
		//다시 속성이 나열될 경우에는 새로운 jsonobjet를 생성해 값을 추가
		
			JSONObject telNums = new JSONObject()	;
			telNums.put("Home", 123456);
			telNums.put("Cell", 12345);
			telNums.put("Emergency", 1234);
		
			//취미 부여. hobby라는 속성엔 하나 이상의 값만 존재라서 객체가 아닌 배열이 맞다.
//			하지만 json에선 배열도 객체로 표기해야 하니
			//jsonarray를 생성, put만 이용해 값을 넣는다.
			JSONArray hobby = new JSONArray();
			hobby.put("스포츠");
			hobby.put("수영");
			hobby.put("프로그래밍");
		
		//hobby 또한 노재현에 관련된 객체 정보니까 다시 put해야 한다.
			
			root.put("hobby", hobby);
			String objString = root.toString();
			System.out.println(objString);
			
			try {
				FileWriter fw = new FileWriter("info.json");
				fw.write(objString);
				
				fw.flush();
				fw.close();
				
				
			}catch (ImagingOpException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		
		
		
		
		
		
		
		
		
		
	}
}
