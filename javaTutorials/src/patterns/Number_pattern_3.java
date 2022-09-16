package patterns;

import java.util.Scanner;

public class Number_pattern_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Row size: ");
		int limit = sc.nextInt();
		
		int i,j,k;
		for(i=1; i<=limit; i++) {
			for(k=limit-i; k>=0; k--) {
				System.out.print("   ");
			}
			for(j=i; j<=i+i-1; j++) {
				if(j<10) {
					System.out.print(j+ "  ");
				}else {
					System.out.print(j+ " ");
				}
			}
			for(j=i+i-2; j>=i; j--) {
				if(j<10) {
					System.out.print(j+ "  ");
				}else {
					System.out.print(j+ " ");
				}
				
			}
			System.out.println("");
		}
	}
}
