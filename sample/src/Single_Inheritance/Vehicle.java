package Single_Inheritance;

public class Vehicle {
	
	String color = "red";
	
	void display() {
		System.out.println(color);
	}

	public static void main(String[] args) {
		//Creating object for child class
		Bus b = new Bus();
		
		//printing the child class variable
		System.out.println(b.vehicle_no);
		
		//calling the parent class method by using child class object
		b.display();
	}
}
