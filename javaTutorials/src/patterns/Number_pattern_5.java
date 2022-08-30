package patterns;

import java.util.Scanner;

public class Number_pattern_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Limit: ");
		int limit = sc.nextInt();
		
		int i,j,k;
		for(i=1; i<=limit; i++) {
			System.out.print("1 ");
		}
		System.out.println();
		for(i=1; i<=limit-2; i++) {
			System.out.print("1 ");
				for(k=1; k<=limit-2; k++) {
					System.out.print("  ");
				}
				System.out.print("1");
				System.out.println();
			}
		for(i=1; i<=limit; i++) {
			System.out.print("1 ");
		}
		}
	}

