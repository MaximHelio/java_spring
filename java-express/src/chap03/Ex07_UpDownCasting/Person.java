package chap03.Ex07_UpDownCasting;

public class Person {

	String name;
	int age;
	
	public Person() {
		this.name = "(이름 없음)";
		this.age = 0;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String work() {
		return "일을 합니다";
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
