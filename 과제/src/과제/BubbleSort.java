package 과제;

import java.util.Scanner;

public class BubbleSort {

	// 교환
	static void swap(int[] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

	// 버블정렬
	static void bubbleSort(int[] a) {
		// 버블정렬은 N개를 정렬하면, N-1 pass까지 반복
		for (int i = 0; i < a.length; i++) {
			//1pass 마다 (마지막-i) 자리에 요소가 확정된다.
			for (int j = 0; j < a.length-1-i; j++) {
				// 오름차순 정렬
				if(a[j] > a[j+1]) {
					// 교환
					swap(a, j, j+1);
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
		
		bubbleSort(a);
		
		System.out.println("오름차순 정렬");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " "); // call by reference 때문에 배열을 넘겨받지 않아도 안의 값을 참조할 수 있음
		}
		System.out.println();
		
		sc.close();
		
	}
}
