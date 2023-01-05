package utilEx;
// https://projectlombok.org/download에서 최신 lombok.jar를 C:\가 아닌 다른 루트 드라이브에 다운로드 받아라.
//롬복 실행 > 롬복 이클립스 연결 >  myjava에 lib 폴더 만들고 롬복 카피. > 롬복 우클릭 > build path > add to build path
public class UseRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member = new Member("Cho", "조기제", 10);
		Member member2 = new Member("Jenny", "박정현", 5);
		
		System.out.println(member.id());
		System.out.println(member.name());
		System.out.println(member.age());
		
		System.out.println(member2.id());
		System.out.println(member2.name());
		System.out.println(member2.age());
		
		System.out.println(member.toString());
		System.out.println(member.hashCode());
		System.out.println(member2.hashCode());
		
		System.out.println(member.equals(null));
	}

}
