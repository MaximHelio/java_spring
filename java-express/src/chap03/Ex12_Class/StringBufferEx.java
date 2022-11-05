package chap03.Ex12_Class;

public class StringBufferEx {

	// Buffer : 데이터를 송수신할 때(입/출력 시), 긴 데이터를 한번에 전달할 수는 없기 때문에, 데이터를 작은 단위로 나누어서 담는 단위
	// ex. 1G 데이터를 송신하는데, 2kb buffer에 실어서 보내는 것. buffer => 아주 큰 데이터를 쪼갠 단위
	// StringBuffer 클래스: 가변 스트링을 다루는 클래스
	
	public static void main(StringTest[] args) {
	      StringBuffer sb = new StringBuffer("This");
	      
	      System.out.println(sb);
	      
	      sb.append(" is pencil");   // 문자열 덧붙이기
	      System.out.println(sb);
	      
	      sb.insert(7, " my");      // " my" 문자열 7번째 index에 삽입
	      System.out.println(sb);      
	      
	      sb.replace(8, 10, "your");   // 8번째 ~ (10-1)번째 index의 문자를 "your"로 변경
	      System.out.println(sb);
	      
	      sb.delete(8, 13);         // 8번째 ~ (13-1)번째 index의 문자를 삭제
	      System.out.println(sb);
	      
	      sb.setLength(4);         // 스프링 버퍼 내 문자열 길이 수정
	      System.out.println(sb);
	   }
}
