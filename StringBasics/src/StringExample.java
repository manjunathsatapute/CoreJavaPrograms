
public class StringExample {
//string is a sequence of characters and non-primitive datatype.
	public static void main(String[] args) {

		String name = "Manju"; // String literals
		String msg = new String("welcome"); // using new keyword

		System.out.println("The name is " + name);
		System.out.println("The msg is " + msg);

		int namelength = name.length();
		System.out.println("Length of name is " + namelength);

		String capsName = name.toUpperCase();
		System.out.println("Name in capital letters : " + capsName);

		String smallName = name.toLowerCase();
		System.out.println("Name in small letters : " + smallName);
		
		String s1 = "A";
		String s2 = "B";
		String s3 = "C";
		
		System.out.println("Comparison of string from lower to higher i.e. A to B gives: "+s1.compareTo(s2));
		System.out.println("Comparison of string from higher to lower i.e. C to B gives: "+s3.compareTo(s2));
		System.out.println("Comparison of same string i.e. C to C gives: "+s3.compareTo(s3));
	}
}