package ioEx;
/*
 * 객체 직렬화 및 Object InOutputStream : 객체를 통째로 파일이나 특정 대상에 쓰고, 읽을 수 있는 스트림
 * 직렬화 대상 객체는 반드시 Serialization타입이어야 하며 직렬화해서 보내게 되면 필드들과 그 값이 모두 전송되어 쓰여진다.
 * 이 때, 직렬화의 비대상 필드는 static, transient 필드임.
 * static의 클래스 소유이기 때문이고 transient 키워드는 휘발성 요소로 필드를 관리할 때 사용된다.
 * (예를 들어 중요한 정보는 객체직렬화에서 빼고 싶다면, transient 선언을 하면 된다.
 * 직렬화 및 역직렬화를 할 때 JVM은 같은 크래스 버전인지를 확인 후 역직렬화한다.
 * 따라서 특정 객체를 직렬화시 반드시 직렬화 버전(시리얼넘버)를 유니크(Unique)하게 줘야하고
 * 두 값이 같아야 역직렬이 되어진다. 필히 기억해야 한다.
 *  
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Builder
//직렬화 대상인 Member, Product라는 클래스를 정의한다. 모두 Serialization을 구현한다.
class Member implements Serializable  {
	public Member(String id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 7390600849941212532L;
	// 직렬화 대상인 멤버필드를 선언한다.
	private String id;
	private String name;
	// 아래 두 개는 직렬화 대상에서 제외된다.
	private static int clsNum = 612;
	private transient String password = "1234";
}

@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
class Product implements Serializable {
	private String name;
	private int price;

//	public Product(String name, int price) {
//		super();
//		this.name = name;
//		this.price = price;
//	}
}

public class ObjectInOutEx {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("objectOut.dat");
		// 객체 출력 스트림.
		ObjectOutputStream oop = new ObjectOutputStream(fos);

		// Member 객체 생성
		Member member = Member.builder()
		.id("asdf01")
		.name("조기제")
		.password("1234")
		.build();
		
		Product p = Product.builder()
			.name("TV")
			.price(2500)
			.build();
		
		int[] arr1 = {1,2,3};
		
		oop.writeObject(member);
		oop.writeObject(p);
		oop.writeObject(arr1);
		
		oop.flush();
		oop.close();
		
		System.out.println("객체가 파일에 잘 쓰여짐");
		
		//쓰여진 객체를 역직렬화 해서 읽는다.
		//역직렬화는 클래스의 버전을 보고 알아서 하기 떄문에, 버전만 맞다면 그냥 읽으면 된다.
		
		ObjectInputStream ios = new ObjectInputStream(new FileInputStream("objectOut.dat"));
		
		//읽을 땐 쓴 순서 그대로 읽어서 클래스 캐스팅을 통해 Ref합니다.
		Member member2 = (Member)ios.readObject();
		Product p2 = (Product)ios.readObject();
		int[] arr2 = (int[])ios.readObject();
		
		ios.close();
		
		System.out.println(member2);
		System.out.println(p2);
		System.out.println(arr2);
		
		

		/*
		 * 풀 잎새 따다가 엮었어요. 예쁜 꽃송이도 넣었구요.
		 * 그대 노을빛에 머리 곱게 물들면 예쁜 꽃모자 씌워주고 파
		 * 냇가에 고무신 벗어놓고 흐르는 냇물에 발 담그고
		 * 언제쯤 그 애가 징검다리를 건널까 하며 가슴은 두근거렸죠
		 * 흐르는 냇물 위에 노을이 분홍빛 물 들이고 어느새 구름 사이로 저녁 달이 빛나고 있네~
		 * 노을빛~ 냇물위에 예쁜 꽃모자 떠가는데 어느 작은 산골 소년의 슬픈 사랑 얘기
		 * 노을빛~ 냇물 위엔 예쁜 꽃모자 떠가는데~ 어느 작은~ 산골 소년의 슬픈 사랑 얘기
		 */
		
		/*
		 * This is the way you left me, i am not pretending.
		 * No hope, no love, no glory, no happyending
		 * 
		 * This is the way that we love, like its forever.
		 * Then live the rest of our life,
		 * both not together..
		 */
		/*
		 * Wrong information always shown by the media.
		 * Negative images is the main criteria.
		 * Infecting the young mind is faster than bacteria.
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
