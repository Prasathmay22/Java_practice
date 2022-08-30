package string_programs;

import java.util.Scanner;

public class Replace_vowels {

	public static void main(String[] args) {
// Getting input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s1 = sc.next();
		
// convert String to Array
		char [] arrayString = s1.toCharArray();
		
/*read the array
		for(int i=0; i<arrayString.length; i++) {
			System.out.print(arrayString[i]);
		}
		*/
		
// logic
		for(int i=0; i<arrayString.length; i++) {
			if(arrayString[i]=='a' || arrayString[i]=='e' ||arrayString[i]=='i' ||arrayString[i]=='o' || arrayString[i]=='u') {
				arrayString[i] = '*';
			}
			System.out.print(arrayString[i]);
		}
	}
}
