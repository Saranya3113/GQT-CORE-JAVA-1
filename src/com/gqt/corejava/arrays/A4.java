package com.gqt.corejava.arrays;

import java.util.Scanner;
/**
 * @author Gowthami
 * @category Arrays
 * @description This is an example to perform array operations
 */
class ArrayOper3{
	Scanner sc=new Scanner(System.in);
	int arr[];
	int n;
	int count;
	int temp[];
	int result[];
	//method to create an array
	void createArray(){
		System.out.println("Enter the array size:");
		n=sc.nextInt();
		//create an array
		arr=new int[n];
		temp = new int[n];
		result=new int[count];
	}
	+

	//method to collect the elements of an array
	void collectData() {

		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the elements of an array: ");
			arr[i]=sc.nextInt();
		}
	}


	//method to duplicate
	void duplicate()
	{

		int count = 0;

		for (int i = 0; i < n; i++) {
			boolean isDuplicate = false;    //1 1 2 3 

			// Check if array[i] is already in temp
			for (int j = 0; j < count; j++) {
				if (arr[i] == temp[j]) {
					isDuplicate = true;
					break;
				}
			}

			// If not duplicate, add to temp array
			if (!isDuplicate) {
				temp[count] = arr[i];
				count++;
			}
		}

		// Create the final array of correct size
		result = new int[count];
		System.out.println("The final array is: ");
		for (int i = 0; i < count; i++) {
			result[i] = temp[i];

			System.out.print(result[i]+" ");
		}
	}
}

public class A4 {

	/**
	 * @param args
	 * @description This contains the structured code  to get the sum of all the elements in an array
	 */
	public static void main(String[] args) {
		ArrayOper3 o= new ArrayOper3();
		o.createArray();
		o.collectData();
		o.duplicate();
	}
}

