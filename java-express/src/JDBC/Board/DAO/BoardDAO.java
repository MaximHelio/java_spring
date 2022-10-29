package JDBC.Board.DAO;

import java.util.LinkedList;
import java.util.List;

import JDBC.JDBConnection;
import JDBC.Board.DTO.Board;

public class BoardDAO extends JDBConnection{

	// 데이터 목록 조회 배열: 정적 자료구조, 리스트: 동적 자료구조=> 추가 삭제 가능, 객체만 담을 수 있음, int 및 double 못담음
	public List<Board> selectList() {
		
		LinkedList<Board> boardList = new LinkedList<Board>();
		
		String sql = " SELECT *"
				   + " FROM board";
		
		try {
			stmt = con.createStatement(); 	//쿼리문 생성
			rs = stmt.executeQuery(sql);	//쿼리 실행
			
			while( rs.next() ) {
				Board board = new Board();
				
				board.setBoard_no(rs.getInt("board_no")); //받아온 첫번째 커서의 board_no라는 컬럼, 현재 커서에 있는 컬럼의 값을 가져옴
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setReg_date(rs.getDate("reg_date"));
				board.setUpd_date(rs.getDate("upd_date"));
				
				boardList.add(board);
			}
			
		} catch (Exception e) {
			System.out.println("게시글 목록 조회 시, 예외 발생");
			e.printStackTrace();
		}
		return boardList; //  반환해야 끝남
	}
	
	// 데이터 조회
	// 데이터 목록 조회 배열: 정적 자료구조, 리스트: 동적 자료구조=> 추가 삭제 가능, 객체만 담을 수 있음, int 및 double 못담음
	public Board select(int board_no) {
		
		Board board = new Board();
		String sql = " SELECT * " 
				   + " FROM board"
				   + " WHERE board_no = ? "; // 물음표 넘겨주는 쿼리는 preparestatment 메서드로 만듦
		
		try {
			psmt = con.prepareStatement(sql); 	//쿼리문 생성
			psmt.setInt(1, board_no);			// 파라미터 매핑
			rs = psmt.executeQuery();		//쿼리 실행
			
			// 다음 커서가 존재했다면
			if( rs.next() ) {
				
				board.setBoard_no(rs.getInt("board_no")); //받아온 첫번째 커서의 board_no라는 컬럼, 현재 커서에 있는 컬럼의 값을 가져옴
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setReg_date(rs.getDate("reg_date"));
				board.setUpd_date(rs.getDate("upd_date"));
				
			} else {
				board = null;
			}
			
		} catch (Exception e) {
			System.out.println("게시글 조회 시, 예외 발생");
			e.printStackTrace();
		}
		return board; //  반환해야 끝남
	}
	
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
			result = psmt.executeUpdate();		// DML 쿼리 실행: 적용된 행의 개수 반환
		} catch (Exception e) {
			System.out.println("게시글 등록시, 예외발생");
			e.printStackTrace();
		}
		return result;
	}
	
	// 데이터 수정
	public int update(Board board) {
		
		int result = 0;
		
		String sql = " UPDATE board"
					+ " SET title = ? "
					+ "    ,content = ? "
					+ "	   ,writer = ?"
					+" WHERE board_no = ? ";
		try {
			psmt = con.prepareStatement(sql); 		// 쿼리문 생성
			psmt.setString(1, board.getTitle());
			psmt.setString(2, board.getContent());
			psmt.setString(3, board.getWriter());
			psmt.setInt(4, board.getBoard_no());
			result = psmt.executeUpdate();		// DML 쿼리 실행: 적용된 행의 수 반환
		
		} catch (Exception e) {
			System.out.println("게시글 등록시, 예외발생");
			e.printStackTrace();
		}
		return result;
	}
	
	
	// 데이터 삭제
	public int delete(int board_no) {
		
		int result = 0;
		
		String sql = " DELETE "
					+ " FROM board "
					+" WHERE board_no = ? ";
		try {
			psmt = con.prepareStatement(sql); 		// 쿼리문 생성

			psmt.setInt(1, board_no);
			result = psmt.executeUpdate();		// DML 쿼리 실행: 적용된 행의 수 반환
		
		} catch (Exception e) {
			System.out.println("게시글 삭제시, 예외발생");
			e.printStackTrace();
		}
		return result;
	}
	
	
	
}
