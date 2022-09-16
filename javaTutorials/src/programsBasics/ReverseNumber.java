package programsBasics;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int InputNumber;
		System.out.println("Enter the Inputnumber: ");
		InputNumber = sc.nextInt();

		int Rev = 0;
		
		while(InputNumber!=0) {
		Rev = Rev*10 + InputNumber%10;
		InputNumber = InputNumber/10;
		}
		System.out.println("After Reverse: " + Rev);
	}
}
