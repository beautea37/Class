package basic;

//import javax.swing.JOptionPane;
//
//public class Gawibawibo {
// public static void main(String[] args) {
//  String user = ""; //유저입력
//  String com = "";  
//  int mixSu = 0;    // 0~2 숫자를 랜덤으로 출력해서 저장하는 변수
//  
//  mixSu = (int)(Math.random()*3);
//  switch(mixSu){
//  case 0 : com = "가위"; break;
//  case 1 : com = "바위"; break;
//  default : com = "가위"; break;
//  }
//
//  user = JOptionPane.showInputDialog("가위/바위/보 중 한가지를 입력하세요.");
//  System.out.println("당신은 " + user+"을 냈고 "+"컴퓨터는 "+com+"을 냈군요.");
//  
//  getFight(com,user);
// }
// /* 가위바위보 결과를 출력하는 메소드*/
// static void getFight(String com, String user){
//  if(com.equals("바위")){
//   if(user.equals("바위")){
//    System.out.println("Draw");
//   }else if(user.equals("보")){
//    System.out.println("Win");
//   }else{
//    System.out.println("Lose");
//   }
//  }
//  if(com.equals("보")){
//   if(user.equals("보")){
//    System.out.println("Draw");
//   }else if(user.equals("가위")){
//    System.out.println("Win");
//   }else{
//    System.out.println("바위");
//   }
//  }
//  if(com.equals("가위")){
//   if(user.equals("가위")){
//    System.out.println("Draw");
//   }else if(user.equals("바위")){
//    System.out.println("Win");
//   }else{
//    System.out.println("Lose");
//   }
//  }
// }
//}

import javax.swing.JOptionPane;

public class Gawibawibo {
	public static boolean inputCheck = false;
	
	public static void main(String[] args) {

		
		// 난수를 이용하여 컴퓨터의 가위 바위 보를 정한다.
		String[] data = {"가위", "바위", "보"};
		int index = (int)(Math.random()*3); // 0~2사이의 난수 만들기
		String com = data[index];
		
		// 사용자로 부터 가위, 바위, 보 입력 받기
		String man = null;   // 사용자의 가위바위보가 저장될 변수
		
		// 카운트 다운 쓰레드 실행

		
		do{
			man = JOptionPane.showInputDialog("가위, 바위, 보를 입력하세요");
		}while(!man.equals("가위") && !man.equals("바위") && !man.equals("보"));
		
		inputCheck = true;  // 입력이 완료됨을 알려주는 변수값을 변경한다.
		
		// 결과 판정하기
		String result = "";
		if( man.equals(com) ){
			result = "비겼습니다.";
		}else if( (man.equals("가위") && com.equals("보"))
				 || (man.equals("바위") && com.equals("가위"))
				 || (man.equals("보") && com.equals("바위")) ){
			result = "당신이 이겼습니다.";
		}else{
			result = "당신이 졌습니다.";
		}
		
		// 결과 출력

		System.out.println("컴퓨터 : " + com);
		System.out.println("당  신 : " + man);
		System.out.println("결  과 : " + result);
	}
}

/**
 * 게임 타이머
 */

