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
		System.out.println("*****  �Խ��� *****");
		System.out.println("** 1. �Խñ� ���� **");
		System.out.println("** 2. �Խñ� ���� **");
		System.out.println("** 3. �Խñ� ���� **");
		System.out.println("** 4. �Խñ� ��ȸ **");
		System.out.println("** 5. �Խñ� ��ü ��� **");
		System.out.println("** 0. �����ϱ� **");
		System.out.println(">> �Է�: ");
	}
	
	public static void menuWrite() {
		System.out.println("******** [�۾���] *******");
		System.out.println("����: ");
		String title = sc.nextLine();
		
		System.out.println("�ۼ���: ");
		String writer  = sc.nextLine();
		
		System.out.println("����: ");
		String content = sc.nextLine();
		
		board = new Board(title, content, writer);
		int result = dao.insert(board);
		
		if(result >0) {
			System.out.println(result + " ���� ��ϵǾ����ϴ�.");
		} else {
			System.out.println("����� �����Ͽ����ϴ�.");
		}
	
	}
	
	public static void menuUpdate() {
		System.out.println("******** [�ۼ���] *******");
		
		System.out.println("�Խñ� ��ȣ: ");
		int board_no = sc.nextInt();
		sc.nextLine();
		
		System.out.println("����: ");
		String title = sc.nextLine();
		
		System.out.println("�ۼ���: ");
		String writer  = sc.nextLine();
		
		System.out.println("����: ");
		String content = sc.nextLine();
		
		board = new Board(title, content, writer);
		board.setBoard_no(board_no);
		int result = dao.update(board);
		
		if(result >0) {
			System.out.println(result + " ���� �����Ǿ����ϴ�.");
		} else {
			System.out.println("������ �����Ͽ����ϴ�.");
		}
		
	}
	
	public static void menuDelete() {
		System.out.println("******** [�ۻ���] ********");
		
		System.out.println("�Խñ� ��ȣ: ");
		int board_no = sc.nextInt();
		sc.nextLine();
		
		int result = dao.delete(board_no);
		if(result >0) {
			System.out.println(result + " ���� �����Ǿ����ϴ�.");
		} else {
			System.out.println("������ �����Ͽ����ϴ�.");
		}
	}
	
	public static void menuList() {
		System.out.println("****** [��ü���] ******");
		
		boardList = dao.selectList();
		printAll();
		
	}
	
	public static void menuSelect() {
		System.out.println("****** [��ȸ�ϱ�] *******");
		
		System.out.println("�Խñ� ��ȣ : ");
		int board_no = sc.nextInt();
		sc.nextLine();
		
		board = dao.select(board_no);
		if (board == null) {
			System.out.println(board_no + "�� �Խñ��� �������� �ʽ��ϴ�.");
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
		System.out.println("[�Խñ� ��ȣ:" + board.getBoard_no() + "]");
		System.out.println("- ����: " + board.getTitle());
		System.out.println("- �ۼ���: " + board.getWriter());
		System.out.println("- ����: " + board.getContent());
	}
	
	public static void main(String[] args) {
	//	JDBConnection connection = new JDBConnection();
	
		int menuNo = 0;
		do {
			menu();
			menuNo = sc.nextInt();
			sc.nextLine();
			
			if( menuNo == 0) {
				System.out.println("�Խ����� �����մϴ�.");
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
					System.out.println("(0~5) ������ ���ڸ� �Է��ϼ���!");
					break;
			}
					
		} while(true);
		
	}
}
