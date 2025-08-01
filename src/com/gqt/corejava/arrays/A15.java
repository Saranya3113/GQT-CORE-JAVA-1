
package com.gqt.corejava.arrays;
import java.util.Scanner;
/**
 * @author Gowthami
 * @category Arrays
 * @description This is an example to perform array operations
 */
class ArrayOpe15{
	Scanner sc=new Scanner(System.in);
	int arr[];
	int element;
	void createArray(){
		System.out.println("Enter the array size:");
		int n=sc.nextInt();
		System.out.println("Enter the element that to be found: ");
		element=sc.nextInt();
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



	void index() {
		boolean found=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element)
			{
				System.out.println("The index of the element "+element+ " is : "+i);
				found=true;
				break;
			}
		}

		if(!found)
		{
			System.out.println("The index of the element "+element+ " is not found");

		}
	}
}

public class A15 {

	/**
	 * @param args
	 * @description This contains the structured code  to get the sum of all the elements in an array
	 */
	public static void main(String[] args) {
		ArrayOpe15 o= new ArrayOpe15();
		o.createArray();
		o.collectData();
		o.index();
	}

}
