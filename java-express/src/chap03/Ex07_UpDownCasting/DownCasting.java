package chap03.Ex07_UpDownCasting;

public class DownCasting {

	public static void main(String[] args) {

		// ��ĳ���� ���� -> �ٿ�ĳ������ ��������
		Person person = new Student("�˷���", 20, 1, "��ǻ�Ͱ���");
		
		System.out.println(person);
		System.out.println(person.work());
		
		// ���⼭���� �ٿ�ĳ����
		Student student = (Student) person;
		
		System.out.println(student.grade);
		System.out.println(student.major);
	}
}
