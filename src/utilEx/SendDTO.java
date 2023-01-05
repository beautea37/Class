package utilEx;

import java.util.ArrayList;

/*
 * 이 클래스는 필요한 DTO객체를 필요한 만큼 생성해서 List Type으로 DAO에게 보내는 역할을 한다.
 */
public class SendDTO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentDTO dto1 = new StudentDTO();
		dto1.setGroup(3);
		dto1.setName("조기제");
		dto1.setNumber(5);
		dto1.setTel("12345");

		StudentDTO dto2 = new StudentDTO();
		dto2.setGroup(3);
		dto2.setName("임진우");
		dto2.setNumber(2);
		dto2.setTel("23456");

		StudentDTO dto3 = new StudentDTO();
		dto3.setGroup(3);
		dto3.setName("임유섭");
		dto3.setNumber(1);
		dto3.setTel("34567");

		StudentDTO dto4 = new StudentDTO();
		dto4.setGroup(3);
		dto4.setName("심지석");
		dto4.setNumber(4);
		dto4.setTel("45678");

		// 이게 Generic이다! Generic을 이용해 Element type을 제한한다.
		ArrayList<StudentDTO> members = new ArrayList<StudentDTO>();
		members.add(dto1);
		members.add(dto2);
		members.add(dto3);
		members.add(dto4);

		// putDtos(ArraysList<StudentDTO> list

		StudentDAO dao = StudentDAO.getInstance();
		dao.putDtos(members);

//		System.out.println(dto1.getNumber());
//		System.out.println(dto1.getName());
//		System.out.println(dto1.getTel());
//		System.out.println(dto1.getGroup());
//
//		System.out.println(members.indexOf(dto1));
//		System.out.println(members.indexOf(dto2));
//		System.out.println(members.indexOf(dto3));
//		System.out.println(members.indexOf(dto4));

	}

	private static char[] getNumber(StudentDTO dto1) {
		// TODO Auto-generated method stub
		return null;
	}

	private static char[] getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
}
