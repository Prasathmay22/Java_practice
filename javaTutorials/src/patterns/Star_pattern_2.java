package patterns;

import java.util.Scanner;

public class Star_pattern_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Limit: ");
		int Limit = sc.nextInt();
		int i,j,k;
		
		for(i=1; i<=Limit; i++) {
			for(k=Limit-1; k>=i; k--) {
				System.out.print(" ");
			}
			for(j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

	}

}
             
 
