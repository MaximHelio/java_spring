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
				System.out.println("�Խ����� �����մϴ�.");
				break;
			}
			
			switch (menuNo) {
			case 1:
				menuWrite();
				break;
			default:
				System.out.println("(0~5) ������ ���ڸ� �Է��ϼ���! ");
				break;
			}
					
		} while(true);
		
	}
}
