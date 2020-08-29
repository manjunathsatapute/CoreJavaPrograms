
public class Book {
	
	//constructor 
	//constructor overloading
	//this()
	//this keyword
	//constructor chaining
	//method overloading

	String name;
	int numOfPages;
	double price;
	String authorName;

	Book() {
		System.out.println("Default Const");
	}

	Book(String inName) {
		this();
		this.name = inName;
		String name = "manju";
		System.out.println("Name of book=" + this.name);
		System.out.println("Name of book=" + name);
		
	}
	
	Book(int numOfPages, String inName){
		this("Lekhak");
		this.numOfPages=numOfPages;
		System.out.println(this.numOfPages+" \n "+this.name);
	}
	
	void reading() {
		System.out.println("Thinking to read or not");
	}
	
	void reading(int numOfPages) {
		System.out.println("count the pages");
	}
	
	void reading(String authorName, double price ) {
		System.out.println("Auhtor Khurmi");
	}
}
