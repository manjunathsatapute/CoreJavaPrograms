
public class ExceptionPropogationTester {

	public static void main(String[] args) {

		System.out.println("Main Method Started");
		ExceptionPropogationExample oprn = new ExceptionPropogationExample() ;
		
		oprn.operationTwo();
		
		System.out.println("Main Method Ended");
	}
}
