package chap01;

public class exam01 {

	// 프로그램의 시작
	public static void main(String[] args) {
		
		// 상수 _ 값을 넣은 기회가 마지막
		final double PI = 3.141592;
//		PI = 10.23;
		
		
		// 기본 자료형 (8개)
		boolean b = false;
		char ch = 'A';
		byte Byte = 100;
		short Short = 500;
		int Int = 2100000;
		long Long = 2100000000L; // long은 리터럴이 붙어야 변수가 들어감.
		float Float = 12.34F;	 // float은 리터럴이 붙어야 변수가 들어감.
		double Double = 1234.5678; // 실수 쓸 때는 double 많이 씀
		
		// sysout : ctrl + space
		// 한 줄 복사: ctrl + alt + 방향키 
		System.out.println("b: " + b);
		System.out.println("ch: " + ch);
		System.out.println("Byte: " + Byte);
		System.out.println("Short: " + Short);
		System.out.println("Int: " + Int);
		System.out.println("Long: " + Long);
		System.out.println("Float: " + Float);
		System.out.println("Double: " + Double);
		
		System.out.println("PI: " + PI);
		
		// 한 줄 삭제: ctrl  + D
		
		
	}
}
