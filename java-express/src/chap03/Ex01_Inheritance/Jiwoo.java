package chap03.Ex01_Inheritance;

public class Jiwoo {

	public static void main(String[] args) {
		// ��ü ����
		// [Ŭ���� Ÿ��] [��ü��] = new [Ŭ����]();
		Pikachu pikachu = new Pikachu();
//		pikachu.energy = 100;
//		pikachu.type = "thunder";
		
		// . : ���� ������
		// ��ü�� ������ �޼ҵ忡 �����ϴ� ������
		System.out.println("#######��ī��######");
		System.out.println("������: " + pikachu.energy);
		System.out.println("Ÿ��: " +  pikachu.type);
		System.out.println("����A: " + pikachu.aAttack());
		System.out.println("����B: " + pikachu.bAttack());
		System.out.println();
		
		
		Pikachu pikachu20 = new Pikachu(150, "��ȭ");
		System.out.println("#######��ī��(Lv.20)######");
		System.out.println("������: " + pikachu20.energy);
		System.out.println("Ÿ��: " +  pikachu20.type);
		System.out.println("����A: " + pikachu20.aAttack());
		System.out.println("����B: " + pikachu20.bAttack());
		System.out.println();

		
		Raichu raichu = new Raichu();
		System.out.println("#######������######");
		System.out.println("������: " + raichu.energy);
		System.out.println("Ÿ��: " +  raichu.type);
		System.out.println("����A: " + raichu.aAttack());
		System.out.println("����B: " + raichu.bAttack());
		System.out.println();
		
		Raichu raichu40 = new Raichu(400, "super-thunder");
		System.out.println("#######������(Lv.40)######");
		System.out.println("������: " + raichu40.energy);
		System.out.println("Ÿ��: " +  raichu40.type);
		System.out.println("����A: " + raichu40.aAttack());
		System.out.println("����B: " + raichu40.bAttack());
		System.out.println();
		
	}
}
