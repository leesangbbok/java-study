package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest01 {
	
	//oracle 같은 외부데이터베이스를 불러오려면 별도의 라이브러리가 필요하다.
	//JDBC Driver 프로그램을 사용한다.
	// JDBC : Java Database Connectivity
	//ojdbc6.jar 필요 이 파일은 오라클 다운받고 설치했을때 oraclexe 폴더안에서 검색하면 됌. 
	
	private static String driver       = "oracle.jdbc.OracleDriver";
	private static String url            = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String uid            = "test1";
	private static String pwd          = "1234";
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		
		//db연결
		Connection conn = DriverManager.getConnection(url, uid, pwd);
		//전달할 문자 ( sql 명령 )
		Statement stmt = conn.createStatement();
		
		String sql = "SELECT num, name, email, indate FROM student";
		
		ResultSet rs= stmt.executeQuery(sql); // 내가 전달할 sql 안에있는 명령문을 전달 
		
		while(rs.next()) {			//조회된 row 가져온다.
			String num = rs.getString("num");
			String name = rs.getString("name");
			String email = rs.getString("email");
			String indate = rs.getString("indate");
			
			String fmt = "%s %s %s %s";
			String msg = String.format(fmt, num, name, email, indate);
			
			System.out.println(msg);
		}
		
		rs.close();
		stmt.close();
		conn.close();
		
	}

}
