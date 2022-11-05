package chap03.Ex12_Class;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	// 토큰: delimeter를 통해서 구분이 되는 의미를 갖는 문자열. 여기선 클래스 생성자 상속 .... 
	public static void main(String[] args) {
	      
	      String str = "클래스,생성자,상속,오버로딩,오버라이딩,추상클래스,인터페이스";
	      StringTokenizer st = new StringTokenizer(str, ",");
	      
	      System.out.println("토큰의 수 : " + st.countTokens());   // countTokens() - 분리한 토큰의 개수를 반환
	      
	      // 토큰이 있는지 확인 - hasMoreTokens()
	      // ㄴ 토큰이 있으면 true, 없으면 false
	      while( st.hasMoreTokens() ) {
	         System.out.println(st.nextToken());   // nextToken() - 다음 토큰을 반환
	      }
	      
	   }
}
