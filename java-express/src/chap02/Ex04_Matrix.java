package chap02;

import java.util.Scanner;

public class Ex04_Matrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// M행 N열의 2차원 배열
		System.out.print("(M, N) :");
		int M = sc.nextInt();
		int N = sc.nextInt();
		int arr[][] = new int [M][N];
		
		// M : 3
		// N : 4
		// 입력
		// arr.length 	 : 배열의 행 크기
		// arr[i].length :각 행의 열 크기
		// i 	: 0 1 2
		// 1. i = 0, j = 0 1 2 3
		// 2. i = 1, j = 0 1 2 3
		// 3. i = 2, j = 0 1 2 3
		System.out.println("배열의 행 크기: " + arr.length);
		System.out.println("배열의 열 크기: " + arr[0].length);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("(X, Y) : ");
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int arr2[][] = new int[X][Y];
		
		// 입력
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		
		// foreach문으로 출력
		for (int[] row : arr2) {
			// 1차원 배열
			for (int col: row) {
				// 이제부턴 값
				System.out.print(col + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
