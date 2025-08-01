package com.gqt.corejava.arrays;

import java.util.Scanner;
/**
 * @author Gowthami
 * @category Arrays
 * @description This is an example to perform array operations
 */
class ArrayOper7{
	Scanner sc=new Scanner(System.in);
	int arr[];
	int n;

	//method to create an array
	void createArray(){
		System.out.println("Enter the array size:");
		n=sc.nextInt();
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
	void frequency()
	{

		for(int i=0;i<arr.length;i++)
		{ 
			boolean isCount=false;


			for(int j=0;j<i;j++)
			{

				if(arr[i]==arr[j]) {
					isCount=true;	
					break;
				}
			}

			if(!isCount)
			{
				int count=1;
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j]) {
						count++;
					}
				}
				System.out.println(" The frequency element "+arr[i]+" is : "+count);

			}

		}
	}
}
public class A7 {

	/**
	 * @param args
	 * @description This contains the structured code  to get the sum of all the elements in an array
	 */
	public static void main(String[] args) {
		ArrayOper7 o= new ArrayOper7();
		o.createArray();
		o.collectData();
		o.frequency();
	}

}
