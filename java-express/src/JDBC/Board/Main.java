package JDBC.Board;

import java.util.List;
import java.util.Scanner;

//import JDBC.JDBConnection;
import JDBC.Board.DAO.BoardDAO;
import JDBC.Board.DTO.Board;

public class Main {
	
	static List<Board> boardList;
	static Board board;
	static BoardDAO dao = new BoardDAO();
	static Scanner sc = new Scanner(System.in);
	
	public static void menu() {
		System.out.println("*****  게시판 *****");
		System.out.println("** 1. 게시글 쓰기 **");
		System.out.println("** 2. 게시글 수정 **");
		System.out.println("** 3. 게시글 삭제 **");
		System.out.println("** 4. 게시글 조회 **");
		System.out.println("** 5. 게시글 전체 목록 **");
		System.out.println("** 0. 종료하기 **");
		System.out.println(">> 입력: ");
	}
	
	public static void menuWrite() {
		System.out.println("******** [글쓰기] *******");
		System.out.println("제목: ");
		String title = sc.nextLine();
		
		System.out.println("작성자: ");
		String writer  = sc.nextLine();
		
		System.out.println("내용: ");
		String content = sc.nextLine();
		
		board = new Board(title, content, writer);
		int result = dao.insert(board);
		
		if(result >0) {
			System.out.println(result + " 건이 등록되었습니다.");
		} else {
			System.out.println("등록이 실패하였습니다.");
		}
	
	}
	
	public static void menuUpdate() {
		System.out.println("******** [글수정] *******");
		
		System.out.println("게시글 번호: ");
		int board_no = sc.nextInt();
		sc.nextLine();
		
		System.out.println("제목: ");
		String title = sc.nextLine();
		
		System.out.println("작성자: ");
		String writer  = sc.nextLine();
		
		System.out.println("내용: ");
		String content = sc.nextLine();
		
		board = new Board(title, content, writer);
		board.setBoard_no(board_no);
		int result = dao.update(board);
		
		if(result >0) {
			System.out.println(result + " 건이 수정되었습니다.");
		} else {
			System.out.println("수정이 실패하였습니다.");
		}
		
	}
	
	public static void menuDelete() {
		System.out.println("******** [글삭제] ********");
		
		System.out.println("게시글 번호: ");
		int board_no = sc.nextInt();
		sc.nextLine();
		
		int result = dao.delete(board_no);
		if(result >0) {
			System.out.println(result + " 건이 삭제되었습니다.");
		} else {
			System.out.println("삭제가 실패하였습니다.");
		}
	}
	
	public static void menuList() {
		System.out.println("****** [전체목록] ******");
		
		boardList = dao.selectList();
		printAll();
		
	}
	
	public static void menuSelect() {
		System.out.println("****** [조회하기] *******");
		
		System.out.println("게시글 번호 : ");
		int board_no = sc.nextInt();
		sc.nextLine();
		
		board = dao.select(board_no);
		if (board == null) {
			System.out.println(board_no + "번 게시글이 존재하지 않습니다.");
			return;
		}else {			
			print(board);
		}
		
	}
	
	public static void printAll() {
		for (Board board : boardList) {
			print(board);
		}
	}
	
	public static void print(Board board) {
		System.out.println("[게시글 번호:" + board.getBoard_no() + "]");
		System.out.println("- 제목: " + board.getTitle());
		System.out.println("- 작성자: " + board.getWriter());
		System.out.println("- 내용: " + board.getContent());
	}
	
	public static void main(String[] args) {
	//	JDBConnection connection = new JDBConnection();
	
		int menuNo = 0;
		do {
			menu();
			menuNo = sc.nextInt();
			sc.nextLine();
			
			if( menuNo == 0) {
				System.out.println("게시판을 종료합니다.");
				break;
			}
			
			switch (menuNo) {
				case 1:menuWrite();
					break;
				case 2:menuUpdate();
					break;
				case 3:menuDelete();
					break;
				case 4:menuSelect();
					break;
				case 5:menuList();
					break;
				default:
					System.out.println("(0~5) 사이의 숫자를 입력하세요!");
					break;
			}
					
		} while(true);
		
	}
}
