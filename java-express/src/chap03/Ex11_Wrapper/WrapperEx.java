package chap03.Ex11_Wrapper;

public class WrapperEx {

	public static void main(String[] args) {
		//Character_문자하나를 클래스화 해놓은 것_사용
		System.out.println(Character.toLowerCase('A'));
		
		char c1 = '4', c2 = 'F';
		
		if( Character.isDigit(c1) )
			System.out.println(c1 + "는 숫자");
		
		if( Character.isAlphabetic(c2) )
			System.out.println(c2 + "는 영문자");
		
		//Integer 사용
		System.out.println( Integer.parseInt("28") );   	// 문자열 -> 10진수
		System.out.println( Integer.toString(28));	   	 	// 10진수 -> 문자열
		System.out.println( Integer.toBinaryString(28)); 	// 2진수 문자열로 변환
		System.out.println( Integer.bitCount(28));	        // 2진수 1의 개수
		Integer i = new Integer(28);
//		Integer i = 28;
		System.out.println(i.doubleValue());       			// 정수를 double 값으로 변환
		
		//Double 사용
		Double d = new Double(3.14);
		System.out.println(d.toString());           		// 실수형 -> 문자열
		// Double은 static이라 객체를 생성하지 않아도 바로 쓸 수 있음
		System.out.println( Double.parseDouble("3.14"));    // 문자열 -> 실수형
		
		// Boolean 사용 
		boolean b = (4>3);									// true
		System.out.println( Boolean.toString(b) );  		// "true"
		System.out.println( Boolean.parseBoolean("false"));	// "false" -> false
//		System.out.println( Boolean.parseBoolean(1));		System.out.println( Boolean.parseBoolean(1));	// "false" -> fals// "false" -> false
		
		
	
	}
}
