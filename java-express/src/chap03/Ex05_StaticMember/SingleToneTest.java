package chap03.Ex05_StaticMember;

public class SingleToneTest {

	public static void main(String[] args) {
		SingleTone st01 = SingleTone.getInstacne();
		SingleTone st02 = SingleTone.getInstacne();
		
		System.out.println(st01 == st02);
		
	}
}
