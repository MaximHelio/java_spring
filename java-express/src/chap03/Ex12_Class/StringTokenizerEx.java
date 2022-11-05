package chap03.Ex12_Class;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	// ��ū: delimeter�� ���ؼ� ������ �Ǵ� �ǹ̸� ���� ���ڿ�. ���⼱ Ŭ���� ������ ��� .... 
	public static void main(String[] args) {
	      
	      String str = "Ŭ����,������,���,�����ε�,�������̵�,�߻�Ŭ����,�������̽�";
	      StringTokenizer st = new StringTokenizer(str, ",");
	      
	      System.out.println("��ū�� �� : " + st.countTokens());   // countTokens() - �и��� ��ū�� ������ ��ȯ
	      
	      // ��ū�� �ִ��� Ȯ�� - hasMoreTokens()
	      // �� ��ū�� ������ true, ������ false
	      while( st.hasMoreTokens() ) {
	         System.out.println(st.nextToken());   // nextToken() - ���� ��ū�� ��ȯ
	      }
	      
	   }
}
