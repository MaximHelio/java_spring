package chap03.Ex07_UpDownCasting;

public class UpCasting {

	public static void main(String[] args) {
		// ��ĳ����(�ڽ�->�θ�)
		// ��ĳ���� �ÿ��� �º��� ������ ���󰡰�, �޼���� �������ε��� �ż� �캯�� �ڽĿ� �ִ� �޼��尡 ������ �ȴ�.
		Person person = new Student("�˷���", 20, 1, "��ǻ�Ͱ���");
		
		System.out.println(person);		// �θ��� ������ ȣ���
		System.out.println(person.work());	// �������ε� �ż� �ڽ��� �޼��尡 ȣ���
		
//		System.out.println(person.grade);
//		System.out.println(person.major);
		
	}
}
