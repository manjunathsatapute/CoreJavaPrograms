package com.xworkz.interfaceconcept;

public class InternetTester {

	public static void main(String[] args) {

//		cannot instantiate the interface class as it has 100% abstract methods
//		InternetProvider IP = new InternetProvider();

		AirtelInternetProvider AIP = new AirtelInternetProvider(); // instance of AirtelInternetProvider
		AIP.connectivityType();
		AirtelBroadBandIP ABIP = new AirtelBroadBandIP(); // instance of AirtelBroadbandIP
		ABIP.transmittingSpeed();
		System.out.println();

		InternetProvider IP = new AirtelInternetProvider(); // upcasting
		IP.connectivityType();
		IP.transmittingSpeed();
		System.out.println(InternetProvider.a); // or System.out.println(IP.a);
		System.out.println();

		AirtelInternetProvider AIP1 = new AirtelBroadBandIP(); // upcasting
		AIP1.connectivityType();
		AIP1.transmittingSpeed();
		System.out.println(AirtelInternetProvider.a); // or System.out.println(AIP1.a);
	}
}
