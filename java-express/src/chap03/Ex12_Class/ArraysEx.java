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
//		// 오름차순 정렬하여 출력
//		for (int i = 0; i < arr.length-1; i++) {
//			//i: 선택한 요소의 인덱스
//			//j: 비교요소의 인덱스(i+1 ~N-1)
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
		
		// 배열을 정렬(sort)
		// 5 3 4 1 2 -> 1 2 3 4 5
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "");
		}
		System.out.println();
		
		int[] random = new int[100];
		for (int i = 0; i < random.length; i++) {
			random[i] = (int) (Math.random() * 100 + 1);	// 얼마치를 사야 로또 1등에 당첨될 것인가? 
		}
		
		Arrays.sort(random);
		
		//이진 검색 알고리즘을 사용하여 검색한 후, 해당 값이 있으면, 그 위치를 (index)를 반환
		// 찾지 못했으면, (-(insertion point) - 1) 음수를 반환
		if( Arrays.binarySearch(random, 10) < 0) {
			System.out.println("랜덤 수 10이 없습니다.");
		}else {
			System.out.println("랜덤 수 중 10의 index: " + Arrays.binarySearch(random, 10) );
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
		
		// 1 2 3 4 5 이 중에서
		// 3 4 를 복사해옴
		int copyRange[] = Arrays.copyOfRange(arr, 2, 4);
		
		for (int i = 0; i < copyRange.length; i++) {
			System.out.print( copyRange[i] + " ");
		}
		System.out.println();
	}
}


