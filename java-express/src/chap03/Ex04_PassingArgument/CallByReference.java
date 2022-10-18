package chap03.Ex04_PassingArgument;

import chap03.Ex01_Inheritance.Pikachu;

public class CallByReference {
	
	public static void setArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i+1) * 10;
		}
		
		System.out.println("****** setArr �޼ҵ� *****");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]:" + arr[i]);
		}
		System.out.println();
	}
	
	public static void setObj(Pikachu pikachu) {
		pikachu.energy = 1000;
		pikachu.type = "fire";
		
		System.out.println("**** setObj �޼ҵ� ****");
		System.out.println(pikachu.toString());
	}
	
	
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		Pikachu pikachu = new Pikachu();
		pikachu.energy = 100;
		pikachu.type = "thunder";
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;		
		}
		System.out.println("****** main �޼ҵ� *****");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]:" + arr[i]);
		}
		System.out.println(pikachu.toString());
		
		setArr(arr);
		setObj(pikachu);
		
		System.out.println("***** set** �޼ҵ� ȣ�� ��******");
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]:" + arr[i]);
		}
		System.out.println(pikachu.toString());


	}

}
