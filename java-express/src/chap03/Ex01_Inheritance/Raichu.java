package chap03.Ex01_Inheritance;

public class Raichu extends Pikachu{

	public Raichu() {
		super(200, "mega-thunder");
	}

	public Raichu(int energy, String type) {
		super(energy, type);
	}

	//�������̵�
	@Override
	public String aAttack() {
		return "�鸸��Ʈ";
	}
	
	@Override
	public String bAttack() {
		return "��Ʈü����";
	}
	
	
	
	
}
