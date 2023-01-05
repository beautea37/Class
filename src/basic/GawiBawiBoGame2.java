package basic;
import javax.swing.JOptionPane;

public class GawiBawiBoGame2 {

	public static void main(String[] args) {
		int gameStart, randomNum;
		String selectUser;
		String selectCom = null;
		String result = null;
		
		// 게임 하실건지??
		gameStart = JOptionPane.showConfirmDialog(null, "게임하실래여?");
		if(gameStart != 0) {
			JOptionPane.showMessageDialog(null, "안할거면 나가요");
			System.exit(0); 
		}
		// 게임 하실건지에서 0 선택시 아래 실행 
		selectUser = JOptionPane.showInputDialog("가위,바위,보 중에 입력하세요");
		randomNum = (int) (Math.random() * 3 + 1); // 유저값 입력시 랜덤 숫자 생성
		
		//랜덤 숫자 컴퓨터 값 부여 스위치
		switch (randomNum) {
		case 1: selectCom = "가위";
			break;
		case 2: selectCom = "바위";
		break;
		case 3: selectCom = "보";
		break;
		default:
			break;
		}
		//랜덤 숫자 컴퓨터 값 부여 스위치 끝

		if(!selectUser.equals("가위") && !selectUser.equals("바위") && !selectUser.equals("보")) {
			JOptionPane.showMessageDialog(null, "틀린값입니다. 가위바위보중에 입력하세요"); 
			System.exit(0);// "가위","바위","보" 중에 안내면 종료
		}else if(selectUser.equals("보") && selectCom.equals("바위")||
				 selectUser.equals("가위") && selectCom.equals("보")||
				 selectUser.equals("바위") && selectCom.equals("가위")){
			result = "축하합니다! 유저의 승리 "; // 이기거나
		}else if(selectUser.equals(selectCom)){
			result =  "비겼습니다."; // 비기거나
		}else {
			result =  "ㅜㅜ 컴퓨터의 승리 "; // 지거나
		}
		// 결과 출력
		JOptionPane.showMessageDialog(null, result + "( 컴퓨터: "+selectCom+" 유저 :"+selectUser + ")");
		System.exit(0); 
		
	}
}
/*
 * 가위바위보 게임을 만드세요.
 * 조건을 아래와 같습니다.
 * 1.프로그램을 시작하면 게임 하실래요?(y/n) 라고 묻고 y입력시 게임시작됩니다.
 * 2.시작되면 사용자에게 값을 입력토록 하세요(가위,바위,보 중 하나)
 * 2.1 만약 위 값이 아닌 다른값이 들어오면 "틀린 값입니다." 출력 후 프로그램 종료
 * 3.만약 올바른 값이 입력되면, Math.random() 을 이용해서 1 ~ 3 까지 생성하세요
 * 4.생성된 값을 이용해서 사용자와 컴퓨터간의 게임을 진행후 아래처럼 출력시키세요
 * 5.축 당신 승(컴 : 보, 당신 : 가위) or ㅠㅠ 컴 승(컴 : 주먹, 당신 : 가위)
 * 6.위 메세지가 출력된 후 프로그램을 종료 하세요 . 
 */
