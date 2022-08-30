package programsBasics;

import java.util.Scanner;

public class NoOfDigitsInNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		
		int count = 0;
		
		while(num>0) {
			
			num = num/10;
			count++;
			
		}
		System.out.println("Number of Digits: " + count);
	}
}
