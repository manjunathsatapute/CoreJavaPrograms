package com.xworkz.overriding;

public class Chess extends IndoorSport {

	String name;
	int numOfPlayers;
	
	@Override
	void playing() {
		System.out.println("Playing chess");
	}
	
	@Override
	void tie() {
		System.out.println("match is tied between two players");
	}
	
}
