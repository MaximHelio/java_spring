package chap03.Ex07_UpDownCasting;


class ItPerson {}
class Planner extends ItPerson {}
class Designer extends ItPerson {}
class Developer extends ItPerson {}

public class Instanceof {
	
	public static void checkInstance(ItPerson itPerson) {
		if(itPerson instanceof Planner) {
			System.out.println("��ȹ���Դϴ�");
		}
		if(itPerson instanceof Planner) {
			System.out.println("�����̳��Դϴ�");
		}
		if(itPerson instanceof Planner) {
			System.out.println("�������Դϴ�");
		}
		
	} 
	
	public static void main(String[] args) {
		System.out.println("� ������ �ϰ� ��ó���?");
		checkInstance(new Planner());
		checkInstance(new Designer());
		checkInstance(new Developer());
		
	}
}
