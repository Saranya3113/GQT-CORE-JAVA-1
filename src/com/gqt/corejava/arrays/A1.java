
package com.gqt.corejava.arrays;
import java.util.Scanner;
/**
 * @author Gowthami
 * @category Arrays
 * @description This is an example to perform array operations
 */
class ArrayOpe{
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
			sum+=arr[i];
		}
		System.out.println("The sum of al the elements in an array:" +sum);
	}
}
public class A1 {

	/**
	 * @param args
	 * @description This contains the structured code  to get the sum of all the elements in an array
	 */
	public static void main(String[] args) {
		ArrayOpe o= new ArrayOpe();
		o.createArray();
		o.collectData();
		o.sumOfArray();
	}

}
