package chap02;

import java.util.Scanner;

public class Ex04_Matrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// M�� N���� 2���� �迭
		System.out.print("(M, N) :");
		int M = sc.nextInt();
		int N = sc.nextInt();
		int arr[][] = new int [M][N];
		
		// M : 3
		// N : 4
		// �Է�
		// arr.length 	 : �迭�� �� ũ��
		// arr[i].length :�� ���� �� ũ��
		// i 	: 0 1 2
		// 1. i = 0, j = 0 1 2 3
		// 2. i = 1, j = 0 1 2 3
		// 3. i = 2, j = 0 1 2 3
		System.out.println("�迭�� �� ũ��: " + arr.length);
		System.out.println("�迭�� �� ũ��: " + arr[0].length);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		// ���
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
		
		// �Է�
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		
		// foreach������ ���
		for (int[] row : arr2) {
			// 1���� �迭
			for (int col: row) {
				// �������� ��
				System.out.print(col + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
