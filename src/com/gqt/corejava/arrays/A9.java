package com.gqt.corejava.arrays;
import java.util.Scanner;
/**
 * @author Gowthami
 * @category Arrays
 * @description This is an example to perform array operations
 */
class ArrayOper9{
	Scanner sc=new Scanner(System.in);
	int arr1[];
	int arr2[];
	int n1;
	int n2;
	int res[];

	//method to create an array
	void createArray(){
		System.out.println("Enter the array1 size:");
		n1=sc.nextInt();
		System.out.println("Enter the array2 size:");
		n2=sc.nextInt();
		//create an array
		arr1=new int[n1];
		arr2=new int[n2];
	}


	//method to collect the elements of an array
	void collectData() {
		//array1
		for(int i=0;i<arr1.length;i++) {
			System.out.println("Enter the element of an array1: ");
			arr1[i]=sc.nextInt();
		}

		//array2
		for(int i=0;i<arr2.length;i++) {
			System.out.println("Enter the element of an array2: ");
			arr2[i]=sc.nextInt();
		}

	}


	void intersection()
	{
		System.out.println("The intersection array is: ");
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]+" ");

				}
			}
		}


	}
}



public class A9{
	public static void main(String args[])
	{
		ArrayOper9 o= new ArrayOper9();
		o.createArray();
		o.collectData();
		o.intersection();
	}
}