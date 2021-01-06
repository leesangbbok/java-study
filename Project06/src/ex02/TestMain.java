package ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestMain {

	private static String driver = "oracle.jdbc.OracleDriver";
	private static String url            = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String uid            = "hr";
	private static String pwd          = "1234";
	
	
	
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName(driver);
			conn   = DriverManager.getConnection(url, uid, pwd);
			String sql ="INSERT INTO member2 ( memid, mname, email, tel, birth, mpoint) VALUES ( ?, ?, ?, ?, ?, ?)";
			
			pstmt  = conn.prepareStatement(sql);
			
			pstmt.setInt(1, 5);
			pstmt.setString(2, "홍길변");
			pstmt.setString(3, "meme2@memem.com");
			pstmt.setString(4, "014");
			pstmt.setString(5, "1993-01-23");
			pstmt.setInt(6, 1000);
			pstmt.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			System.out.println("클래스파일 : " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("SQL-error" + e.getMessage());
		}finally {
				try {
					if(pstmt != null)pstmt.close();
					if(conn != null)conn.close();
				} catch (SQLException e) {}
		}

	}

}
