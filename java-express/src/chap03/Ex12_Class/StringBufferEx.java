package chap03.Ex12_Class;

public class StringBufferEx {

	// Buffer : �����͸� �ۼ����� ��(��/��� ��), �� �����͸� �ѹ��� ������ ���� ���� ������, �����͸� ���� ������ ����� ��� ����
	// ex. 1G �����͸� �۽��ϴµ�, 2kb buffer�� �Ǿ ������ ��. buffer => ���� ū �����͸� �ɰ� ����
	// StringBuffer Ŭ����: ���� ��Ʈ���� �ٷ�� Ŭ����
	
	public static void main(StringTest[] args) {
	      StringBuffer sb = new StringBuffer("This");
	      
	      System.out.println(sb);
	      
	      sb.append(" is pencil");   // ���ڿ� �����̱�
	      System.out.println(sb);
	      
	      sb.insert(7, " my");      // " my" ���ڿ� 7��° index�� ����
	      System.out.println(sb);      
	      
	      sb.replace(8, 10, "your");   // 8��° ~ (10-1)��° index�� ���ڸ� "your"�� ����
	      System.out.println(sb);
	      
	      sb.delete(8, 13);         // 8��° ~ (13-1)��° index�� ���ڸ� ����
	      System.out.println(sb);
	      
	      sb.setLength(4);         // ������ ���� �� ���ڿ� ���� ����
	      System.out.println(sb);
	   }
}
