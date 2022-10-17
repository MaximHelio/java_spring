package chap03.Ex01_Inheritance;

public class Jiwoo {

	public static void main(String[] args) {
		// 객체 생성
		// [클래스 타입] [객체명] = new [클래스]();
		Pikachu pikachu = new Pikachu();
//		pikachu.energy = 100;
//		pikachu.type = "thunder";
		
		// . : 접근 연산자
		// 객체의 변수와 메소드에 접근하는 연산자
		System.out.println("#######피카츄######");
		System.out.println("에너지: " + pikachu.energy);
		System.out.println("타입: " +  pikachu.type);
		System.out.println("공격A: " + pikachu.aAttack());
		System.out.println("공격B: " + pikachu.bAttack());
		System.out.println();
		
		
		Pikachu pikachu20 = new Pikachu(150, "진화");
		System.out.println("#######피카츄(Lv.20)######");
		System.out.println("에너지: " + pikachu20.energy);
		System.out.println("타입: " +  pikachu20.type);
		System.out.println("공격A: " + pikachu20.aAttack());
		System.out.println("공격B: " + pikachu20.bAttack());
		System.out.println();

		
		Raichu raichu = new Raichu();
		System.out.println("#######라이츄######");
		System.out.println("에너지: " + raichu.energy);
		System.out.println("타입: " +  raichu.type);
		System.out.println("공격A: " + raichu.aAttack());
		System.out.println("공격B: " + raichu.bAttack());
		System.out.println();
		
		Raichu raichu40 = new Raichu(400, "super-thunder");
		System.out.println("#######라이츄(Lv.40)######");
		System.out.println("에너지: " + raichu40.energy);
		System.out.println("타입: " +  raichu40.type);
		System.out.println("공격A: " + raichu40.aAttack());
		System.out.println("공격B: " + raichu40.bAttack());
		System.out.println();
		
	}
}
