package com.gqt.corejava.arrays;
import java.util.Scanner;
/**
 * @author Gowthami
 * @category Arrays
 * @description This is an example to perform array operations
 */
class ArrayOpe14{
	Scanner sc=new Scanner(System.in);
	int arr[];
	int i;
	void createArray(){
		System.out.println("Enter the array size:");
		int n=sc.nextInt();
		//create an array
		arr=new int[n];

	}


	//method to collect the elements of an array
	void collectData() {

		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the element of an array: ");
			arr[i]=sc.nextInt();
		}
	}

	void sort()
	{
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("The elements of sorted array in ascending: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		System.out.println("The second largest element in an array is: ");

		System.out.print(arr[arr.length-2]);

		System.out.println();

		System.out.println("The second smallest element in an array is: ");
		System.out.print(arr[1]);

	}		
}


public class A14 {

	/**
	 * @param args
	 * @description This contains the structured code  to get the sum of all the elements in an array
	 */
	public static void main(String[] args) {
		ArrayOpe14 o= new ArrayOpe14();
		o.createArray();
		o.collectData();
		o.sort();
	}

}

