package chap03.Ex12_Class;

public class StringTest {

	public static void main(String[] args) {
	      
	      String text = " Hello Java4Android";
	      String com = " HEllo Java4Android";
	      
	      System.out.println(text.charAt(2));              // index 0부터 시작, index에 있는 문자를 추출. ' '(0), 'H'(1), 'e'(2), : 'e'이 선택됨
	      System.out.println(text.concat("s"));            // 해당 문자열 뒤에 인자값으로 입력한 문자열을 연결한다. + 연산과 같음
	      System.out.println(text.contains("And"));        // 문자열을 포함하고 있는지 확인 (true/false)
	      System.out.println(text.equals(com));            // 문자열이 일치하는지 확인 (true/false)
	      System.out.println(text.equalsIgnoreCase(com));  // 대소문자를 구분하지 않고 두 문자열이 같은지 확인 (true/false)
	      System.out.println(text.indexOf("a"));           // 해당 문자가 처음 발견된 index를 반환, 없으면 -1 반환
	      System.out.println(text.lastIndexOf("a"));       // 해당 문자가 마지막으로 발견된 index를 반환, 없으면 -1 반환
	      System.out.println(text.trim());                 // 문자열 양쪽의 공백을 제거
	      System.out.println(text.length());               // 문자열의 길이를 반환
	      System.out.println(text.substring(7));           // 해당 index 앞의 문자열을 자르고, 그 뒤의 문자열을 반환.  (0~6)번째 자르고, 7번째부터 반환
	      System.out.println(text.substring(7,11));        // index1 부터 (index2-index1)글자를 반환
	      System.out.println(text.replace(" ", "-"));      // replace("기존문자", "바뀔문자"); "기존문자" 에서 "바뀔문자" 로 변환
	      System.out.println(text.replaceAll("", "-"));    // replace와 같음
	      System.out.println(text.toUpperCase());          // 모두 대문자로 변경
	      System.out.println(text.toLowerCase());          // 모두 소문자로 변경
	      
	      String[] sp = text.split("");                    // split("(구분자)");    (구분자)를 기준으로 문자열을 잘라서 배열로 반환
	      for (int i = 0; i < sp.length; i++) {
	         System.out.println(i + "\t\t" + sp[i] + "\t\t" + sp[i].length());
	      }
	      
	   }
	
}
