package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBTest02 {

	private static String driver = "oracle.jdbc.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String uid = "test1";
	private static String pwd = "1234";
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		Scanner in = new Scanner(System.in);
//		System.out.println("번호를 입력하세요");
//		String num = in.nextLine();
//		System.out.println("이름을 입력하세요");
//		String name = in.nextLine();
//		System.out.println("메일주소를 입력하세요");
//		String email2 = in.nextLine();
		
		Class.forName(driver);
		
		//DB연결
		Connection conn = DriverManager.getConnection(url, uid, pwd);
		
		//sql 명령문
		Statement stmt = conn.createStatement();
		
		String sql = "CREATE TABLE EMP (\r\n" + 
				"    EMPID NUMBER(6) PRIMARY KEY,\r\n" + 
				"    ENAME VARCHAR2(30),\r\n" + 
				"    TEL      VARCHAR2(20),\r\n" + 
				"    EMAIL VARCHAR2(320),\r\n" + 
				"    INDATE DATE DEFAULT SYSDATE\r\n" + 
				")";
		stmt.executeUpdate(sql);
		
		int empid = 1;
		String ename = "sangbok";
		String tel = "010-1234-5678";
		String email = "aaa@naver.com";
		
		String fmt = "INSERT INTO EMP (EMPID, ENAME, TEL, EMAIL) VALUES (%d, '%s', '%s', '%s')"; //데이터 insert하는 쿼리 
		sql = String.format(fmt, empid, ename, tel, email);
		stmt.executeUpdate(sql);
		
		//조회
		sql = "SELECT * FROM EMP";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			empid = rs.getInt("EMPID");
			ename = rs.getString("ENAME");
			tel = rs.getString("TEL");
			email = rs.getString("EMAIL");
			String indate = rs.getString("INDATE");
			
			 String fmt2 = "%d %s %s %s %s";
			String msg = String.format(fmt2, empid, ename, tel, email, indate);
			System.out.println(msg);
		}
		
		rs.close();
		stmt.close();
		conn.close();
	}

}
