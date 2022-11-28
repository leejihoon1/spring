package day2.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day2.annot.MemberController;

public class springApp4 {

	public static void main(String[] args) {
		
		ApplicationContext context =
				new ClassPathXmlApplicationContext
				("classpath:META-INF/spring/applicationContext4.xml");
		
		MemberController controller = (MemberController)
			context.getBean("memberController");
		
		controller.find(10);
	}
}
