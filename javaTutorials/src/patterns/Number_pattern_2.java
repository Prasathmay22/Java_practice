package patterns;

import java.util.Scanner;

public class Number_pattern_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Limit: ");
		int limit = sc.nextInt();
		
		int i,j;
		for(i=1; i<=limit; i++) {
			for(j=limit; j>0; j--) {
				if(i!=j){
					System.out.print(j+ " ");
				}else {
					System.out.print("* ");
				}
			}
			System.out.println("");
		}
	}
}
