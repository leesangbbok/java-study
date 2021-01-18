package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import dbconn.DBConn;
import vo.MemberVO;

public class MemberDAO {
	public MemberDAO() {
		
	}

//	public Vector getMemberList() {
//		Vector                      v        = new Vector(); //ArrayList 대체자 
//		Connection              conn  = null;
//		PreparedStatement pstmt = null;
//		ResultSet                 rs       = null;
//		
//		conn  = DBConn.getInstance(); //db연결
//		String sql = "SELECT * FROM MEMBER ORDER BY userid"; 
//		
//		try {
//			pstmt = conn.prepareStatement(sql);
//			rs       = pstmt.executeQuery();
//			while(rs.next()) {
//				Vector member = new Vector();
//				
//				member.add(rs.getString("userid"));
//				member.add(rs.getString("passwd"));
//				member.add(rs.getString("username"));
//				member.add(rs.getString("job"));
//				member.add(rs.getString("gender"));
//				member.add(rs.getString("intro"));
//				member.add(rs.getString("indate"));
//				
//				v.add(member);
//				
//			}
//		} catch (SQLException e) {
//			System.out.println(e.getMessage());
//		}finally {
//				try {
//					if(rs != null)rs.close();
//					if(pstmt != null)pstmt.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//		}
//		
//		return v;
//	}
	
	//회원가입
	public void insertMember(MemberVO vo) {
		Connection              conn  = null;
		PreparedStatement pstmt = null;
		conn  = DBConn.getInstance();
		String sql ="INSERT INTO MEMBER (USERID, PASSWD, USERNAME, JOB, GENDER, INTRO) VALUES (?, ? ,?, ?, ?, ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getUserid());
			pstmt.setString(2, vo.getPasswd());
			pstmt.setString(3, vo.getUsername());
			pstmt.setString(4, vo.getJob());
			pstmt.setString(5, vo.getGender());
			pstmt.setString(6, vo.getIntro());
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(pstmt != null)pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	public boolean updateMember(MemberVO vo) {
		boolean ok = false;
		Connection              conn  = null;
		PreparedStatement pstmt = null;
		conn  = DBConn.getInstance();
		String sql = "UPDATE MEMBER SET passwd = ?, username = ? , job=?, gender = ?, intro=? WHERE userid = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getPasswd());
			pstmt.setString(2, vo.getUsername());
			pstmt.setString(3, vo.getJob());
			pstmt.setString(4, vo.getGender());
			pstmt.setString(5, vo.getIntro());
			pstmt.setString(6, vo.getUserid());
			
			int rs = pstmt.executeUpdate();
			if(rs == 1) {
				ok = true;
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(pstmt != null)pstmt.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		return ok;
	}

	public int findByIdAndPwd(String userId, String password) {
		int result = -1;
		//DB연결
		Connection              conn  = null;
		PreparedStatement pstmt = null;
		ResultSet                 rs       = null;
		conn = DBConn.getInstance();
		
		//SQL작성
		String sql = "SELECT * FROM MEMBER WHERE USERID = ? AND PASSWD = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			pstmt.setString(2, password);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				result = 1; //로그인 성공
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(rs != null)rs.close();
				if(pstmt != null)pstmt.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			
		}
		
		return result;
	}
	
	
	
}

