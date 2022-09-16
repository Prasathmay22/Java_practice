package programsBasics;

import java.util.Scanner;

public class PrimeNumber2 {

	public static void main(String[] args) {
		int inputNumber;
		System.out.println("Enter the Inputnumber ");
		Scanner sc = new Scanner(System.in);
		inputNumber = sc.nextInt();
		
		int i,flat = 1;
		
		for(i=2; i<inputNumber; i++) {
			
			if(inputNumber%i==0) {
				flat = 0;
				break;
			}
		}
		if(flat == 0) {
			System.out.println(inputNumber +" is not Primenumber");
		}else {
			System.out.println(inputNumber +" is Primenumber");
		}

	}

}
