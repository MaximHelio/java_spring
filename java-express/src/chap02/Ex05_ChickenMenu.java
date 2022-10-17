package chap02;

import java.util.Scanner;

// ###### 치킨 메뉴판 #####
// 1. 고추바사삭 치킨
// 2. 청양마요 치킨
// 3. 굽네 오리지널
// 0. (종료)
// ###### 입력:
public class Ex05_ChickenMenu {
	/**
	 * 메소드 정의
	 * : 로직에 맞게 여러 번 반복 수행하기 위한 실행문의 모음
	 * [접근지정자] [static / (생략)] [리턴 타입] [메소드명] ([매개변수]) {실행문; }
	 */
	public static void showMenu() {
		// 메뉴판 출력
		System.out.println("###### 치킨 메뉴판 #####");
		System.out.println("1. 고추바사삭 치킨");
		System.out.println("2. 청양마요 치킨");
		System.out.println("3. 굽네 오리지널");
		System.out.println("0. (종료)");
		System.out.print("###### 입력: ");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String menu = "";		// 메뉴 이름
		int num = 0;			// 메뉴 번호
		int cnt = 0;			// 주문 개수
		
		// do while(); 문
		// : 무조건 1회는 실행 후, 조건에 따라 반복하는 반복문
		do {
			// 메뉴판 출력 - 메소드 호출
			showMenu();
			// 메뉴 번호 입력
			num = sc.nextInt();
			
			// 메뉴 번호가 0이면? 종료
			if (num == 0) break;
			
			// 메뉴 선택
			// switch(식) ~ case (비교값)문
			// - '식' 과 '비교값'이 일치하면, 해당 case문이 실행
			// - '식' 과 일치하는 '비교값'이 없으면, default문이 실행
			switch (num) {
				case 1:
					menu = "고추 바사삭 치킨";
					break;
				case 2:
					menu = "청양마요 치킨";
					break;
				case 3:
					menu = "굽네 오리지널 치킨";
					break;
	
				default:
					break;
			}
			
			// AND 연산( && )
			// (조건 1) && (조건 2) 	: 조건 1, 2 모두 true일 때, 결과가 true 그 외에는 false
			if (num >= 1 && num <= 3) {	
				cnt += 1;
				System.out.println("'" + menu + "' 이(/가) 주문되었습니다! \n");
			} else {
				System.out.println("(0~3)사이의 숫자를 입력해주세요. \n");
			}
			
		} while(true);
		
		// 3개의 주문이 완료되었습니다. 
		System.out.println(cnt + "개의" + "주문이 완료되었습니다 !");	// while 문 아래의 코드는 접근되지x,  반복문 탈출하는 조건이 하나도 없음
		
		sc.close();
	}	
}
