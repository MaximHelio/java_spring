package chap03.Ex11_Wrapper;

public class IntegerParsing {

	public static void main(String[] args) {
		
		String ���ڿ����� = "10";
		int �������� = 20;
		
		//1020
		System.out.println(���ڿ����� + ��������); // �� ū �ڷ������� ����ȯ �ż� �����. ���ڿ� => Ŭ����. +�� ��������ڰ� �ƴ϶� ���ڿ����Ῥ���ڰ� ��
		
		int ��ȯ���� = Integer.parseInt(���ڿ�����);
		System.out.println(�������� + ��ȯ����); 	
		
	}
}
