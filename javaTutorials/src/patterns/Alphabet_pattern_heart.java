package patterns;

import java.util.Scanner;

public class Alphabet_pattern_heart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Limit: ");
		int limit = sc.nextInt();
		
		int i,j,x,y,z;
		char k;
		z = limit-3;
		System.out.print(" ");
		for(k='A'; k<'A'+z; k++) {
			System.out.print(k);
		}
		System.out.print("   ");
		for(k='A'; k<'A'+z; k++) {
			System.out.print(k);
		}
		System.out.println();
		y = limit-1;
		for(k='A'; k<'A'+y; k++) {
			System.out.print(k);
		}
		System.out.print(" ");
		for(k='A'; k<'A'+y; k++) {
			System.out.print(k);
		}
		System.out.println();
		for(i=0; i<limit; i++) {
			x = (limit-i)+(limit-i-1);
			for(j=0; j<=i-1; j++) {
				System.out.print(" ");
			}
			for(k='A'; k<'A'+x; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
