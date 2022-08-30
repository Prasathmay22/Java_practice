package programsBasics;

import java.util.Scanner;

public class factorial1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		int org_num = num;
		
		int i, fact = 1;
		for(i=num; i>0; i--) {
			fact = fact*i;		// 4  4*3=12  12*2=24  24*1=24 
		}
		System.out.println("Factorial of " + org_num + ": " + fact);
	}
}
