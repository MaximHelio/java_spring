package ����;

import java.util.Scanner;

public class BubbleSort2 {

	// ��ȯ
	static void swap(int[] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

	// ��������
	static void bubbleSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			// pass �� ��ȯ �߻� ��
			int flag = 0;
			for (int j = 0; j < a.length-1-i; j++) {
				if(a[j] > a[j+1]) {
					swap(a, j, j+1);
					flag++;
				}
			}
			if( flag == 0 ) break;
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
