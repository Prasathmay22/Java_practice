package patterns;

import java.util.Scanner;

public class Number_pattern_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Limit: ");
		int Limit = sc.nextInt();
		
		int i,k,l;
		
		for(k=1; k<=Limit; k++) {
			for(l=Limit-1; l>=k; l--) {
				System.out.print(" ");
			}
			for(i=1; i<=k; i++) {
				System.out.print(i);
			}
			for(i=k-1; i>0; i--) {
				System.out.print(i);
			}
		System.out.println("");
		}
	}
}
