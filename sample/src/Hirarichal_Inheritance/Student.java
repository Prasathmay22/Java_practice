package Hirarichal_Inheritance;

public class Student {
	String schoolName = "SRV";
	
	void display() {
		System.out.println("Welcome to " + schoolName);
	}
	
	//common functionalities
	void calculateTotal(int std, int maths, int science){
		int total = maths + science;
		System.out.println(std+ "th std total:" + total);
	}
	
	public static void main(String[] args) {
		
	}
	
}
