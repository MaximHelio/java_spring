package JDBC.Board.DAO;

import JDBC.JDBConnection;
import JDBC.Board.DTO.Board;

public class BoardDAO extends JDBConnection{

	// ������ ���
	public int insert(Board board) {
		
		int result = 0;
		
		String sql = " INSERT INTO board ( title, content, writer ) "
					+ " VALUES(?, ?, ?)";
		try {
			
			psmt = con.prepareStatement(sql); 		// ������ ����
			psmt.setString(1, board.getTitle());
			psmt.setString(2, board.getContent());
			psmt.setString(3, board.getWriter());
			result = psmt.executeUpdate();		// DML ���� ����: ����� ���� �� ��ȯ
			
		} catch (Exception e) {
			System.out.println("�Խñ� ��Ͻ�, ���ܹ߻�");
			e.printStackTrace();
		}
		return result;
	}
	
}
