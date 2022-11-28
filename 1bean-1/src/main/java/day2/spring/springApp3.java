package day2.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springApp3 {

	public static void main(String[] args) {
		
		ApplicationContext context =
				new ClassPathXmlApplicationContext
				("classpath:META-INF/spring/applicationContext3.xml");
	}
}
