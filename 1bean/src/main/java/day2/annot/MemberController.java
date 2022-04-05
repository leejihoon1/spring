package day2.annot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import day2.review.MemberService;

@Component  
public class MemberController {
//	@Autowired						
//	@Qualifier("myMemberServiceImpl") // 기본생성자 있을 때만 가능
	private MemberService service;
	//사용할수있는(의존관계 주입) 클래스를 MemberService의 구현체로 합니다.
	//해당클래스는 Your~Impl, My~Impl 클래스 2개입니다.
	
	//생성자 의존관계 자동주입 : 현재 MemberService 타입객체가 1개일때만.
	//@Autowired 생략됨. 생성자에서만 생략합니다.
	public MemberController(@Qualifier("myService")MemberService service) {
		System.out.println("MemberController create ///////");
		this.service=service;	//의존관계 주입 : 생성
	}
	
	public void find(int idx) {
			System.out.println("MemberController find~~~~");
			service.find(idx);
	}
}