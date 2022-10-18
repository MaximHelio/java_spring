package chap03.Ex05_StaticMember;

public class SingleTone {

	// ��κ��� ��ü�� private���� ��
	// getInstance()������ ���� ���� ���ؼ�
	private static SingleTone instance = new SingleTone();
	private SingleTone() {		
	}
	
	public static SingleTone getInstacne() {
		if( instance == null) {
			instance = new SingleTone();
		}
		return instance;
	}
}
