package com.gqt.corejava.arrays;

import java.util.Scanner;
/**
 * @author Gowthami
 * @category Arrays
 * @description This is an example to perform array operations
 */
class ArrayOper21{
	Scanner sc=new Scanner(System.in);
	int arr[][];
	int n;
	int sum;
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
	void rowSum()
	{
		System.out.println("Sum of each row: ");
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=0;j<arr[i].length;j++)
			{
				sum+=arr[i][j];
			}
			System.out.println("row" +(i+1)+" sum: "+sum);
		}
	}



	void colSum()
	{
		System.out.println("Sum of each col: ");
		int cols=arr[0].length;
		for(int j=0;j<cols;j++)
		{
			int sum=0;
			for(int i=0;i<arr.length;i++)
			{
				sum+=arr[i][j];
			}
			System.out.println("col" +(j+1)+" sum: "+sum);
		}
	}

}



public class A21 {

	/**
	 * @param args
	 * @description This contains the structured code  to get the sum of all the elements in an array
	 */
	public static void main(String[] args) {
		ArrayOper21 o= new ArrayOper21();
		o.createArray();
		o.collectData();
		o.rowSum();
		o.colSum();

	}

}
