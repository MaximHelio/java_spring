package chap03.Ex01_Inheritance;

public class Pikachu {
	// 클래스: 객체를 정의하는 설계도
	// 멤버 : 변수, 메서드
	
	// 변수
	public int energy;
	public String type;
	
	// 기본 생성자: 반환타입 없는 이유 => 클래스의 변수를 초기화하기 위함이 역할이기 때문
	public Pikachu() {
		//로 써도 됨=> 생성자 안에서만 쓸 수 있음, 무조건 생성자 안에서만 사용해야
		this(100, "thunder"); 
//		this.energy = 100;
//		this.type = "thunder";
	}
	
	// 매개변수가 있는 생성자
	// 메서드 오버로딩
	public Pikachu(int energy, String type) {
		// this:  멤버변수의 이름과 매개변수의 이름이 동일할 때 사용
		this.energy = energy;
		this.type = type;
	}

	// 메서드
	public String aAttack() {
		return "십만볼트";
	}
	
	public String bAttack() {
		return "전광석화";
	}
	
}
