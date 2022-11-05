package ����;

import java.util.Scanner;

public class BubbleSort {

	// ��ȯ
	static void swap(int[] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

	// ��������
	static void bubbleSort(int[] a) {
		// ���������� N���� �����ϸ�, N-1 pass���� �ݺ�
		for (int i = 0; i < a.length; i++) {
			//1pass ���� (������-i) �ڸ��� ��Ұ� Ȯ���ȴ�.
			for (int j = 0; j < a.length-1-i; j++) {
				// �������� ����
				if(a[j] > a[j+1]) {
					// ��ȯ
					swap(a, j, j+1);
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
		
		bubbleSort(a);
		
		System.out.println("�������� ����");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " "); // call by reference ������ �迭�� �Ѱܹ��� �ʾƵ� ���� ���� ������ �� ����
		}
		System.out.println();
		
		sc.close();
		
	}
}
