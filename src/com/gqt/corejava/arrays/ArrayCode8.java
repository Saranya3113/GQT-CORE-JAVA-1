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
class ArrayOperations6{
	String arr[][][];
	Scanner sc=new Scanner(System.in);
	long sum_rev;
	long med_rev;
	long eng_rev;
	long deg_rev;
	long sum_med_rev;
	long sum_eng_rev;
	long sum_deg_rev;
	//Method to create an array

	void createArray()
	{
		System.out.println("Enter the category count: ");
		int cat=sc.nextInt();
		System.out.println("Enter the medical college revenue : ");
		med_rev=sc.nextLong();
		System.out.println("Enter the engineering college revenue : ");
		eng_rev =sc.nextLong();
		System.out.println("Enter the degree college revenue : ");
		deg_rev=sc.nextLong();



		//creating 3D array

		arr=new String[cat][][];

		//collecting class count 

		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the count of class inside the category no: "+(i+1));
			arr[i]=new String[sc.nextInt()][];
		}

		//collecting students count
		for(int i=0;i<arr.length;i++) {
			System.out.println(" inside the category no: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the count of students  inside class no:  " +(j+1)+" Inside category no :"+(i+1));
				arr[i][j]=new String[sc.nextInt()];
			}
		}

	}


	//Method to collect the revenue and names of students in each class

	void collectData()
	{
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside category no: " +(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside class no"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the names of the student no : "+(k+1));
					arr[i][j][k]=sc.next();
					if(i==0)
					{
						sum_med_rev+=med_rev;


					}
					else if(i==1)
					{
						sum_eng_rev+=eng_rev;
					}
					else {
						sum_deg_rev+=deg_rev;
					}
				}
			}

		}
		System.out.println("Data is collected and calculated in an array");
		System.out.println("---------------");	

		sum_rev=sum_med_rev+sum_eng_rev+sum_deg_rev;
		System.out.println("The overall revenue is "+(sum_rev));

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
public class ArrayCode8 {

	/**
	 * @param args
	 * @description This contains the structured code of Array creating by collecting the names of the students into an jagged array
	 */
	public static void main(String[] args) {

		ArrayOperations6 ao=new ArrayOperations6();
		ao.createArray();
		ao.collectData();
		ao.displayData();


	}
}


