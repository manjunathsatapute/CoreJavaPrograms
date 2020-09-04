
public class ExceptionPropogationExample {

	void division(int a, int b)  {
		int div = a/b;
		System.out.println(div);	
	}
	
	void operation()  {
		division(2 ,0);	
	}
	
	void operationTwo(){
		try {
			operation();
		}
		catch (ArithmeticException e) {
			System.out.println("Exception Handled: "+e);
		}
	}
}
