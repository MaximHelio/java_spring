package chap03.Ex12_Class;

public class StringEquals {

	public static void main(String[] args) {
	      String a = "C���"; // stack ������ �Ҵ� 
	      String b = "JAVA"; // stack ������ �Ҵ�
	      String c = "���̽�"; // stack ������ �Ҵ�
	      String e = "JAVA"; // stack ������ �Ҵ�
	      String f = b;		 // stack ������ �Ҵ�
	      String g = new String("JAVA"); // �ν��Ͻ� : �� ������ �Ҵ�
	      
	      if( a == b ) {
	         System.out.println("C���� JAVA�� ����");
	      }
	      
	      if( b == e ) { // �����ִ� ���۷����� ��
	         System.out.println("���� b�� ���� e�� �ν��Ͻ�(�޸�)�� ����");
	      }
	      
	      if( b.equals(e) ) {
	         System.out.println("���� b�� ���� e�� ���ڿ��� ��ġ�Ѵ�.");
	      }
	      
	      if( b != g ) {
	         System.out.println("���� b�� ���� g�� �ν��Ͻ�(�޸�)�� �ٸ���.");
	      }
	      
	      if( b.equals(g) ) {
	         System.out.println("���� b�� ���� g�� ���ڿ��� ��ġ�Ѵ�.");
	      }
	      
	      
	   }
}
