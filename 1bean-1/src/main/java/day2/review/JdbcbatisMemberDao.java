package day2.review;

public class JdbcbatisMemberDao implements MemberDao{

	public JdbcbatisMemberDao() {
		System.out.println("jdbcMemberDao create //////");
	}
	
	@Override
	public void find(int idx) {
		System.out.println("JDBC connent : " + idx);
	}

}
