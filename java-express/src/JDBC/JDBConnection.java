package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBConnection {

	public Connection con;
	public Statement stmt;
	public PreparedStatement psmt;
	public ResultSet rs;
	
	public JDBConnection() {
		try {
			// 예외발생 가능성이 있는 실행문
			// MySQL
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Oracle
			// Class.forName("oracle.jdbc.OracleDriver");
		
			// DB에 연결
			// MySQL
			String url = "jdbc:mysql://localhost:3306/aloha?serverTimezone=Asia/Seoul&allowPublicKeyRetrieval=true&useSSL=false";
			String id = "aloha";
			String pw = "123456";
			
			con = DriverManager.getConnection(url, id, pw);
			
			System.out.println("DB 연결 성공!!");
			
			
		} catch (Exception e) {
			// 예외발생시 처리할 실행문
			System.out.println("DB 연결 실패!!");
			
			e.printStackTrace();
		}
	}
}
