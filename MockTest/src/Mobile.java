
public class Mobile {

	String name;
	int price;
	String color;
	
	Mobile(){
		System.out.println("Default Constructor");
	}
	static void charging() {
		System.out.println("charging");
	}
}

class Samsung extends Mobile {
	 
	public Samsung() {
		System.out.println("Samsung Constructor");
	}
}

