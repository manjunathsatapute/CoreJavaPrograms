package com.xworkz.abstractx;

public class Tester {

	public static void main(String[] args) {

		//Sports.tournament = "Sports Ministry of India";	//error, can't change final */

		System.out.println("Tournament name: "+Sports.tournament);
		Sports s = new Meeting();
		s.committeeMeeting();
		s.toss();
		s.play();
		s.xyz();
		Sports.result();
		
		System.out.println("Main method ended...");
	
	}

}
