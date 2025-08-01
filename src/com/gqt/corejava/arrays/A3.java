package com.gqt.corejava.arrays;

import java.util.Scanner;
/**
 * @author Gowthami
 * @category Arrays
 * @description This is an example to perform array operations
 */
class ArrayOper2{
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
	void copy()
	{
		System.out.println("the elements of second array are: ");
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=arr[i];

			System.out.print(arr2[i]+ " ");
		}
	}


}
public class A3 {

	/**
	 * @param args
	 * @description This contains the structured code  to get the sum of all the elements in an array
	 */
	public static void main(String[] args) {
		ArrayOper2 o= new ArrayOper2();
		o.createArray();
		o.collectData();
		o.copy();
	}

}

