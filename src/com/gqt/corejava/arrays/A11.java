
package com.gqt.corejava.arrays;
import java.util.Scanner;
/**
 * @author Gowthami
 * @category Arrays
 * @description This is an example to perform array operations
 */
class ArrayOpe11{
	Scanner sc=new Scanner(System.in);
	int arr[];
	int sum;
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



	void sumOfArray() {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0)
			{
				sum+=arr[i];
			}
		}
		System.out.println("The sum of al the elements in an array:" +sum);
	}
}
public class A11 {

	/**
	 * @param args
	 * @description This contains the structured code  to get the sum of all the elements in an array
	 */
	public static void main(String[] args) {
		ArrayOpe11 o= new ArrayOpe11();
		o.createArray();
		o.collectData();
		o.sumOfArray();
	}

}
