package chap02;

import java.util.Scanner;

// ###### ġŲ �޴��� #####
// 1. ���߹ٻ�� ġŲ
// 2. û�縶�� ġŲ
// 3. ���� ��������
// 0. (����)
// ###### �Է�:
public class Ex05_ChickenMenu {
	/**
	 * �޼ҵ� ����
	 * : ������ �°� ���� �� �ݺ� �����ϱ� ���� ���๮�� ����
	 * [����������] [static / (����)] [���� Ÿ��] [�޼ҵ��] ([�Ű�����]) {���๮; }
	 */
	public static void showMenu() {
		// �޴��� ���
		System.out.println("###### ġŲ �޴��� #####");
		System.out.println("1. ���߹ٻ�� ġŲ");
		System.out.println("2. û�縶�� ġŲ");
		System.out.println("3. ���� ��������");
		System.out.println("0. (����)");
		System.out.print("###### �Է�: ");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String menu = "";		// �޴� �̸�
		int num = 0;			// �޴� ��ȣ
		int cnt = 0;			// �ֹ� ����
		
		// do while(); ��
		// : ������ 1ȸ�� ���� ��, ���ǿ� ���� �ݺ��ϴ� �ݺ���
		do {
			// �޴��� ��� - �޼ҵ� ȣ��
			showMenu();
			// �޴� ��ȣ �Է�
			num = sc.nextInt();
			
			// �޴� ��ȣ�� 0�̸�? ����
			if (num == 0) break;
			
			// �޴� ����
			// switch(��) ~ case (�񱳰�)��
			// - '��' �� '�񱳰�'�� ��ġ�ϸ�, �ش� case���� ����
			// - '��' �� ��ġ�ϴ� '�񱳰�'�� ������, default���� ����
			switch (num) {
				case 1:
					menu = "���� �ٻ�� ġŲ";
					break;
				case 2:
					menu = "û�縶�� ġŲ";
					break;
				case 3:
					menu = "���� �������� ġŲ";
					break;
	
				default:
					break;
			}
			
			// AND ����( && )
			// (���� 1) && (���� 2) 	: ���� 1, 2 ��� true�� ��, ����� true �� �ܿ��� false
			if (num >= 1 && num <= 3) {	
				cnt += 1;
				System.out.println("'" + menu + "' ��(/��) �ֹ��Ǿ����ϴ�! \n");
			} else {
				System.out.println("(0~3)������ ���ڸ� �Է����ּ���. \n");
			}
			
		} while(true);
		
		// 3���� �ֹ��� �Ϸ�Ǿ����ϴ�. 
		System.out.println(cnt + "����" + "�ֹ��� �Ϸ�Ǿ����ϴ� !");	// while �� �Ʒ��� �ڵ�� ���ٵ���x,  �ݺ��� Ż���ϴ� ������ �ϳ��� ����
		
		sc.close();
	}	
}
