package com.xworkz.interfaceconcept.annonymousclass;

public class MathOperationTester {

	public static void main(String[] args) {
		
		MathOperation math = new MathOperationImpl();

		MathOperation math1 = new MathOperation() {
			
			@Override
			public int add(int a, int b) {
				int add = (a+b+5);
				System.out.println(add);
				return add;
			}
			
			@Override
			public int sub(int a, int b) {
				int sub = (a+b-5);
				System.out.println(sub);
				return sub;
			}
		};
		math1.add(2, 4);
		math1.sub(5, 3);
		
		MathOperation math2 = new MathOperation() {
			
			@Override
			public int add(int a, int b) {
				int add = (a+b+10);
				System.out.println(add);
				return add;
			}
			
			@Override
			public int sub(int a, int b) {
				int sub = (a+b-10);
				System.out.println(sub);
				return sub;
			}
		};
		math2.add(2, 4);
		math2.sub(5, 3);
	}

}
