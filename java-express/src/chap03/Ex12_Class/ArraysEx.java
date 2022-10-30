package chap03.Ex12_Class;

import java.util.Arrays;

public class ArraysEx {

//	public static void main(String[] args) {
//		
//		int[] arr = {5, 3, 4, 1, 2};
//		
//		for(int i=0; i<arr.length-1; i++) {
//			int temp = 0;
//			if(arr[i] > arr[i+1]) {
//				temp = arr[i];
//				arr[i] = arr[i+1];
//				arr[i+1] = temp;				
//			}
//		}
//		for (int i : arr) {
//			System.out.println(i);
//		}
//	}
	
//	public static void main(String[] args) {
//		int [] arr = {5, 3, 4, 1, 2};
//		// �������� �����Ͽ� ���
//		for (int i = 0; i < arr.length-1; i++) {
//			//i: ������ ����� �ε���
//			//j: �񱳿���� �ε���(i+1 ~N-1)
//			for (int j = i+1; j < arr.length; j++) {
//				if( arr[i] > arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		for (int i : arr) {
//			System.out.println(i);
//		}
//		
//	} 
	
	public static void main(String[] args) {
		int [] arr = {5, 3, 4, 1, 2};
		
		// �迭�� ����(sort)
		// 5 3 4 1 2 -> 1 2 3 4 5
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "");
		}
		System.out.println();
		
		int[] random = new int[100];
		for (int i = 0; i < random.length; i++) {
			random[i] = (int) (Math.random() * 100 + 1);	// ��ġ�� ��� �ζ� 1� ��÷�� ���ΰ�? 
		}
		
		Arrays.sort(random);
		
		//���� �˻� �˰����� ����Ͽ� �˻��� ��, �ش� ���� ������, �� ��ġ�� (index)�� ��ȯ
		// ã�� ��������, (-(insertion point) - 1) ������ ��ȯ
		if( Arrays.binarySearch(random, 10) < 0) {
			System.out.println("���� �� 10�� �����ϴ�.");
		}else {
			System.out.println("���� �� �� 10�� index: " + Arrays.binarySearch(random, 10) );
		}
		
		for (int i = 0; i < random.length; i++) {
			System.out.print(random[i] + " ");
		}
		System.out.println();
		
		int fill[] = new int[10];
		
		Arrays.fill(fill, 6);
	
		for (int i = 0; i < fill.length; i++) {
			System.out.print(fill[i] + "");
		}
		System.out.println();
		
		// 6 6 6 6 6 6 6 6 6 6
		// 6 6 6
		int copy[] = Arrays.copyOf(fill, 3);
		System.out.println();
		
		for (int i = 0; i < copy.length; i++) {
			System.out.print( copy[i] + " ");
		}
		System.out.println();
		
		// 1 2 3 4 5 �� �߿���
		// 3 4 �� �����ؿ�
		int copyRange[] = Arrays.copyOfRange(arr, 2, 4);
		
		for (int i = 0; i < copyRange.length; i++) {
			System.out.print( copyRange[i] + " ");
		}
		System.out.println();
	}
}


