package ex04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBHandler {
	
	private String driver = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String uid = "exam01";
	private String pwd = "1234";
	
	private Connection conn;
	private java.sql.Statement  stmt;
	private ResultSet  rs;
	
	
	public DBHandler() {
		open();
	}
	public void close() {
		
			try {
				if(rs != null)rs.close();
				if(stmt != null)stmt.close();
				if(conn != null)conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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


	public List<Post> findZipcode(String dong2) {
		List<Post> postList = new ArrayList<>();
		try {
			stmt = conn.createStatement();
			String sql = "SELECT ZIPCODE, SIDO, GUGUN, DONG, NVL(BUNJI, ' ') AS BUNJI, SEQ FROM POST WHERE DONG LIKE '%"+dong2+"%' " ;
			 rs = stmt.executeQuery(sql);
			while( rs.next()) {
				String zipcode = rs.getString("zipcode");
				String sido = rs.getString("sido");
				String gugun = rs.getString("gugun");
				String dong = rs.getString("dong");
				String bunji = rs.getString("zipcode");
				int seq = rs.getInt("seq");
				Post  post = new Post(zipcode, sido, gugun, dong, bunji, seq);
				
				postList.add(post);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return postList;
	}
	
}
