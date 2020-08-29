package com.xworkz.collectionframeworks.assignments;

import java.util.ArrayList;

public class StudentObject {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<Student>();
		Student s = new Student();
		Student s1 = new Student("Manju", 28, 1, "O+ve");
		Student s2 = new Student("Jaggu", 29, 2, null);
		Student s3 = new Student("Srikar", 29, 3, null);

		System.out.println("Name: "+s1.name+" Age: "+s1.age+" Roll num: "+s1.rollNo+" Blood group: "+s1.bloodGroup);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s);
		System.out.println(al);
		
		//traversing using for each loop
		for(Student st : al) {
			System.out.println("Name: "+st.name+" Age: "+st.age+" Roll num: "+st.rollNo+" Blood group: "+st.bloodGroup);
		}
		
		//using for loop
		for(int i = 0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
	}

}
