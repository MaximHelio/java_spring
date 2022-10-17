package chap03.Ex01_Inheritance;

public class Raichu extends Pikachu{

	public Raichu() {
		super(200, "mega-thunder");
	}

	public Raichu(int energy, String type) {
		super(energy, type);
	}

	//오버라이딩
	@Override
	public String aAttack() {
		return "백만볼트";
	}
	
	@Override
	public String bAttack() {
		return "볼트체인지";
	}
	
	
	
	
}
