package patterns;

import java.util.Scanner;

public class Alphabet_pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Limit: ");
		int Limit = sc.nextInt();
		
		int i,l;
		char j,k;
		
		for(i=0; i<Limit; i++) {
			for(l=Limit-1; l>=i; l--) {
				System.out.print(" ");
			}
			for(j='A'; j<'A'+i; j++) {				
				System.out.print(j);
			}
			for(k=(char) ('A'+i); k>='A'; k--) {
				System.out.print(k);
			}
			System.out.println("");
		}
	}

}
