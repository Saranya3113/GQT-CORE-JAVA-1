package com.gqt.corejava.arrays;

import java.util.Scanner;
/**
 * @author Gowthami
 * @category Arrays
 * @description This is an example to perform array operations
 */
class ArrayOper18{
	Scanner sc=new Scanner(System.in);
	int arr[];
	int arr2[];
	int n1;
	int n2;
	//method to create an array
	void createArray(){
		System.out.println("Enter the array1 size:");
		n1=sc.nextInt();

		System.out.println("Enter the array2 size:");
		n2=sc.nextInt();
		//create an array
		arr=new int[n1];
		arr2=new int[n2];

	}


	//method to collect the elements of an array
	void collectData() {

		for(int i=0;i<n1;i++) {
			System.out.println("Enter the element of an array1: ");
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<n2;i++) {
			System.out.println("Enter the element of an array2: ");
			arr2[i]=sc.nextInt();
		}
	}


	void equals()
	{
		if(n1!=n2)
		{
			System.out.println("The two arrays are not equal");
		}

		boolean equals=true;
		for(int i=0;i<n1;i++)
		{
			if(arr[i]!=arr2[i])
			{
				equals=false;
				break;

			}

		}
		if(equals)
		{
			System.out.println("The two arrays are  equal");

		}
		else {
			System.out.println("The two arrays are not equals");

		}
	}
}





public class A18 {

	/**
	 * @param args
	 * @description This contains the structured code  to get the sum of all the elements in an array
	 */
	public static void main(String[] args) {
		ArrayOper18 o= new ArrayOper18();
		o.createArray();
		o.collectData();
		o.equals();
	}

}

