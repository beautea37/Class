package utilEx;

import javax.annotation.processing.Generated;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//https://projectlombok.org/download에서 최신 lombok.jar를 C:\가 아닌 다른 루트 드라이브에 다운로드 받아라.
//롬복 실행 > 롬복 이클립스 연결 >  myjava에 lib 폴더 만들고 롬복 카피. > 롬복 우클릭 > build path > add to build path

//@Data	이 어노테이션은 getter, setter, toString, hashcode, equals()를 자동으로 생성

@Data
class Student {
	private String id;
	private String name;
	private int age;
}
//@NoArgsConstructor		//기본생성자를 포함시킨다.
//@AllArgsConstructor		//필드 초기화 생성자를 포함시킨다.
//@RequiredArgsConstructor	//기본적으로 생성자라 포함, 만약 final 또는 @notnull이 붙은 필드가 있다면 이 필드만 초기화하는 생성자를 포함.
//@Getter //getter 포함
//@Setter // Setter 포함
//@EqualsAndHashCode  //equal, hashCode포함
//@ToString  // tostring 포함

@NoArgsConstructor
@Data
@AllArgsConstructor

class Student2 {
	private String id;
	private String name;
	private int age;
}

@Data
class Student3 {
	private final String id = "Jenny";
	@NonNull private String name;
	private int age;
}

public class UseLombok {

	public static void main(String[] args) {
		Student stu1 = new Student();
		Student3 stu3 = new Student3("조기제");
		
		System.out.println(stu1);
	}
}



