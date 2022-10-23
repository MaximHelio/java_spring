package chap03.Ex06_02_AccessModifier;

public class Manager {

	public static void main(String[] args) {
		Student student = new Student();
		student.defaultSetting();
		
		System.out.println("name: " + student.name);	 // name만 퍼블릭. 프로젝트 전체에서 접근이 가능
//		student.height; 	//student가 person을 상속받았어도, person에서 최초에 height를 정의했으므로 거길 바라봄 
		System.out.println("height: " + student.getHeight());
		System.out.println("weight: " + student.getWeight());
		System.out.println("age: " + student.getAge());
		
	}
}
