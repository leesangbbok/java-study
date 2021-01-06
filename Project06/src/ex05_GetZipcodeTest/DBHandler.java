package ex05_GetZipcodeTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBHandler {
	private String driver = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String uid = "exam01";
	private String pwd = "1234";
	
	private Connection conn = null;
	private java.sql.Statement  stmt = null;
	private ResultSet  rs = null;
	
	
	public DBHandler() {
		open();
	}
	
	private void open() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, uid, pwd);
			
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	public void insertZipcode(String zipcode, String sido, String gugun, String dong, String bunji, int seq) {
		try {
			stmt = conn.createStatement();
			String sql = "INSERT INTO post2 (ZIPCODE, SIDO, GUGUN, DONG, BUNJI, SEQ) VALUES ('"+ zipcode+"', '"+ sido +"', '"+ gugun +"', '"+ dong +"', '"+ bunji +"', '"+ seq +"')";
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
				try {
					if(rs != null)rs.close();
				} catch (SQLException e) {
						try {
							if(stmt != null)stmt.close();
						} catch (SQLException e1) {
								try {
									if(conn != null)conn.close();
								} catch (SQLException e2) {}
						}
				}
		}
		
	}
	

}
