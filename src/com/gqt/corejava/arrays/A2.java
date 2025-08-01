
package com.gqt.corejava.arrays;
import java.util.Scanner;
/**
 * @author Gowthami
 * @category Arrays
 * @description This is an example to perform array operations
 */
class ArrayOper1{
	Scanner sc=new Scanner(System.in);
	int arr[];
	int large;
	int small;
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



	void largest() {
		large=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(large<arr[i])
			{
				large=arr[i];
			}
		}
		System.out.println("The largest of al the elements in an array:" +large);
	}
	void smallest() {
		small=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(small>arr[i])
			{
				small=arr[i];
			}
		}
		System.out.println("The smallest of al the elements in an array:" +small);
	}
}
public class A2 {

	/**
	 * @param args
	 * @description This contains the structured code  to get the sum of all the elements in an array
	 */
	public static void main(String[] args) {
		ArrayOper1 o= new ArrayOper1();
		o.createArray();
		o.collectData();
		o.largest();
		o.smallest();
	}

}
