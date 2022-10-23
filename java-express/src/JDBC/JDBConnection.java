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
			// ���ܹ߻� ���ɼ��� �ִ� ���๮
			// MySQL
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Oracle
			// Class.forName("oracle.jdbc.OracleDriver");
		
			// DB�� ����
			// MySQL
			String url = "jdbc:mysql://localhost:3306/aloha?serverTimezone=Asia/Seoul&allowPublicKeyRetrieval=true&useSSL=false";
			String id = "aloha";
			String pw = "123456";
			
			con = DriverManager.getConnection(url, id, pw);
			
			System.out.println("DB ���� ����!!");
			
			
		} catch (Exception e) {
			// ���ܹ߻��� ó���� ���๮
			System.out.println("DB ���� ����!!");
			
			e.printStackTrace();
		}
	}
}
