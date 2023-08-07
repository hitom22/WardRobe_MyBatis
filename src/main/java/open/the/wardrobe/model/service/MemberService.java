package open.the.wardrobe.model.service;

import java.sql.Connection;

import common.JDBCTemplate;
import open.the.wardrobe.model.dao.MemberDAO;
import open.the.wardrobe.model.vo.Member;

public class MemberService {
	
	private JDBCTemplate jdbcTemplate;
	private MemberDAO mDao;
	
	public MemberService() {
		jdbcTemplate = JDBCTemplate.getInstance();
		mDao = new MemberDAO();
	}
	
	// 연결생성
	// DAO 호출
	// 커밋/롤백
	
	public int insertMember(Member member) {
		Connection conn = jdbcTemplate.createConnection();
		int result = mDao.insertMember(conn, member);
		if(result > 0) {
			jdbcTemplate.commit(conn);
		}else {
			jdbcTemplate.rollback(conn);
		}
		jdbcTemplate.close(conn);
		return result;
	}
	
	
}
