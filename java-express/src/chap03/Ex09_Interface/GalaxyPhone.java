package chap03.Ex09_Interface;

public class GalaxyPhone implements PhoneInterface{

	@Override
	public void sendCall() {
		System.out.println("[GALAXY] 전화를 겁니다!!!");
	}

	@Override
	public void recieveCall() {
		System.out.println("[GALAXY] 전화를 받습니다!!!");
	}

	@Override
	public void printLogo() {
//		PhoneInterface.super.printLogo();
		System.out.println("*****GALAXY****");
	}

	
	
}
