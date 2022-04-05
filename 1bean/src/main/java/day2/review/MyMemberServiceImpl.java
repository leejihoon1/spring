package day2.review;

public class MyMemberServiceImpl implements MemberService{
	private MemberDao dao;
	// 사용할 수 있는(의존관계) 클래스를 MemberDao의 구현체로 합니다.
	// 해당클래스는 Mybatis~Impl, Jdbc~Impl 클래스 2개입니다.
	
	//MyMemberServiceImpl은 커스텀생성자, 생성자 의존관계 주입으로 변경해서 해보세요
//	public MyMemberServiceImpl() {
//		System.out.println("MyMemberServiceImpl create /////");
//	}
	
	public MyMemberServiceImpl(MemberDao dao) {
		System.out.println("MyMemberServiceImpl create~~");
		this.dao=dao;
	}// 빈 설정파일의 빈 생성 내용 변경하세요
	
	@Override
	public void find(int idx) {
		//예, 검색 비지니스 로직 처리 : My방식으로
		System.out.println("My Logic!");
		dao.find(idx);
		
	}
	
	public void setDao(MemberDao dao) { // 의존관계 주입 setter
		this.dao = dao;
	}
	
}
