package chap03.Ex09_Interface;

public class IPhone implements PhoneInterface{

	@Override
	public void sendCall() {
		System.out.println("[Apple] ��ȭ�� �̴ϴ� !!!");
	}

	@Override
	public void recieveCall() {
		System.out.println("[Apple] ��ȭ�� �޽��ϴ�!!!");		
	}

	@Override
	public void printLogo() {
//		PhoneInterface.super.printLogo();
		System.out.println("**** Apple ****");
	}
	
	
}
