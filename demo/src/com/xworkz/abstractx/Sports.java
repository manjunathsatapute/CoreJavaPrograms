package com.xworkz.abstractx;

public interface Sports {

	String tournament= "commonwealthgames";	
	//by default data members will assign both static & final

	abstract void toss();	       //abstract is optional
	void play();	      		//abstract keyword is optional
	void committeeMeeting();	//by default the access modifier is public
	static void result(){
		System.out.println("won...");
	}
	default void xyz(){
		System.out.println("xyz...");
	}
}
