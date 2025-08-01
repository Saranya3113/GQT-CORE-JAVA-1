package com.gqt.corejava.arrays;
/**
 * 
 */

import java.util.Scanner;
/**
 * @author Gowthami
 * @category Arrays
 * @description This is an example of creating, collecting and displaying the elements into the three dimensional  jagged array
 */
class ArrayOperations4{
	String arr[][][];
	Scanner sc=new Scanner(System.in);

	//Method to create an array

	void createArray()
	{
		System.out.println("Ener the School count: ");
		int sch=sc.nextInt();

		//creating 3D array

		arr=new String[sch][][];

		//collecting class count 

		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the count of class inside the school no: "+(i+1));
			arr[i]=new String[sc.nextInt()][];
		}

		//collecting student count
		for(int i=0;i<arr.length;i++) {
			System.out.println(" inside the school no: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the count of students  inside class no:  " +(j+1));
				arr[i][j]=new String[sc.nextInt()];
			}
		}

	}


	//Method to collect the names of students in each class

	void collectData()
	{
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside School no: " +(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside class no"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the name of the student no : "+(k+1));
					arr[i][j][k]=sc.next();
				}
			}

		}
		System.out.println("Data is stored in an array");
		System.out.println("---------------");	

	}



	//Method to display the names of students in each class

	void displayData()
	{
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside School no: " +(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside class no"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println(" The name of the student no : "+(k+1)+ " is = "+arr[i][j][k]);
				}
			}
		}
	}
}
public class ArrayCode6 {

	/**
	 * @param args
	 * @description This contains the structured code of Array creating by collecting the names of the students into an jagged array
	 */
	public static void main(String[] args) {

		ArrayOperations4 ao=new ArrayOperations4();
		ao.createArray();
		ao.collectData();
		ao.displayData();


	}
}


