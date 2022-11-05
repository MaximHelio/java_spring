package chap03.Ex12_Class;

public class StringTest {

	public static void main(String[] args) {
	      
	      String text = " Hello Java4Android";
	      String com = " HEllo Java4Android";
	      
	      System.out.println(text.charAt(2));              // index 0���� ����, index�� �ִ� ���ڸ� ����. ' '(0), 'H'(1), 'e'(2), : 'e'�� ���õ�
	      System.out.println(text.concat("s"));            // �ش� ���ڿ� �ڿ� ���ڰ����� �Է��� ���ڿ��� �����Ѵ�. + ����� ����
	      System.out.println(text.contains("And"));        // ���ڿ��� �����ϰ� �ִ��� Ȯ�� (true/false)
	      System.out.println(text.equals(com));            // ���ڿ��� ��ġ�ϴ��� Ȯ�� (true/false)
	      System.out.println(text.equalsIgnoreCase(com));  // ��ҹ��ڸ� �������� �ʰ� �� ���ڿ��� ������ Ȯ�� (true/false)
	      System.out.println(text.indexOf("a"));           // �ش� ���ڰ� ó�� �߰ߵ� index�� ��ȯ, ������ -1 ��ȯ
	      System.out.println(text.lastIndexOf("a"));       // �ش� ���ڰ� ���������� �߰ߵ� index�� ��ȯ, ������ -1 ��ȯ
	      System.out.println(text.trim());                 // ���ڿ� ������ ������ ����
	      System.out.println(text.length());               // ���ڿ��� ���̸� ��ȯ
	      System.out.println(text.substring(7));           // �ش� index ���� ���ڿ��� �ڸ���, �� ���� ���ڿ��� ��ȯ.  (0~6)��° �ڸ���, 7��°���� ��ȯ
	      System.out.println(text.substring(7,11));        // index1 ���� (index2-index1)���ڸ� ��ȯ
	      System.out.println(text.replace(" ", "-"));      // replace("��������", "�ٲ���"); "��������" ���� "�ٲ���" �� ��ȯ
	      System.out.println(text.replaceAll("", "-"));    // replace�� ����
	      System.out.println(text.toUpperCase());          // ��� �빮�ڷ� ����
	      System.out.println(text.toLowerCase());          // ��� �ҹ��ڷ� ����
	      
	      String[] sp = text.split("");                    // split("(������)");    (������)�� �������� ���ڿ��� �߶� �迭�� ��ȯ
	      for (int i = 0; i < sp.length; i++) {
	         System.out.println(i + "\t\t" + sp[i] + "\t\t" + sp[i].length());
	      }
	      
	   }
	
}
