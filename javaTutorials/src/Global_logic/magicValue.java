package Global_logic;

import java.util.Arrays;
import java.util.Scanner;

public class magicValue {

	public static void main(String[] args) {
//		Getting input from User
		System.out.println("Enter the Array size: ");
		Scanner s = new Scanner(System.in);	
		int sizeOfArray = s.nextInt();
		
//		Getting array size from user
		int inputArr[], sortedArray[];		
		inputArr = new int[sizeOfArray];
		sortedArray = new int[sizeOfArray];
		int sumOfGoodNumbers=0, sumOfBadNumbers=0, magicValue;
		System.out.println("Array Size: " + sizeOfArray);
		
//		Getting Array values from User
		for(int i=0; i<sizeOfArray; i++) {
			inputArr[i] = s.nextInt();
		}
		
//		Copying from original array to sorted array
		System.arraycopy(inputArr, 0, sortedArray, 0, sizeOfArray);
		
//		Sorting the array
		Arrays.sort(sortedArray);
		
//		Calculating sum of good numbers and sum of bad numbers
		for(int i=0; i<sizeOfArray; i++) {
			if(inputArr[i] == sortedArray[i]) {
				sumOfGoodNumbers = sumOfGoodNumbers + inputArr[i];
			}
			else {
				sumOfBadNumbers = sumOfBadNumbers + inputArr[i];
			}
		}
		
//		Calculating the difference between sum of good numbers and sum of bad numbers
		magicValue = sumOfGoodNumbers - sumOfBadNumbers;
		System.out.println("Magic Value is: " + magicValue);
	}
	

}
