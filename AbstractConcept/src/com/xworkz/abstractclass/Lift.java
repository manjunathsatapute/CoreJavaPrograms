package com.xworkz.abstractclass;

public abstract class Lift {

	abstract void firstFloor();

	abstract void secondFloor();

	void stopTheLift() {
		System.out.println("Stop the lift");
	}

	void pressAlarm() {
		System.out.println("During emergency press alarm");
	}

}
