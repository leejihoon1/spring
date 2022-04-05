package day2.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day2.annot.MemberController;

public class SpringApp4 {
	public static void main(String[] args) {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext
				("classpath:METE-INF/spring/applicationContext4.xml");
		
		
		MemberController controller =  (MemberController)
		context.getBean("memberController");
		
		controller.find(10);
	}
}
