package com.xworkz.interfaceconcept.functionalinterface;

public class MathOpsTester {

	public static void main(String[] args) {
		
		
		MathOps addition = (a, b) -> a+b;
			//System.out.println("sum: "+(a+b));
			
		
		MathOps sub = (a, b) -> {
			//System.out.println("diff: "+(a-b));
			return a-b;
		};
		
		MathOps prod = (a, b) -> {
			//System.out.println("prod: "+(a*b));
			return a*b;
		};
		
		MathOps division = (a, b) -> {
			//System.out.println("div: "+(a/b));
			return a/b;
		};
		
		/*
		 * addition.ops(20, 10); 
		 * sub.ops(10, 10); 
		 * prod.ops(1, 10); 
		 * division.ops(30, 10);
		 */
		System.out.println("sum: "+addition.ops(20, 10)+"\n"+"diff: "+sub.ops(10, 10)+"\n"+
							"prod: "+prod.ops(1, 10)+"\n"+"div: "+division.ops(30, 10));
	}

}
