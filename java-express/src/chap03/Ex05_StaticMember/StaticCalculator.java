package chap03.Ex05_StaticMember;


class Calculator{

	public static int abs(int val) {
		if(val >=0) {
			return val;
		}else {
			return -val ;
		}
	}
	public static int max(int arr[]) {
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	public static int min(int arr[]) {
		int min = arr[0];
		for(int i=1; i<arr.length; i++) {
			if (arr[i] <= min) {
				min = arr[i];
			} 
		}
		return min;
	}
}

public class StaticCalculator {

	public static void main(String[] args) {
		int arr[] = {70, 90, 85, 50, 100};
		
		System.out.println("abs(-123) = " + Calculator.abs(-123));
		System.out.println("max(arr) = " + Calculator.max(arr));
		System.out.println("min(arr) = " + Calculator.min(arr));
	}
}
