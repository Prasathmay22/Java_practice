package patterns;

import java.util.Scanner;

public class Number_pattern_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Limit: ");
		int limit = sc.nextInt();
		
		int i,j,k,x;
		for(i=1; i<=limit; i++) {
			x= (limit-i)+(limit-i-1);
			for(j=0; j<i-1; j++) {
				System.out.print(" ");
			}
			System.out.print(i);
			for(k=x; k>0; k--) {
				System.out.print(" ");
			}
			if(i!=limit) {
			System.out.print(i);
			}
			System.out.println();
		}
		for(i=limit-1; i>0; i--) {
			x= (limit-i)+(limit-i-1);
			for(j=i-1; j>0; j--) {
				System.out.print(" ");
			}
			System.out.print(i);
			for(k=x; k>0; k--) {
				System.out.print(" ");
			}
			System.out.print(i);
			System.out.println();
		}
	}
}
