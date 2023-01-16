package javasql;
/*
 * 이 클래스는 JDBC Driver설정이 제대로 됐는지 확인하는 클래스
 * 기본적으로 Connection객체가 Java와 DB(Oracle)간의 통신을 하도록 하는 객체인데, 이 객체값이 NULL로 떨어지지만 않으면 정상적으로 연결된 것
 * 위 Connection이 연결된 것만 확인 후 SQL을 처리하는 부분은 이어 설명 예정
 * 
 * JDBC연결 순서. 위 Connection객체를 얻기 위한 순서이며, 이 순서는 불변이다. 즉 외우지 말고 그냥 가져다 쓰는 것.
 * 단, DB에 따라서 연결 값을 틀릴 수 있으나 순서는 같다.
 * 
 * 1. Class class를 이용해 JDBC드라이버를 로딩해야 한다.
 * 이 때 사용하는 메서드가 forName("JDBC DriverName")이다.
 * 제대로 build path가 설정되면 jdbc드라이버가 로딩된다.
 * 참고로 오라클의 드라이버 이름은 oracle.jdbc.OracleDriver이다. 
 * 
 * 2. JDBC드라이버가 제대로 로딩되었다면 다음은 DriverManaver인터페이스를 이용해 Connection을 맺어야 한다.
 * 이 때 제대로 연결 값이 설정되었다면, 위 매니저는 연결정보 (즉 유저 스키마 정보)를 담고 있는 Connection객체를 리턴한다.
 * 연결정보값은 DB마다 틀린데 오라클은 아래와 같다.(이 또한 불변이나  11g하위 버전은 틀릴 수 있다. 현재 우리 버전은 21c이다.
 * 
 * 
 * 2.1 드라이버 매니저에 들어갈 연결정보는 다음과 같다.
 * 2.1.1 Oracle 서버의 정보(즉 jdbc:oracle:this:@ip or 도메인 이름 : port
 * 사용하는 DB는 xe라서 처음 인스톨시 SID를 주게 되어있는데 default 가 xe이다.
 * 만약 다른 Edition(Oracle EnterPrise Server or Standard etc)등을 사용하면
 * 보통은 orcl(변경하지 않을 시)이 기본값이다.
 * 
 * 2.1.2 두 번째 파라미터로는 접근할 스키마정보. 계정 id
 * 2.1.3세 번째 파라미터는 위 계정의 암호값이다.
 * 
 * 3. 위 정보가 모두 올바르면 Connection이 맺어지고 해당 객체를 리턴한다.
 * 
 * 4. 리턴된 Connection을 받은 후부터는 SQL을 날려 DML(데이터 조작), DDL(데이터 정의) 등을 할 수 있게된다.
 * 
 * 
 */
public class connectionTestEx {
	public static void main(String[] args) {
		
	}
}
