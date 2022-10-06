package chap02;

import java.util.Scanner;

public class Ex01_Multiple {

	// main : ctrl + space
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 입력문 - Sc: ctrl + space
		// 객체 생성
		// [클래스 타입] [객체명] = new [클래스](인자);
		// Scanner => 콘솔, 키보드 외 메모장으로부터도 입력받을 수 있음/ system.in => 키보드로부터 입력을 받는 객체를 만드는 것.
		// System.in : 키보드로부터 입력받도록 하는 키워드
		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt(); // 하나의 정수를 입력받는 값
		int num = sc.nextInt();
		
		// 3의 배수인지 아닌지 판단하고 그 여부를 출력하시오.
		if(num % 3 == 0) {
			// 출력문
			System.out.println("3의 배수입니다.");
		}else {
			System.out.println("3의 배수가 아닙니다");
		}
		sc.close();
	}

}
