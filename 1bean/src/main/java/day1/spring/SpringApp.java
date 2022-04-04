package day1.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day1.review.BuyController;

public class SpringApp {
	public static void main(String[] args) {
		//반설정 파일을 읽어와서 빈(객체)를 생성합니다. spring-context가 빈을 관리합니다.
		ApplicationContext context =
		new ClassPathXmlApplicationContext
		("classpath:METE-INF/spring/applicationContext.xml");
		
		//위에서 만들어진 bean(객체)중에서 id가 controller 인 bean을 가져와 참조합니다.
		//getBean메소드 리턴타입 Object : 참조타입에 맞게 캐스팅을 해줘야합니다.
		BuyController controller = 
				(BuyController)context.getBean("controller");
		
		controller.buy();
		
	}
}
