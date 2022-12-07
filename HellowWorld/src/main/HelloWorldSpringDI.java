package main;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldSpringDI {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/app-context.xml");
		
		Properties props = new Properties();
		
		FileReader file=null;
		try {
			File f = new File("src/main/spring/app-context.xml");
			System.out.println(f.getAbsolutePath() );
			
		file = new FileReader("src/main/msf.properties");
			props.load(file);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}

}
