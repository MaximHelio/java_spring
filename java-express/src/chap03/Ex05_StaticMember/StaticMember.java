package chap03.Ex05_StaticMember;

public class StaticMember {
	static int a;
	static int b;
	int c;
	static final double PI = 3.141592;
	
	public static int sum(int x, int y) {
		int sum = a+b+x+y;
//		sum += c; 	// static 메서드 안에서는 인스턴스 변수를 쓸 수 없다.
		return sum;
	}
	
	public static void main(String[] args) {
		int sum = sum(10, 20);
		a = 100;
		
		StaticMember sm1 = new StaticMember();
		StaticMember sm2 = new StaticMember();
		
		int a1 = sm1.a;
		int c1 = sm1.c = 10;
		int a2 = sm2.a;
		int c2 = sm2.c = 20;
		
		// PI = 100;
		
		System.out.println(a1);  // 100
		System.out.println(c1);  // 10
		System.out.println(a2);  // 100
		System.out.println(c2);  // 20

	}
}
