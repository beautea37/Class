package basic;
import java.io.IOException;

public class delete {
   public static void main(String[] args) throws IOException {
      int num1 = System.in.read() - 48;
      int num2 = System.in.read() - 48;
      char yon = (char)System.in.read();
      int result = num1 + num2;
      
      System.out.println("첫 수는? " + num1);
      System.in.read();
      System.in.read();


      System.out.println("더할 값을 입력하쇼" + num2);
      System.in.read();
      System.in.read();
      
      
      System.out.println("결과는 : " + result);
      
   }
}