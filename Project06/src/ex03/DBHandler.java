package ex03;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import oracle.sql.DATE;

public class DBHandler {
	private static String driver = "oracle.jdbc.OracleDriver";
	private static String url            = "jdbc:oracle:thin:@localhost:1521:xe"; 
	private static String uid            = "hr";
	private static String pwd          = "1234";
	
	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	
	//생성자
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
	//memid 로 회원 조회
		public Member getMember(int mid) {
			Member m = null;
		try {
			stmt 		 = conn.createStatement();
			String sql = " SELECT * FROM member2 WHERE memid = " + mid;
			rs              = stmt.executeQuery(sql);
			
			if( rs.next() ) {
				int memid = rs.getInt("memid");
				String mname = rs.getString("mname");
				String email = rs.getString("email");
				String tel = rs.getString("tel");
				String birth = rs.getString("birth");
				int mpoint = rs.getInt("mpoint");
				String regdate = rs.getString("regdate");
				
				m = new Member(memid, mname, email, tel, birth, mpoint, regdate);
			}
			
		} catch (SQLException e) {
			System.out.println("SQL : "+e.getMessage());
		}	
			
			return m;
		}
		
	public void close() {
		try {
			if(rs != null)rs.close();
			if(stmt != null)stmt.close();
			if(conn != null)conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void addMember(String mname, String email, String tel, String birth) {
		try {
			stmt = conn.createStatement();
			String sql = "INSERT INTO member2 ( memid, mname, email, tel, birth, mpoint) VALUES ( (SELECT max(memid)+1 FROM member2), ' " + mname +" ', '"+  email +"', '"+ tel +"', '"+ birth +"', 1000)";
			//System.out.println(sql);
			 stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}

	public ArrayList<Member> getMemberList() {
		ArrayList<Member> mList = new ArrayList<Member>();
		
		try {
			stmt 		 = conn.createStatement();
			String sql = "SELECT * FROM member2";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int memid = rs.getInt("memid");
				String mname = rs.getString("mname");
				String email = rs.getString("email");
				String tel = rs.getString("tel");
				String birth = rs.getString("birth");
				int mpoint = rs.getInt("mpoint");
				String regdate = rs.getString("regdate");
				
				Member m = new Member(memid, mname, email, tel, birth, mpoint, regdate);
				
				mList.add(m);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return mList;

}
}
