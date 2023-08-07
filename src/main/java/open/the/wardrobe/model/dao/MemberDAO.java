package open.the.wardrobe.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import open.the.wardrobe.model.vo.Member;

public class MemberDAO {

	public int insertMember(Connection conn, Member member) {
		// TODO Auto-generated method stub
		String query = "INSERT INTO MB_TBL VALUES(?,?,?,?,?,?,?,?,?,?,?,DEFAULT,DEFAULT,DEFAULT)";
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getUserId());
			pstmt.setString(2, member.getPassword());
			pstmt.setString(3, member.getChoice1());
			pstmt.setString(4, member.getTel());
			pstmt.setString(5, member.getUserName());
			pstmt.setString(6, member.getEmail());
			pstmt.setString(7, member.getChoice2());
			pstmt.setString(8, member.getGender());
			pstmt.setString(9, member.getHeight());
			pstmt.setString(10, member.getWeight());
			pstmt.setString(11, member.getFootSize());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	
	
}
