package Multilevel_Inheritance;

class veg extends food{
	
	void ready() {
		System.out.println("your bill is 100 rupees only ");
	}
}

class non_veg extends veg{		
	
	void nonVeg() {
		System.out.println("your bill is 140 rupees only ");
	}
}

public class food {
	
	String type = "veg briyani";
	int count = 2;
	
	public void type() {
		
		System.out.println("You ordered " + count + " "+ type);
	}

	//class result{
	public static void main(String[] args) {

		non_veg B = new non_veg();
		B.type();
		if(B.type=="veg briyani") {
			B.ready();
		}else if(B.type=="chicken briyani"){
			B.nonVeg();
		}else {
			System.out.println("This item is not available");
		}
		//System.out.println(B.rice +" rice and " + B.masala + " masala added");
		
	}
	}
