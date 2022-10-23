package chap03.Ex09_Interface;

public class PhoneTest {

	public static void main(String[] args) {
		GalaxyPhone gp = new GalaxyPhone();
		gp.printLogo();
		gp.sendCall();
		gp.recieveCall();
		
		System.out.println();
		
		IPhone ip = new IPhone();
		ip.printLogo();
		ip.sendCall();
		ip.recieveCall();
	}
}
