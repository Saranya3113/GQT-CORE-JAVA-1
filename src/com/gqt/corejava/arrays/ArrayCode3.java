/**
 * 
 */
package com.gqt.corejava.arrays;
import java.util.Scanner;
/**
 * @author Gowthami
 * @category Arrays
 * @description This is an example of creating, collecting and displaying the elements into the two dimensional arrauy
 */
class ArrayOperations1{
	String arr[][];
	Scanner sc=new Scanner(System.in);
	
	//Method to create an array

	void createArray()
	{
		System.out.println("Ener the Classs count: ");
		int cls=sc.nextInt();
		System.out.println("Ener the Students count: ");
		int stu=sc.nextInt();
		arr=new String[cls][stu];
		System.out.println("Array Created");
		System.out.println("---------------");	}
	
	//Method to collect the names of students in each class

	void collectData()
	{
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside Class no: " +(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the names of student no "+(j+1));
				arr[i][j]=sc.next(); 
			}
			
		}
		System.out.println("Data is stored in an array");
		System.out.println("---------------");	

	}

	

	//Method to display the names of students in each class
	void displayData()
	{
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside Class no: " +(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(" The names of student no "+(j+1)+"is ="+(arr[i][j]));
			}
			
		}
	}
}
public class ArrayCode3 {

	/**
	 * @param args
	 * @description This contains the structured code of Array creating by collecting the names of the students
	 */
	public static void main(String[] args) {
		
		ArrayOperations1 ao=new ArrayOperations1();
		ao.createArray();
		ao.collectData();
		ao.displayData();
	}

}
