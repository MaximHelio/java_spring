package chap02;

import java.util.Scanner;

// ctrl + shift + c : 한 줄 주석
// ctrl + shift + / : 드래그 하고 여러 줄 주석
// ctrl + shift + \ : 여러 줄 주석

// ctrl + alt + (↑/↓): 한 줄 복사
// ctrl + D :한 줄 삭제
// ctrl + K : 단어 찾기
// ctrl + Z : 뒤로 가기
// ctrl + Y : 앞으로 가기


// 여러줄 주석
/*여러줄
여러줄*/

/*
 * 				[화폐 매수 구하기]
 * 				입력: 537620		
 * 				50000	: 10
 * 				10000	: 3
 * 				5000	: 1
 * 				1000	: 
 * 				500
 * 				100
 * 				50
 * 				10
 * 				5
 * 				1		
 * 
 * 
 * 				[순서도]
 * 				1. 금액 입력
 * 				2. 화폐 매수 계산
 * 					[규칙]
 * 					1) 큰 화폐 단위부터 세기
 * 					2) 화폐 매수 계산		: (화폐 매수)  = (입력 금액) / (화폐 단위)
 * 					3) 잔액계산			: <1> (잔액)  = (입력 금액) - ((화폐단위) * (화폐매수))
 * 										  <2> (잔액)  = (입력 금액) % (화폐 단위)
 * 					4) 화폐단위 변환		: 번갈아가면서, /5, /2를 반복
 * 										  50000 -> 10000		: (화폐단위 / 5)
 * 										  10000 -> 5000			: (화폐단위 / 2)
 * 
 * 					5) 화폐 단위가 1보다 크거나 같으면, 2)~ 4) 번 작업 반복
 * 
 * 				3. 각 화폐단위별 매수 출력
 * */

public class Ex02_NumberofCurrencies {

	// 화폐 매수
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액: ");
		
		// 필요한 변수 : 입력 금액, 화폐 단위, 화폐 매수
		int input = sc.nextInt();
		int money = 50000;
		int cnt = 0;
		boolean sw = true;
		
		while ( money >=1) {
			
			// 1. 화폐 매수 계산
			// (화폐 매수)  = (입력 금액) / (화폐 단위)
			cnt = input / money;
			System.out.println(money + "\t:" + cnt + "개"); // \t: tab만큼의 공백
			
			// 2. 잔액 계산
			// (입력 금액) % (화폐 단위)
			input = input - (money * cnt);
			// input = input % money;
			
			// 3. 화폐 단위 변환
			if (sw) {				
				money = money / 5;
//				sw = false;
			} else {				
				money = money / 2;
//				sw = true;
			}
			sw = !sw;
		}
		
		
		
		sc.close();
	}

}
