package chap03.Ex01_Inheritance;

public class Pikachu {
	// Ŭ����: ��ü�� �����ϴ� ���赵
	// ��� : ����, �޼���
	
	// ����
	public int energy;
	public String type;
	
	// �⺻ ������: ��ȯŸ�� ���� ���� => Ŭ������ ������ �ʱ�ȭ�ϱ� ������ �����̱� ����
	public Pikachu() {
		//�� �ᵵ ��=> ������ �ȿ����� �� �� ����, ������ ������ �ȿ����� ����ؾ�
		this(100, "thunder"); 
//		this.energy = 100;
//		this.type = "thunder";
	}
	
	// �Ű������� �ִ� ������
	// �޼��� �����ε�
	public Pikachu(int energy, String type) {
		// this:  ��������� �̸��� �Ű������� �̸��� ������ �� ���
		this.energy = energy;
		this.type = type;
	}

	// �޼���
	public String aAttack() {
		return "�ʸ���Ʈ";
	}
	
	public String bAttack() {
		return "������ȭ";
	}
	
}
