package Project1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Properties;

import javax.swing.JOptionPane;





public class CheckPassWord6 {

   public CheckPassWord6() throws IOException {
      check();
   }

   public void check() throws IOException {
      Properties prop = new Properties();
      prop.load(ClassLoader.getSystemResourceAsStream("db.properties"));
      
      FileOutputStream fos = new FileOutputStream("D:\\db.properties");
      String userPass;
      //String checkPass = prop.getProperty("password");
      String newPass;
      
      
      System.out.println(prop.getProperty("password"));
      do {
         userPass = JOptionPane.showInputDialog("기존 비밀번호를 입력하세요");
      
      } while (!userPass.equals(prop.getProperty("password")));

      if (userPass.equals(prop.getProperty("password"))) {

         newPass = JOptionPane.showInputDialog("새로운 비밀번호를 입력하세요");
         
   //      prop.replace("password" , newPass);
         
         prop.setProperty("password", newPass);
         prop.store(fos, null);
         
         Properties prop2 = new Properties();
         prop2.load(ClassLoader.getSystemResourceAsStream("db.properties"));
         
         System.out.println(prop.getProperty("password"));
         System.out.println(newPass);
         
         
         JOptionPane.showMessageDialog(null, "비밀번호 변경 완료");
         menu();
      }
   }

   
   void menu() throws IOException {
      Properties prop = new Properties();
      prop.load(ClassLoader.getSystemResourceAsStream("db.properties"));
      
      System.out.println(prop.getProperty("password"));
      }
   public static void main(String[] args) throws IOException {

      CheckPassWord6 s = new CheckPassWord6();

   }

}