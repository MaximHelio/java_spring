package chap03.Ex07_UpDownCasting;

public class Student extends Person {

	int grade;
	String major;
	
	
	public Student() {
		this("(�̸�����)", 0, 0, "(����)");
	}

	public Student(String name, int age, int grade, String major) {
		super(name, age);
		this.grade = grade;
		this.major = major;
	}

	@Override
	public String work() {
		return "���θ� �մϴ�";
	}

	@Override
	public String toString() {
		return "Student [grade=" + grade + ", major=" + major + ", name=" + name + ", age=" + age + "]";
	}

	
}
