package com.xworkz.collectionframeworks;

public class JobTester {

	public static void main(String[] args) {

		Job j = new Job();
		j.companyName = "Infosys";
		j.salary = 20000;
		j.toString();	//it will not give o/p just returns it to print use sysout;
		
		System.out.println(j.toString());
		//it gives fully qualified class name since it is overridden it can't give FQCN
		
	}
}
