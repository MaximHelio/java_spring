package chap03.Ex05_StaticMember;

public class SingleTone {

	// 대부분의 객체는 private으로 걺
	// getInstance()만으로 갖고 오기 위해서
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
