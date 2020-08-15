package com.xworkz.overriding.assignment;

public class Tester {

	public static void main(String[] args) {

		System.out.println("Main Method Started"+"\n");
		
		Child child1 = new Child();	//instance of child class
		GrandSon grandson1 = new GrandSon();	//grandson object
		
		Parent child = new Child();	//upcasting
//		child.gender = "Male";
//		child.age = 25;
		System.out.println("Gender of child: "+child.gender+"\n"+"Age of child: "+child.age);
		child.toEducate();
		child.toProtect();
		
		System.out.println();
		
		Child grandson = new GrandSon();	//instance of grandson
//		grandson.gender = "Male";
//		grandson.age = 10;
		System.out.println("Gender of grandson: "+grandson.gender+"\n"+"Age of grandson: "+grandson.age);
		grandson.toEducate();
		grandson.toProtect();
		grandson.toLearnGoodHabbits();
		
		System.out.println("Main Method Ended");
	}

}
