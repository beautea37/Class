package netEx;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONObject;

public class JSONParserEx {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("info.json"));
		String json = br.readLine();
		br.close();
		
		//Json 파싱
		JSONObject root = new JSONObject(json);
		System.out.println("id : " + root.getString("id"));
		System.out.println("name : " + root.getString("name"));
		System.out.println("학생 여부 : " + (root.getBoolean("isStu") == false?"N":"Y"));
		System.out.println("나이 : " + root.getInt("age"));
		
		JSONObject tel = root.getJSONObject("telNums");
		System.out.println(tel.getInt("home"));
		System.out.println(tel.getInt("Cell"));
		System.out.println(tel.getInt("Emergency"));
		
	}
}
