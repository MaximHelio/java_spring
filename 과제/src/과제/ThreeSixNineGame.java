package ����;

public class ThreeSixNineGame {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			
			int ten = i / 10; // 10�� �ڸ���
			int one = i % 10; // 1�� �ڸ���
			boolean isTen369 = ten == 3 || ten == 6 || ten == 9;
			boolean isOne369 = one == 3 || ten == 6 || ten == 9;
			
			if(isTen369 && isOne369)
				System.out.println("**");
			else if(isTen369 || isOne369)
				System.out.println("*");
			else
				System.out.println(i);
			
		}
	}
}
