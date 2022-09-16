package programs;

public class factorial {
	
	int factNumber = 1;
	
	
	public factorial(int i) {
		int inputNumber = i;
		for(i=inputNumber; i>=1; i--){
			
			factNumber = factNumber*i;

		}
		System.out.println("factorial of " + inputNumber + " is " + factNumber );

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorial fact = new factorial(4);		
		}
}
