package chap03.Ex06_02_AccessModifier;

public class Manager {

	public static void main(String[] args) {
		Student student = new Student();
		student.defaultSetting();
		
		System.out.println("name: " + student.name);	 // name�� �ۺ�. ������Ʈ ��ü���� ������ ����
//		student.height; 	//student�� person�� ��ӹ޾Ҿ, person���� ���ʿ� height�� ���������Ƿ� �ű� �ٶ� 
		System.out.println("height: " + student.getHeight());
		System.out.println("weight: " + student.getWeight());
		System.out.println("age: " + student.getAge());
		
	}
}
