package TestGlobalLogic;

import java.util.Arrays;
import java.util.Scanner;

public class ClosestToZero {

	public static void main(String[] args) {
// Get array size from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of array: ");
		int sizeOfArray = sc.nextInt();
		
// Get Elements of array from user
		System.out.println("Enter the Elements: ");
		int inputArray[] = new int[sizeOfArray];
		for(int i=0; i<sizeOfArray; i++) {
			inputArray[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(inputArray));
		
//sort the array
		Arrays.sort(inputArray);
		
// result 
		int result = getClosestToZero(inputArray);
		System.out.println("Closest to Zero is ------> " + result );
	}
		
// getClosestToZero Method
		public static int getClosestToZero(int []a) {
			int currentValue = 0;
			int closestValue = a[0];
			for(int i=0; i<a.length; i++) {
				currentValue = a[i] * a[i];
				if(currentValue<=(closestValue * closestValue)) {
					closestValue = a[i];
				}
			}
			return closestValue;
		}

	}
