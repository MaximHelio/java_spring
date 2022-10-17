package chap02;

import java.util.Scanner;

public class Ex03_Week {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 배열 선언 및 배열 생성
		int arr[] = new int[10];
		
		// for 
		// for([초기식] ; [조건식] ; [증감식]){ }
		// 배열 입력
		for (int i = 0; i < arr.length; i++) {
			// print()		: 문자열 및 변수를 콘솔에 '그대로' 출력
			// println()	: ln(line) 출력 후 개행
			System.out.print("arr[" + i + "] : "); 
			arr[i] = sc.nextInt();
		}
		
		// 배열 출력
		for (int i = 0; i < arr.length; i+=2) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		String week[] = {"월", "화", "수", "목", "금", "토", "일"};
		
		// 증감연산(++, --)
		// 1. 전위 연산 : ++i	: i = i + 1; 을 처리하고 다음 연산을 진행
		// 2. 후위 연산 : i++ : 다른 연산을 진행하고 i = i + 1;을 진행
		
		// 복합 연산자
		// sum += i;
		// sum = sum + i;
		for (int i = 0; i < week.length; i++) {
			System.out.print(week[i] + " ");
		}
		System.out.println();
		
		// for-each(Advanced for)
		// : 배열과 컬렉션의 모든 요소를 반복하는 for문
		// for([타입] [변수명] : [배열 or 컬렉션 명]) { }
		for (String day : week) {
			System.out.print(day + " ");
		}
		System.out.println();
		
		sc.close();
	}

}
