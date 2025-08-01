package com.gqt.corejava.arrays;

import java.util.Scanner;
/**
 * @author Gowthami
 * @category Arrays
 * @description This is an example to perform array operations
 */
class ArrayOper10{
	Scanner sc=new Scanner(System.in);
	int arr[];
	int arr2[];
	int n;
	int i;
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


	void reverse()
	{
		System.out.println("The reverse array is: ");

		for(int i=0;i<arr.length;i++)
		{
			arr2[i]=arr[n-1-i];
			System.out.print(arr2[i]);
		}
		if(arr[i]==arr2[i])
		{
			System.out.println("This is palindrome");
		}
		else
		{
			System.out.println("This is not a palindrome");

		}
	}
}

public class A10{
	public static void main(String args[])
	{
		ArrayOper10 o= new ArrayOper10();
		o.createArray();
		o.collectData();
		o.reverse();
		//o.isPalindrome();
	}
}