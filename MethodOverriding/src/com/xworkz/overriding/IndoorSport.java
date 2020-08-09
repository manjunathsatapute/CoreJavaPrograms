package com.xworkz.overriding;

public class IndoorSport extends Sports {

	String name;
	int numOfPlayers;
	
	@Override
	void playing() {
		System.out.println("Playing indoor sports");
	}
	
}
