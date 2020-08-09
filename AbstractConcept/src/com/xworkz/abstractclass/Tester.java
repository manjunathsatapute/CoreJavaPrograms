package com.xworkz.abstractclass;

public class Tester {

	public static void main(String[] args) {

		Lift lift =new SchinderLift();	//upcasting
		lift.firstFloor();
		lift.secondFloor();
		lift.stopTheLift();
		lift.pressAlarm();
		
		Lift lift1 = new XLift();
		lift1.firstFloor();
		lift1.secondFloor();
		lift1.stopTheLift();
		lift1.pressAlarm();
		
	}

}
