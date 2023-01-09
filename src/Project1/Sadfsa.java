package Project1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Sadfsa {
	
	public static void main(String[] args) {
		
//	
//	 File file = new File("D:\\jjg\\myjava\\jjg5.properties"); 
//     try {
//         if (file.createNewFile()) {
//             System.out.println("File created");
//         } else {
//             System.out.println("File already exists");
//         }
//     } catch (IOException e) {
//         e.printStackTrace();
//     }
//     
//     Properties prop=new Properties();
     
     try (FileWriter file = new FileWriter("D:\\jjg\\myjava\\jjg5.properties")) {


			Properties p = new Properties();
			
			p.setProperty("id", "jjg1945");
			p.setProperty("pw", "123123");
			p.setProperty("win", "0");
			p.setProperty("loss", "0");
			p.setProperty("tie", "0");
		
			
			p.store(file, "userInfo");
			
			p.load(ClassLoader.getSystemResourceAsStream("db.properties"));
//			url:oracle:thin:@localhost:1521:orcl
//			driver:oracle.jdbc.driver.OracleDriver
//			username:jjg
//			password:1111
//			admin:adminstrator
			
			String url =p.getProperty("id");
			String driver =p.getProperty("pw");
			String username =p.getProperty("win");
			String password =p.getProperty("loss");
			String admin =p.getProperty("tie");
			
			System.out.println(url);
			System.out.println(driver);
			System.out.println(username);
			System.out.println(password);
			System.out.println(admin);


		
			
		} catch (Exception e) {

			System.out.println("실패");
		}
     
	}}
	

