package chap03.Ex07_UpDownCasting;

public class UpCasting {

	public static void main(String[] args) {
		// 업캐스팅(자식->부모)
		// 업캐스팅 시에는 좌변의 변수만 따라가고, 메서드는 동적바인딩이 돼서 우변의 자식에 있는 메서드가 실행이 된다.
		Person person = new Student("알로하", 20, 1, "컴퓨터공학");
		
		System.out.println(person);		// 부모의 변수가 호출됨
		System.out.println(person.work());	// 동적바인딩 돼서 자식의 메서드가 호출됨
		
//		System.out.println(person.grade);
//		System.out.println(person.major);
		
	}
}
