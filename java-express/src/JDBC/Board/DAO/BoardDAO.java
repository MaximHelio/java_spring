package JDBC.Board.DAO;

import java.util.LinkedList;
import java.util.List;

import JDBC.JDBConnection;
import JDBC.Board.DTO.Board;

public class BoardDAO extends JDBConnection{

	// ������ ��� ��ȸ �迭: ���� �ڷᱸ��, ����Ʈ: ���� �ڷᱸ��=> �߰� ���� ����, ��ü�� ���� �� ����, int �� double ������
	public List<Board> selectList() {
		
		LinkedList<Board> boardList = new LinkedList<Board>();
		
		String sql = " SELECT *"
				   + " FROM board";
		
		try {
			stmt = con.createStatement(); 	//������ ����
			rs = stmt.executeQuery(sql);	//���� ����
			
			while( rs.next() ) {
				Board board = new Board();
				
				board.setBoard_no(rs.getInt("board_no")); //�޾ƿ� ù��° Ŀ���� board_no��� �÷�, ���� Ŀ���� �ִ� �÷��� ���� ������
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setReg_date(rs.getDate("reg_date"));
				board.setUpd_date(rs.getDate("upd_date"));
				
				boardList.add(board);
			}
			
		} catch (Exception e) {
			System.out.println("�Խñ� ��� ��ȸ ��, ���� �߻�");
			e.printStackTrace();
		}
		return boardList; //  ��ȯ�ؾ� ����
	}
	
	// ������ ��ȸ
	// ������ ��� ��ȸ �迭: ���� �ڷᱸ��, ����Ʈ: ���� �ڷᱸ��=> �߰� ���� ����, ��ü�� ���� �� ����, int �� double ������
	public Board select(int board_no) {
		
		Board board = new Board();
		String sql = " SELECT * " 
				   + " FROM board"
				   + " WHERE board_no = ? "; // ����ǥ �Ѱ��ִ� ������ preparestatment �޼���� ����
		
		try {
			psmt = con.prepareStatement(sql); 	//������ ����
			psmt.setInt(1, board_no);			// �Ķ���� ����
			rs = psmt.executeQuery();		//���� ����
			
			// ���� Ŀ���� �����ߴٸ�
			if( rs.next() ) {
				
				board.setBoard_no(rs.getInt("board_no")); //�޾ƿ� ù��° Ŀ���� board_no��� �÷�, ���� Ŀ���� �ִ� �÷��� ���� ������
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setReg_date(rs.getDate("reg_date"));
				board.setUpd_date(rs.getDate("upd_date"));
				
			} else {
				board = null;
			}
			
		} catch (Exception e) {
			System.out.println("�Խñ� ��ȸ ��, ���� �߻�");
			e.printStackTrace();
		}
		return board; //  ��ȯ�ؾ� ����
	}
	
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
			result = psmt.executeUpdate();		// DML ���� ����: ����� ���� ���� ��ȯ
		} catch (Exception e) {
			System.out.println("�Խñ� ��Ͻ�, ���ܹ߻�");
			e.printStackTrace();
		}
		return result;
	}
	
	// ������ ����
	public int update(Board board) {
		
		int result = 0;
		
		String sql = " UPDATE board"
					+ " SET title = ? "
					+ "    ,content = ? "
					+ "	   ,writer = ?"
					+" WHERE board_no = ? ";
		try {
			psmt = con.prepareStatement(sql); 		// ������ ����
			psmt.setString(1, board.getTitle());
			psmt.setString(2, board.getContent());
			psmt.setString(3, board.getWriter());
			psmt.setInt(4, board.getBoard_no());
			result = psmt.executeUpdate();		// DML ���� ����: ����� ���� �� ��ȯ
		
		} catch (Exception e) {
			System.out.println("�Խñ� ��Ͻ�, ���ܹ߻�");
			e.printStackTrace();
		}
		return result;
	}
	
	
	// ������ ����
	public int delete(int board_no) {
		
		int result = 0;
		
		String sql = " DELETE "
					+ " FROM board "
					+" WHERE board_no = ? ";
		try {
			psmt = con.prepareStatement(sql); 		// ������ ����

			psmt.setInt(1, board_no);
			result = psmt.executeUpdate();		// DML ���� ����: ����� ���� �� ��ȯ
		
		} catch (Exception e) {
			System.out.println("�Խñ� ������, ���ܹ߻�");
			e.printStackTrace();
		}
		return result;
	}
	
	
	
}
