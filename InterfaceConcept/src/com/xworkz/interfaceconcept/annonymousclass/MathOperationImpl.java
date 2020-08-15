package com.xworkz.interfaceconcept.annonymousclass;

public class MathOperationImpl implements MathOperation {

	@Override
	public int add(int a, int b) {
		int add = (a+b);
		System.out.println(add);
		return add;
	}

	@Override
	public int sub(int a, int b) {
		int sub = (a-b);
		System.out.println(sub);
		return sub;
	}
	
	
}
