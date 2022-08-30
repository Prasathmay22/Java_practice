package programsBasics;

import java.util.Scanner;

public class CountEvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbers: ");
		int num = sc.nextInt();
		
		// print no digits
		int countEven = 0;
		int countOdd = 0;
		
	    while(num>0) {
			
			int result = num%10;
			if(result%2==0) {
				countEven++;
			}else {
				countOdd++;
			}
			num = num/10;
		}
		System.out.println("Number of Even Digits: " + countEven);
		System.out.println("Number of Odd Digits: " + countOdd);
		}
}
