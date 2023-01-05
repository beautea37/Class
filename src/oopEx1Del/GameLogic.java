package oopEx1Del;
import java.util.Scanner;

public class GameLogic {
	static Scanner sc = new Scanner(System.in);
	
	Stats stats = new Stats();
	//-----------------------생성자 정의---------------------------
	public GameLogic() {
		startLogic();
	}
	//-----------------------------------------------------------

	public void startLogic() { // 실제 게임로직 실행 메서드
		//--------------------변수 선언및 초기화----------------------
		String selectCom = null;
		String result = null;
		String selectUser = null;
		int newGame = 0;
		//--------------------------------------------------------
		
		//--------------------게임실행 할건지-------------------------
		System.out.print("게임할거면 0을 입력하시구 나갈거면 q를 입력하세요 : ");
		String gameStart = sc.next();
		if(!gameStart.equals("0")) {
			System.out.print("안할거면 나가요");
			System.exit(0); 
		}
		//--------------------------------------------------------
		
		//--------------------게임시작 종료하기전까지 반복--------------
		while(true){
			boolean flag = false;
			do {
			if(flag)
				System.out.println("틀린값입니다. 다시입력해주세요.");
			System.out.print("가위바위보 중에 입력하세요 :");
			selectUser  = sc.next();
			flag = true;
			}while(!selectUser.equals("가위") && !selectUser.equals("바위") && !selectUser.equals("보"));
			
			String[] com = {"가위","바위","보"};
			selectCom = com[(int)(Math.random() * com.length)];
				
			if(selectUser.equals("보") && selectCom.equals("바위")||
			   selectUser.equals("가위") && selectCom.equals("보")||
			   selectUser.equals("바위") && selectCom.equals("가위")){
				result = "축하합니다! 유저의 승리 "; // 이기거나
				stats.gameWin();
			}else if(selectUser.equals(selectCom)){
				result =  "비겼습니다."; // 비기거나
				stats.gameTie();
			}else {
				result =  "ㅜㅜ 컴퓨터의 승리 "; // 지거나
				stats.gameLose();
			}
			stats.gameCount();
			System.out.println(result + "( 컴퓨터: "+selectCom+" 유저 :"+selectUser + ")");
			System.out.println("1.뉴게임 2.전적보기 3.게임종료");
			newGame = sc.nextInt();
			switch (newGame) {
			case 3:
				System.exit(0);
				break;
			case 2:
				System.out.println(stats.printStats());
				System.exit(0);
				break;
			}
			//------------------------------------------------------------------
		}
		
		
		
	}

}