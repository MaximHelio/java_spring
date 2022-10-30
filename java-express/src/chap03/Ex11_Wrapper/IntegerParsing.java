package chap03.Ex11_Wrapper;

public class IntegerParsing {

	public static void main(String[] args) {
		
		String 문자열숫자 = "10";
		int 정수숫자 = 20;
		
		//1020
		System.out.println(문자열숫자 + 정수숫자); // 더 큰 자료형으로 형변환 돼서 흡수됨. 문자열 => 클래스. +가 산술연산자가 아니라 문자열연결연산자가 됨
		
		int 변환숫자 = Integer.parseInt(문자열숫자);
		System.out.println(정수숫자 + 변환숫자); 	
		
	}
}
