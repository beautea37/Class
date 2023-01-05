package ioEx;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class PstreamExam {

   public static void main(String[] args) {
      File f = new File("message.log");
      FileOutputStream fos = null;
      PrintStream ps = null;
      
      Scanner sc = new Scanner(System.in);
      
      //사용자의 입력 값.
      String input = null;
      
      try {
         //File 에 Append 가 가능하도록 fos 생성.
         fos = new FileOutputStream(f,true);
         
         //PrintStream 의 메서드를 출력하기 위해 객체 생성
         ps = new PrintStream(fos);
         
         System.out.println("ㅎㅇ 메시지 적고 끝낼거면 q눌러");
         
         while(true) {
            System.out.println("msg : ");
            input = sc.nextLine();
            if(input.equalsIgnoreCase("q")) {
            	System.out.println("좋은 하루");
            	System.exit(0);
            	break;
            }
            
            ps.println(input);
            ps.flush();
         }
         ps.close();
      }catch (Exception e) {
         System.out.println(e.getMessage());
      }
   }
}