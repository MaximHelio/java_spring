package chap02;

import java.util.Scanner;

public class Ex03_Week {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// �迭 ���� �� �迭 ����
		int arr[] = new int[10];
		
		// for 
		// for([�ʱ��] ; [���ǽ�] ; [������]){ }
		// �迭 �Է�
		for (int i = 0; i < arr.length; i++) {
			// print()		: ���ڿ� �� ������ �ֿܼ� '�״��' ���
			// println()	: ln(line) ��� �� ����
			System.out.print("arr[" + i + "] : "); 
			arr[i] = sc.nextInt();
		}
		
		// �迭 ���
		for (int i = 0; i < arr.length; i+=2) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		String week[] = {"��", "ȭ", "��", "��", "��", "��", "��"};
		
		// ��������(++, --)
		// 1. ���� ���� : ++i	: i = i + 1; �� ó���ϰ� ���� ������ ����
		// 2. ���� ���� : i++ : �ٸ� ������ �����ϰ� i = i + 1;�� ����
		
		// ���� ������
		// sum += i;
		// sum = sum + i;
		for (int i = 0; i < week.length; i++) {
			System.out.print(week[i] + " ");
		}
		System.out.println();
		
		// for-each(Advanced for)
		// : �迭�� �÷����� ��� ��Ҹ� �ݺ��ϴ� for��
		// for([Ÿ��] [������] : [�迭 or �÷��� ��]) { }
		for (String day : week) {
			System.out.print(day + " ");
		}
		System.out.println();
		
		sc.close();
	}

}
