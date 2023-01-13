package Project1;

import java.io.IOException;
import java.util.Properties;

public class asdfsf {

	public static void main(String[] args) {
		Properties prop = new Properties();
		try {
			prop.load(ClassLoader.getSystemResourceAsStream("Beautea37.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(prop.getProperty("ID"));
	}
}
