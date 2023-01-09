package Project1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import javax.swing.JOptionPane;



public class CheckPassWord5 {

   private CheckPassWord5() throws IOException {
      check();
   }

   private void check() throws IOException {
      Properties prop = new Properties();
      prop.load(ClassLoader.getSystemResourceAsStream("db.properties"));
      FileOutputStream fos = new FileOutputStream("C:\\Users\\Manic-063\\git\\Class\\src\\db.properties");
      String userPass;
      //String checkPass = prop.getProperty("password");
      String newPass;
      System.out.println(prop.getProperty("password"));
      do {
         userPass = JOptionPane.showInputDialog("기존 비밀번호를 입력하세요");
      } while (!userPass.equals(prop.getProperty("password")));
      if (userPass.equals(prop.getProperty("password"))) {
         newPass = JOptionPane.showInputDialog("새로운 비밀번호를 입력하세요");
         
         
         prop.setProperty("password", newPass);
         prop.store(fos, null);        
         
         fos.close();
         
         JOptionPane.showMessageDialog(null, "비밀번호 변경 완료");
         
      }

   }

   public static void main(String[] args) throws IOException {

      CheckPassWord5 s = new CheckPassWord5();

   }

}