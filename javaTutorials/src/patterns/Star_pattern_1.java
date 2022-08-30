package patterns;

import java.util.Scanner;

public class Star_pattern_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Limit: ");
		int Limit = sc.nextInt();
		int i,j;
		for(i=1; i<=Limit; i++) {
			for(j=1; j<=i; j++) {
			System.out.print('*');
		}
			System.out.println("");
		}
		
		for(i=Limit; i>=1; i--) {
			for(j=1; j<=i; j++) {
				System.out.print('*');
			}
			System.out.println("");
		}

	}

}
