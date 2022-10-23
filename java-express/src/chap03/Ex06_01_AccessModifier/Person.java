package chap03.Ex06_01_AccessModifier;

public class Person {
	
	public String name;			// pulbic 접근 지정.  		Student 클래스에서 접근 가능
	protected int height;		// protected 접근 지정.  	Student 클래스에서 접근 가능
	int age;					// default 접근 지정. 		Student 클래스에서 접근 불가
	private int weight;			// private 접근 지정. 		Student 클래스에서 접근 불가
	
	
	public Person() {
		
	}


	public Person(String name, int height, int age, int weight) {
		this.name = name;
		this.height = height;
		this.age = age;
		this.weight = weight;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
}
