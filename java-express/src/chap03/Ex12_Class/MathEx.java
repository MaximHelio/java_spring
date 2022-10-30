package chap03.Ex12_Class;

import java.util.Random;

public class MathEx {

	public static void main(String[] args) {

		System.out.println(Math.PI);			//3.141592653589793(������)
		System.out.println(Math.ceil(3.125));	// �ø�
		System.out.println(Math.floor(3.75));	// ����
		System.out.println(Math.sqrt(9));		// ������
		System.out.println(Math.pow(3, 2));		// 3�� 2����
		System.out.println(Math.exp(2));		// e�� 2��
		System.out.println(Math.round(3.14));   // �ݿø�
		

		System.out.println("Math.random():" + Math.random());

		// [1, 45] ������ ������ ���� 5�� ����
		// Math.random()					: 0.0���� ũ�ų� ����, 1.0���� ���� ������ �Ǽ��� ����
		// ( 0.xxx ~0.999 ) * 45 			: 0.xxx ~ 44.xxx
		// (( 0.xxx ~0.999 ) * 45) + 1		: 1.xxx ~ 45.xxx
		// (Math.random() * 45) + 1			: 1.xxx ~ 45.xxx
		// (int) ((Math.random() * 45) + 1) : 1 ~ 45
		// ���� - a ~ b ������ ������
		// (int) ((Math.random() * [����] + [���ۼ���]))
		System.out.println("�̹��� ����� ��ȣ��");
		for (int i = 0; i < 6; i++) {
			int random = (int) (Math.random() * 45 + 1);
			System.out.print( random + " ");
		}
		System.out.println();
		
		// -20 ~ + 20 ������ �ϳ�
		// 0.xxx ~ 40.xxx
		// -20.xxx ~ 20.xxx
		// -20  ~ 20
		int random = (int) (Math.random() * 41 + (-20));
		System.out.println("(-20 ~ +20)" + random);

		// Random�̶�� Ŭ������ ����
		Random r = new Random();
		// 0 ~ N ������ ���� ���� ��������
		System.out.println(r.nextInt(100));
		// -50 ~50 ������ ���� ���� ��������
		System.out.println(r.nextInt(100) -50);
		
	}
}
