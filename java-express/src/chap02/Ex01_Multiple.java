package chap02;

import java.util.Scanner;

public class Ex01_Multiple {

	// main : ctrl + space
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �Է¹� - Sc: ctrl + space
		// ��ü ����
		// [Ŭ���� Ÿ��] [��ü��] = new [Ŭ����](����);
		// Scanner => �ܼ�, Ű���� �� �޸������κ��͵� �Է¹��� �� ����/ system.in => Ű����κ��� �Է��� �޴� ��ü�� ����� ��.
		// System.in : Ű����κ��� �Է¹޵��� �ϴ� Ű����
		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt(); // �ϳ��� ������ �Է¹޴� ��
		int num = sc.nextInt();
		
		// 3�� ������� �ƴ��� �Ǵ��ϰ� �� ���θ� ����Ͻÿ�.
		if(num % 3 == 0) {
			// ��¹�
			System.out.println("3�� ����Դϴ�.");
		}else {
			System.out.println("3�� ����� �ƴմϴ�");
		}
		sc.close();
	}

}
