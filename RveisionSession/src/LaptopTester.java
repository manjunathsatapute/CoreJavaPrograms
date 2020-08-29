
public class LaptopTester {

	public static void main(String[] args) {

		Laptop dell = new Laptop();
		
		dell.start();
		dell.stop();
		dell.install();
		dell.brand = "Dell";
		
		Laptop hp = new Device();	//upcasting
		hp.start();
		hp.install();
		hp.stop();
		//hp.boot();
		
		Device lenovo = new Device();
		lenovo.boot();
		
		Device acer = (Device)hp; 	//downcasting
		
		acer.start();
		acer.install();
		acer.boot();
		acer.stop();
	}

	
}
