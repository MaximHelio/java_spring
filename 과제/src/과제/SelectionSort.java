package ����;

import java.util.Scanner;

public class SelectionSort {

	
	// ��ȯ
	static void swap(int[] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

	// ��������
	static void selectionSort(int[] a) {
		
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				// i : ������ ����� �ε���
				// j : (i+1~N-1)
				if(a[i] > a[j]) {
					swap(a, i, j);
				}
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����: ");
		
		int N = sc.nextInt();
		int[] a = new int[N];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]: ");
			a[i] = sc.nextInt();
		}
		
		selectionSort(a);
		
		System.out.println("�������� ����");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " "); // call by reference ������ �迭�� �Ѱܹ��� �ʾƵ� ���� ���� ������ �� ����
		}
		System.out.println();
		
		sc.close();
		
	}
}
