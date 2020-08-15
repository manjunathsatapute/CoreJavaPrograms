package com.xworkz.abstractx;

abstract class IndoorSports implements Sports{
	String stadiumName;

	public void toss(){
	//normally if methods don't have any specifiers then default/package will be assigned
		System.out.println("Toss Happening...");
	}

	public void play(){
	//methods visibility can't be decreased bcoz in interfaces methods are implicitly public
		System.out.println("Game started...");
	}

	 public abstract void committeeMeeting();
	
}

class Meeting extends IndoorSports{
		public void committeeMeeting(){
		System.out.println("Preparations/strategies for the game...");
	}
}