package programsBasics;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		
		int result = num;
		
		int rev = 0;
		
		while(num!=0) {
		rev = rev*10 + num%10;
		num = num/10;
		}
		System.out.println(rev);
		if(result==rev) {
			System.out.println("This Number is palindrom");
		}else {
			System.out.println("This Number is not palindrom");
		}
	}

}
