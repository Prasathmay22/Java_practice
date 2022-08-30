package array_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfElements {

	public static void main(String[] args) {
	
// Get array length from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array length: ");
		int l = sc.nextInt();
		
// array declaration
		int[] arr = new int[l];
// Get array elements from user
		for(int i=0; i<l; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Input Array: " + Arrays.toString(arr));
//sum of elements
		int sum = 0;
		for(int i=0; i<l; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum of elements in an Array: " + sum);
	}

}
