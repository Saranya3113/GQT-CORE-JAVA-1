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
public class Arraycode1 {

	/**
	 * @param args

	 * @description This contains the unstructured code of creating  , storing and displaying the elements in an array
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the students count : ");
		int n=sc.nextInt();
		//creating an array
		int arr[]=new int[n];
		//Collectng and storing the marks of n students
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the marks of student no "+(i+1));
			arr[i]=sc.nextInt(); 
		}
		System.out.println("-----------");
		//Displaying the marks of n students
		for(int i=0;i<arr.length;i++) {
			System.out.println("The marks of student no "+(i+1)+" is = " +(arr[i]));
			
		}

	}

}
