package chap03.Ex09_Interface;

public class GalaxyPhone implements PhoneInterface{

	@Override
	public void sendCall() {
		System.out.println("[GALAXY] ��ȭ�� �̴ϴ�!!!");
	}

	@Override
	public void recieveCall() {
		System.out.println("[GALAXY] ��ȭ�� �޽��ϴ�!!!");
	}

	@Override
	public void printLogo() {
//		PhoneInterface.super.printLogo();
		System.out.println("*****GALAXY****");
	}

	
	
}
