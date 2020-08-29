package com.xworkz.collectionframeworks.assignments;

public class Student {

	String name;
	int age;
	int rollNo;
	String bloodGroup;
	
	public Student() {
		System.out.println("Default Constructor");
	}
	Student(String name, int age, int rollNo, String bloodGroup){
		this.name = name;
		this.age = age;
		this.rollNo = rollNo;
		this.bloodGroup = bloodGroup;
		//System.out.println("Name: "+name+" Age: "+age+" Roll num: "+rollNo+" Blood group: "+bloodGroup);
	}
}
