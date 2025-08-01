/**
 * 
 */
package com.gqt.corejava.arrays;
import java.util.Scanner;
/**
* @author Gowthami
* @category Arrays
* @description This is an example of creating, storing and displaying the elements in an array
*/ 
class ArrayOperations{
	/** The class that contains the code for all the array operations that to be performed
	 * 
	 */
	int arr[];
	Scanner sc=new Scanner(System.in);;
	
	//method to create an array
	void createArray()
	{
		System.out.println("Ener the students count: ");
		int n=sc.nextInt();
		arr=new int[n];
		System.out.println("Array Created");
		System.out.println("------");
	}
	
	//Method to collect the marks of n students
	void collectData()
	{
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the marks of student no "+(i+1));
			arr[i]=sc.nextInt(); 
		}
		System.out.println("Data is stored in an array");
	}
	
	//Method to display the marks of n students
	void displayData()
	{
		for(int i=0;i<arr.length;i++) {
			System.out.println("The marks of student no "+(i+1)+"is = " +(arr[i]));
			
		}
	}
	
}
public class ArrayCode2 {

	/**
	 * @param args
	 * @description This contains the structured code of creating  , storing and displaying the elements in an array

	 */
	public static void main(String[] args) {
		ArrayOperations ao=new ArrayOperations();
		ao.createArray();
		ao.collectData();
		ao.displayData();


	}

}
