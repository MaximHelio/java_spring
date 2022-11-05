package chap03.Ex12_Class;

public class StringEquals {

	public static void main(String[] args) {
	      String a = "C언어"; // stack 영역에 할당 
	      String b = "JAVA"; // stack 영역에 할당
	      String c = "파이썬"; // stack 영역에 할당
	      String e = "JAVA"; // stack 영역에 할당
	      String f = b;		 // stack 영역에 할당
	      String g = new String("JAVA"); // 인스턴스 : 힙 영역에 할당
	      
	      if( a == b ) {
	         System.out.println("C언어와 JAVA는 같다");
	      }
	      
	      if( b == e ) { // 갖고있는 레퍼런스를 비교
	         System.out.println("변수 b와 변수 e의 인스턴스(메모리)가 같다");
	      }
	      
	      if( b.equals(e) ) {
	         System.out.println("변수 b와 변수 e의 문자열이 일치한다.");
	      }
	      
	      if( b != g ) {
	         System.out.println("변수 b와 변수 g의 인스턴스(메모리)는 다르다.");
	      }
	      
	      if( b.equals(g) ) {
	         System.out.println("변수 b와 변수 g의 문자열은 일치한다.");
	      }
	      
	      
	   }
}
