package chap01;

public class exam02 {
	
	public static void main(String[] args) {
		// ĳ���� (Ÿ�� ��ȯ) 
		// 1. �ڵ� Ÿ�� ��ȯ => ������ Ÿ�Ժ�ȯ: ���� Ÿ�� -> ū Ÿ�� �����ͷ� �����Ͽ� �ڵ����� Ÿ���� ��ȯ 
		// 2. ���� Ÿ�� ��ȯ => ����� Ÿ�Ժ�ȯ: (�Ϲ�������)�� ū �ڷ����� �� ���� �ڷ������� ����Ͽ� Ÿ���� ��ȯ
		
		int value1 = (int) 10.5;	// ���� Ÿ�� ��ȯ
		double value2 = 10;			// �ڵ� Ÿ�� ��ȯ
		byte value3 = (byte) 300;	// ���� Ÿ�� ��ȯ: -128 ���� 127���� �ȵǸ� �ѹ��� ���Ƽ� ǥ����
		long value4 = 10;			// ������ �Է����� ���� int �� ��. => Literal ������ �ʾƵ� ���� �ȳ� => �ڵ����� Ÿ�� ��ȯ, int �������� ǥ���� �� ���� ���ε� L�� �Ⱥٿ���=> ���� �� ��
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);

	}
}
