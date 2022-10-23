package JDBC.Board.DAO;

import JDBC.JDBConnection;
import JDBC.Board.DTO.Board;

public class BoardDAO extends JDBConnection{

	// 데이터 등록
	public int insert(Board board) {
		
		int result = 0;
		
		String sql = " INSERT INTO board ( title, content, writer ) "
					+ " VALUES(?, ?, ?)";
		try {
			
			psmt = con.prepareStatement(sql); 		// 쿼리문 생성
			psmt.setString(1, board.getTitle());
			psmt.setString(2, board.getContent());
			psmt.setString(3, board.getWriter());
			result = psmt.executeUpdate();		// DML 쿼리 실행: 적용된 행의 수 반환
			
		} catch (Exception e) {
			System.out.println("게시글 등록시, 예외발생");
			e.printStackTrace();
		}
		return result;
	}
	
}
