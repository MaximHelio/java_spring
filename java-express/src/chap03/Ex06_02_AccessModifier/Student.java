package chap03.Ex06_02_AccessModifier;

import chap03.Ex06_01_AccessModifier.Person;

public class Student extends Person{

	public Student() {
		super();
	}

	// Ctrl + shift + s => ��ü����
	public Student(String name, int height, int age, int weight) {
		super(name, height, age, weight);
	}
	
	public void defaultSetting() {
		name= "�̸�����"; 
		height = 175;	// protected�� ���� ��Ű�� + �ٸ� ��Ű���� ��ӹ޾��� ��
		
//		age = 20;
//		weight = 60;
		
		setAge(20);
		setWeight(60);
	}
	
	
	
	
}
