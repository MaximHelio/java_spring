package chap03.Ex03_Encapsulation;

public class test {
	public static void main(String[] args) {
		
		Encapsulation ec = new Encapsulation(0, "��������", "282401-04-109955", "ALOHA"); //���� ��ü
		ec.setDeposit(100000000);
		
		int money = ec.getDeposit();
		System.out.println(ec);
		System.out.println("���� �ܾ� :" + money );
				
	}
}
