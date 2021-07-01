package com.practiceex.oop.person;

public class Student extends Person {
	//필드
	String schoolName;
	//생성자
	Student(String name, int age, String schoolName){
		super(name, age);
		this.schoolName = schoolName;
	}
	
	//getter setter
	
	public void showInfo() {
		
	}
}
