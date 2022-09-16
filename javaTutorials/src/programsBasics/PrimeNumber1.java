package programsBasics;

import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args) {
		
		int count;
		System.out.println("Enter the Range: ");
		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();
		System.out.println("The Prime numbers are: ");
		
		int i,j,flag=1;
		for(i=2; i<=count; i++) {
			
			for(j=2; j<i;j++){
				flag = 1;
				
				if(i%j==0) {
					flag = 0;
					break;
				}
			}
			if(flag==1) {
				System.out.print(" " + i);
			}
		}
	}
}
