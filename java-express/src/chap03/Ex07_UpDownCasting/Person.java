package chap03.Ex07_UpDownCasting;

public class Person {

	String name;
	int age;
	
	public Person() {
		this.name = "(�̸� ����)";
		this.age = 0;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String work() {
		return "���� �մϴ�";
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
