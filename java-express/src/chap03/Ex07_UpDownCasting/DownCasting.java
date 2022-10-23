package chap03.Ex07_UpDownCasting;

public class DownCasting {

	public static void main(String[] args) {

		// 업캐스팅 먼저 -> 다운캐스팅의 전제조건
		Person person = new Student("알로하", 20, 1, "컴퓨터공학");
		
		System.out.println(person);
		System.out.println(person.work());
		
		// 여기서부터 다운캐스팅
		Student student = (Student) person;
		
		System.out.println(student.grade);
		System.out.println(student.major);
	}
}
