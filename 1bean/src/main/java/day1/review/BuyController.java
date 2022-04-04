package day1.review;

public class BuyController {
//	private int cnt; // 기본데이터 타입참고
	private BuyService service;	// private 접근권한의 전역변수 : 클래스의 프로퍼티
								// 프로퍼티가 클래스
				// BuyService 클래스를 사용하는 것을 "의존관계가 있다"고 표현합니다.
	
	// 프로퍼티에 값을 대입 또는 참조 할 때 1) 생성자 2) setter 2가지 방법
	// -> 클래스 타입일 때는 이것을 "의존관계 주입"(Dependency Injection, DI)이라고 합니다.
	public BuyController(BuyService service) {
		System.out.println("BuyController 생성자 ~~");
		this.service=service;
	}
	
	public void setService(BuyService service) {
		this.service = service;
	}
	// -----------------------------------------------
	
	public void buy() {
		System.out.println("controller buy() ~~~~");
		service.buy();
	}
}
