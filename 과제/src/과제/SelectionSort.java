package 과제;

import java.util.Scanner;

public class SelectionSort {

	
	// 교환
	static void swap(int[] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

	// 선택정렬
	static void selectionSort(int[] a) {
		
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				// i : 선택한 요소의 인덱스
				// j : (i+1~N-1)
				if(a[i] > a[j]) {
					swap(a, i, j);
				}
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("개수: ");
		
		int N = sc.nextInt();
		int[] a = new int[N];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]: ");
			a[i] = sc.nextInt();
		}
		
		selectionSort(a);
		
		System.out.println("오름차순 정렬");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " "); // call by reference 때문에 배열을 넘겨받지 않아도 안의 값을 참조할 수 있음
		}
		System.out.println();
		
		sc.close();
		
	}
}
