package ����;

import java.util.Scanner;

public class InsertionSort {

	//�������� : �Ϻδ� ���ĵǾ��ִµ�, �Ϻδ� ���ĵǾ����� ���� �� ���
	public static void insertionSort(int[] a) {
		
		// 1. 2��° ��Һ��� �����ϰ�, ���� KEY ����
		// 2. �ٷ� �տ� �ִ� ����� ���� ���� ��ҿ� ����
		// 3. KEY ���� ���� ����� ���� ��
		// 		i) (���� ���) > (KEY)
		//			-> �� �ܰ� �� ���� ��Ҹ� Ž��
		//		ii) (���� ���) < (KEY)
		// 			-> Ž���� ��� �ٷ� ���� ��ҿ� KEY���� ����
		
		// i=1 : 2��° ��Һ���
		for (int i = 1; i < a.length; i++) {
			int j;
			int key = a[i];
			
			// a[j] : ���� ���
			// a[j-1] : ���� ���
			for (j = i; j > 0 && a[j-1] > key; j--) {
				// �ٷ� �տ� �ִ� ���(j-1)�� ���� ���� ���(j)�� ����
				a[j] = a[j-1];
			}
			a[j] = key;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����: ");
		int N = sc.nextInt();
		int[] a = new int[N];
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "]: ");
			a[i] =sc.nextInt();
		}
		
		insertionSort(a);
		
		System.out.println("�������� ����");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	
		
		
		sc.close();
		
	}
}
