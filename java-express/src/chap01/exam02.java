package chap01;

public class exam02 {
	
	public static void main(String[] args) {
		// 캐스팅 (타입 변환) 
		// 1. 자동 타입 변환 => 묵시적 타입변환: 작은 타입 -> 큰 타입 데이터로 대입하여 자동으로 타입이 변환 
		// 2. 강제 타입 변환 => 명시적 타입변환: (일반적으로)더 큰 자료형을 더 작은 자료형으로 명시하여 타입을 변환
		
		int value1 = (int) 10.5;	// 강제 타입 변환
		double value2 = 10;			// 자동 타입 변환
		byte value3 = (byte) 300;	// 강제 타입 변환: -128 에서 127까지 안되면 한바퀴 돌아서 표현됨
		long value4 = 10;			// 정수를 입력했을 때는 int 인 것. => Literal 붙이지 않아도 오류 안남 => 자동으로 타입 변환, int 범위에서 표현할 수 없는 값인데 L을 안붙였다=> 오류 날 것
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);

	}
}
