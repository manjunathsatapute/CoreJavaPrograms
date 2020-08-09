package com.xworkz.interfaceconcept;

public class AirtelInternetProvider implements InternetProvider {

	@Override
	public void transmittingSpeed() {
		System.out.println("The max transmitting speed is 16mbps");
	}

	@Override
	public void connectivityType() {
		System.out.println("Connectivity type used is Fibrenet");
	}
}
