package utilEx;

import java.util.ArrayList;

/*
 * 이 클래스는 DB에 접근해서 데이터를 select, insert, update, delete하는 기능의 DAO이다.
 * 기본적으로 Singleton방식으로 정의할 것.
 * 그렇기 때문에 생성자는 private으로 정의하고 static 메서드를 이용해 외부 객체가 instance할 수 있도록 정의한다.
 * 매우매우매우 중요!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 */
public class StudentDAO {

	private static StudentDAO instance = new StudentDAO();

	private StudentDAO() {
		// 딱 하나의 instance만 리턴하도록 메서드를 정의해 이 메서드를 통해서만 사용하게끔 해야한다.
	}

	public static StudentDAO getInstance() {
//		return this;  //this는 스태틱 안에서 못쓴다! 넌스태틱이기 때문ㅇ!
		return instance;
	}

	// 넘겨받은 DTO를 DB에 insert한다고 가정하고 출력하게끔 하는 메서드 정의
	public void putDtos(ArrayList<StudentDTO> list) {
		for(int i = 0; i<list.size(); i++) {
			StudentDTO dto = list.get(i);
			System.out.println(dto.getNumber());
			System.out.println(dto.getName());
			System.out.println(dto.getGroup());
			System.out.println(dto.getTel());
		}
	}
}









