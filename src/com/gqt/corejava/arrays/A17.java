package com.gqt.corejava.arrays;

import java.util.Scanner;
/**
 * @author Gowthami
 * @category Arrays
 * @description This is an example to perform array operations
 */
class ArrayOper17{
	Scanner sc=new Scanner(System.in);
	int arr[][];
	int n;

	//method to create an array
	void createArray(){
		System.out.println("Ener the row count: ");
		int row=sc.nextInt();
		System.out.println("Ener the cols count: ");
		int col=sc.nextInt();
		arr=new int[row][col];
		System.out.println("Array Created");
		System.out.println("---------------");	
	}



	//method to collect the elements of an array
	void collectData() {

		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside col no: " +(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the value "+(j+1));
				arr[i][j]=sc.nextInt(); 
			}

		}
		System.out.println("Data is stored in an array");
		System.out.println("---------------");	

	}
	void displayMatrix()
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.print("\n");
		}
	}


	void spiral()
	{
		int top = 0;
		int bottom = arr.length - 1;
		int left = 0;
		int right = arr[0].length - 1;

		System.out.println("Spiral order of the matrix is:");
		while (top <= bottom && left <= right) {
			// Print top row
			for (int i = left; i <= right; i++) {
				System.out.print(arr[top][i] + " ");
			}
			top++;

			// Print right column
			for (int i = top; i <= bottom; i++) {
				System.out.print(arr[i][right] + " ");
			}
			right--;

			// Print bottom row if any
			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					System.out.print(arr[bottom][i] + " ");
				} }
			bottom--;
		}

		// Print left column if any
		if (left <= right) {
			for (int i = bottom; i >= top; i--) {
				System.out.print(arr[i][left] + " ");
			}
			left++;
		}
	}


}



public class A17 {

	/**
	 * @param args
	 * @description This contains the structured code  to get the sum of all the elements in an array
	 */
	public static void main(String[] args) {
		ArrayOper17 o= new ArrayOper17();
		o.createArray();
		o.collectData();
		o.displayMatrix();
		o.spiral();
	}

}

