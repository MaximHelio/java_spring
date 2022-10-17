package chap03.Ex02_ObjectArray;

import java.util.Scanner;

/**
 * å ����� ���ڸ� ���� ������ ���� Book Ŭ������ �����ϰ�,
 * Book ��ü�� ���� ��ü�迭�� �����Ͽ� ����ڷκ��� å ������ �Է¹޾�
 * ��ü �迭�� ����Ͻÿ�.
 */

class Book{
	String title, author;

	public Book() {
		this("�������", "���ڹ̻�");
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		// return�� ��ü�� ������� �� ��µ� ���ڿ��� ������ ���� �� ����
		return "Book [title=" + title + ", author=" + author + "]";
	}
	
	
}

public class BookArray {
	
	public static void main(String[] args) {
		Book[] book = new Book[2];  	// Book Ÿ���� �迭 ����
		
		// Ű����ũ ����=> for �� �ȿ� ���� �ʿ� ����
		Scanner sc = new Scanner(System.in);
		
		// for ���� ctrl + space ���� ������ �ι�°
		for(int i=0; i<book.length; i++) {
			// length => �ʵ�, �޼���x
			System.out.print("����>>");
			String title = sc.nextLine();
		
			System.out.print("����>>");
			String author = sc.nextLine();
			
			book[i] = new Book(title, author); 	// �迭��ҿ� ������ ��ü�� ����
		}
		
		for(int i=0; i<book.length; i++) {
			System.out.println(book[i]);
		}
		
		sc.close();
	}
}
