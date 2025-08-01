package com.gqt.corejava.arrays;

import java.util.Scanner;
/**
 * @author Gowthami
 * @category Arrays
 * @description This is an example to perform array operations
 */
class ArrayOper4{
	Scanner sc=new Scanner(System.in);
	int arr[];
	int arr2[];
	int n;

	//method to create an array
	void createArray(){
		System.out.println("Enter the array size:");
		n=sc.nextInt();
		//create an array
		arr=new int[n];
		arr2=new int[n];

	}


	//method to collect the elements of an array
	void collectData() {

		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the element of an array: ");
			arr[i]=sc.nextInt();
		}
	}

	//method to Copying into another array
	void reverse()
	{
		System.out.println("The reverse array is: ");
		for(int i=0;i<arr.length;i++) {
			arr2[i]=arr[arr.length-1-i];
			System.out.print(arr2[i]+" ");
		}	
	}
}

public class A5 {
	/**
	 * @param args
	 * @description This contains the structured code  to get the sum of all the elements in an array
	 */
	public static void main(String[] args) {
		ArrayOper4 o= new ArrayOper4();
		o.createArray();
		o.collectData();
		o.reverse
		();
	}

}


