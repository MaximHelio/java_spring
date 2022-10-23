package chap03.Ex06_02_AccessModifier;

import chap03.Ex06_01_AccessModifier.Person;

public class Student extends Person{

	public Student() {
		super();
	}

	// Ctrl + shift + s => 전체저장
	public Student(String name, int height, int age, int weight) {
		super(name, height, age, weight);
	}
	
	public void defaultSetting() {
		name= "이름없음"; 
		height = 175;	// protected는 같은 패키지 + 다른 패키지면 상속받았을 때
		
//		age = 20;
//		weight = 60;
		
		setAge(20);
		setWeight(60);
	}
	
	
	
	
}
