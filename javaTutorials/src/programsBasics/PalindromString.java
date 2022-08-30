package programsBasics;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.next();
		
		String org_str = str;
		
		String rev = "";
		
		int length = str.length();
		
		for(int i=length-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		
		if(org_str.equals(rev)) {
			System.out.println(str + " is Palindrom String");
		}else {
			System.out.println(str + " is not Palindrom String");
		}

	}

}
