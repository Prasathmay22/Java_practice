package programsBasics;

import java.util.Scanner;

public class NumberOfDigitsInString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Word: ");
		String word = sc.next();
		
		int count = word.length();
		System.out.println("Number of Digits: " + count);

	}

}
