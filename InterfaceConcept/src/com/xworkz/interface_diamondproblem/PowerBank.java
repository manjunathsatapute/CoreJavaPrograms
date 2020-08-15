package com.xworkz.interface_diamondproblem;

public class PowerBank implements MicromaxPowerBank, SamsungPowerBank {

	@Override
	public void toCharge() {
		System.out.println("The powerbanks are used for charging");
	}

	@Override
	public void portable() {
		System.out.println("The powerbanks are portable device");
	}
	
}
