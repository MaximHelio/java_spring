package 과제;

import java.util.Scanner;

public class InsertionSort {

	//삽입정렬 : 일부는 정렬되어있는데, 일부는 정렬되어있지 않을 때 사용
	public static void insertionSort(int[] a) {
		
		// 1. 2번째 요소부터 선택하고, 값을 KEY 저장
		// 2. 바로 앞에 있는 요소의 값을 다음 요소에 대입
		// 3. KEY 값과 앞의 요소의 값을 비교
		// 		i) (앞의 요소) > (KEY)
		//			-> 한 단계 더 앞쪽 요소를 탐색
		//		ii) (앞의 요소) < (KEY)
		// 			-> 탐색한 요소 바로 다음 요소에 KEY값을 대입
		
		// i=1 : 2번째 요소부터
		for (int i = 1; i < a.length; i++) {
			int j;
			int key = a[i];
			
			// a[j] : 다음 요소
			// a[j-1] : 앞의 요소
			for (j = i; j > 0 && a[j-1] > key; j--) {
				// 바로 앞에 있는 요소(j-1)의 값을 다음 요소(j)에 대입
				a[j] = a[j-1];
			}
			a[j] = key;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("개수: ");
		int N = sc.nextInt();
		int[] a = new int[N];
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "]: ");
			a[i] =sc.nextInt();
		}
		
		insertionSort(a);
		
		System.out.println("오름차순 정렬");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	
		
		
		sc.close();
		
	}
}
