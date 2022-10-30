package chap03.Ex11_Wrapper;

public class WrapperEx {

	public static void main(String[] args) {
		//Character_�����ϳ��� Ŭ����ȭ �س��� ��_���
		System.out.println(Character.toLowerCase('A'));
		
		char c1 = '4', c2 = 'F';
		
		if( Character.isDigit(c1) )
			System.out.println(c1 + "�� ����");
		
		if( Character.isAlphabetic(c2) )
			System.out.println(c2 + "�� ������");
		
		//Integer ���
		System.out.println( Integer.parseInt("28") );   	// ���ڿ� -> 10����
		System.out.println( Integer.toString(28));	   	 	// 10���� -> ���ڿ�
		System.out.println( Integer.toBinaryString(28)); 	// 2���� ���ڿ��� ��ȯ
		System.out.println( Integer.bitCount(28));	        // 2���� 1�� ����
		Integer i = new Integer(28);
//		Integer i = 28;
		System.out.println(i.doubleValue());       			// ������ double ������ ��ȯ
		
		//Double ���
		Double d = new Double(3.14);
		System.out.println(d.toString());           		// �Ǽ��� -> ���ڿ�
		// Double�� static�̶� ��ü�� �������� �ʾƵ� �ٷ� �� �� ����
		System.out.println( Double.parseDouble("3.14"));    // ���ڿ� -> �Ǽ���
		
		// Boolean ��� 
		boolean b = (4>3);									// true
		System.out.println( Boolean.toString(b) );  		// "true"
		System.out.println( Boolean.parseBoolean("false"));	// "false" -> false
//		System.out.println( Boolean.parseBoolean(1));		System.out.println( Boolean.parseBoolean(1));	// "false" -> fals// "false" -> false
		
		
	
	}
}
