package com.practiceex.oop.person;

public class Person {
	//필드
	String name;
	int age;
	//생성자
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	// getter setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	// 메서드
	public void showInfo(){
		
	}
}
