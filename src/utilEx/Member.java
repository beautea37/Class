package utilEx;
	/*
	 * 자바의 record는 DTO와 유사한 개념으로 초기화를 생성자로 한다. 따라서 초기화 필드값을 생성자에 넣어주면
	 * 자동으로 해당 객체가 초기화되고 자동으로 getter, toString, hashCode(), Equals()메서드를 생성해준다.
	 * 참고로 자동으로 getter가 생성되어도 호출할 때에는 getXXX()가 아니라 record.fieldName()으로 호출해야 한다.
	 */
public record Member(String id, String name, int age) {
	
}
