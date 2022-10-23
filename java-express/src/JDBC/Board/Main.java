package JDBC.Board;

import java.util.Scanner;

//import JDBC.JDBConnection;
import JDBC.Board.DAO.BoardDAO;
import JDBC.Board.DTO.Board;

public class Main {
	
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
		dao.insert(board);
	
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
			case 1:
				menuWrite();
				break;
			default:
				System.out.println("(0~5) 사이의 숫자를 입력하세요! ");
				break;
			}
					
		} while(true);
		
	}
}
