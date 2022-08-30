package practice_aug;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int Rev = 0;
		while(number!=0) {
			Rev = Rev*10 + number%10;
			number = number/10;
		}
		System.out.println("After reverse: " + Rev);
	}
}
