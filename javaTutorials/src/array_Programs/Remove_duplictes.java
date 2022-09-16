package array_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Remove_duplictes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array size: ");
		int l = sc.nextInt();
		
		int[] a = new int[l];
		
		for(int i=0; i<l; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Input array: " + Arrays.toString(a));
		
		boolean flag = false;
		System.out.print("Duplicate elements are: ");
		for(int i=0; i<l-1; i++) {
			for(int j=i+1; j<l; j++) {
				if(a[i]==a[j]) {
					System.out.print(a[i] + " ");
					flag = true;
				}
			}
		}
		if(flag == false) {
			System.out.print("not found");
		}
		

	}

}
