package programsBasics;

import java.util.Scanner;

public class PlusOrMinus {

	public static void main(String[] args) {
		
		int Inputnumber;
		System.out.println("Enter the Inputnumber: ");
		Scanner sc = new Scanner(System.in);
		Inputnumber = sc.nextInt();
		
		if(Inputnumber<0) {
			System.out.println("The number is Negative");
		}else {
			System.out.println("The number is Positive");
		}
	}
}
