package chap03.Ex02_ObjectArray;

import java.util.Scanner;

/**
 * 책 제목과 저자를 담을 변수를 갖는 Book 클래스를 정의하고,
 * Book 객체를 담을 객체배열을 생성하여 사용자로부터 책 정보를 입력받아
 * 객체 배열을 출력하시오.
 */

class Book{
	String title, author;

	public Book() {
		this("제목없음", "작자미상");
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		// return에 객체를 출력했을 때 출력된 문자열의 포맷을 만들 수 있음
		return "Book [title=" + title + ", author=" + author + "]";
	}
	
	
}

public class BookArray {
	
	public static void main(String[] args) {
		Book[] book = new Book[2];  	// Book 타입의 배열 생성
		
		// 키오스크 느낌=> for 문 안에 넣을 필요 없음
		Scanner sc = new Scanner(System.in);
		
		// for 쓰고 ctrl + space 에서 나오는 두번째
		for(int i=0; i<book.length; i++) {
			// length => 필드, 메서드x
			System.out.print("제목>>");
			String title = sc.nextLine();
		
			System.out.print("저자>>");
			String author = sc.nextLine();
			
			book[i] = new Book(title, author); 	// 배열요소에 생성한 객체를 대입
		}
		
		for(int i=0; i<book.length; i++) {
			System.out.println(book[i]);
		}
		
		sc.close();
	}
}
