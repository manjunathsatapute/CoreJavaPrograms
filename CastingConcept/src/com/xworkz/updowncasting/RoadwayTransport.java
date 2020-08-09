package com.xworkz.updowncasting;

public class RoadwayTransport extends Transport {

	int a;
	int b;
	
	@Override
	void travelling() {
		System.out.println("Travelling by road");
	}
	
	void road() {
		System.out.println("Requires road");
	}
}
