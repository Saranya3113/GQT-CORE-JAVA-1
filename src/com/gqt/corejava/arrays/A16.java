package com.gqt.corejava.arrays;

import java.util.Scanner;
/**
 * @author Gowthami
 * @category Arrays
 * @description This is an example to perform array operations
 */
class ArrayOper16{
	Scanner sc=new Scanner(System.in);
	int arr[];
	int arr2[];
	int n;
	int d;

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
	void left()
	{
		d=d%n;
		System.out.println("the elements after rotating left  are: ");
		for(int i=0;i<n;i++) {

			System.out.print(arr[(i+d)%n]+ " ");
		}
	}


	void right()
	{
		d=d%n;
		System.out.println("the elements after rotating right  are: ");
		for(int i=0;i<n;i++) {

			System.out.print(arr[(i+n-d)%n]+ " ");
		}
	}


}
public class A16 {

	/**
	 * @param args
	 * @description This contains the structured code  to get the sum of all the elements in an array
	 */
	public static void main(String[] args) {
		ArrayOper16 o= new ArrayOper16();
		o.createArray();
		o.collectData();
		o.left();
		o.right();
	}

}

