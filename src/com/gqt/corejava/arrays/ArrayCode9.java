package com.gqt.corejava.arrays;
/**
 * @author Gowthami
 * @category Arrays
 * @description This is an example to perform operations on matrices
 */
import java.util.Scanner;

class MatrixOperations{
	Scanner sc=new Scanner(System.in);
	int arr1[][];
	int arr2[][];
	int sum[][];
	int rows;
	int cols;
	//methods to create the matrices
	void createMatrix1(){
		System.out.println("Enter the numbers of rows of an matrix: ");
		rows=sc.nextInt();
		System.out.println("Enter the numbers of coulmns of an matrix: ");
		cols=sc.nextInt();
		//creating a matrix
		arr1=new int[rows][cols];	
		arr2=new int[rows][cols];
		sum=new int[rows][cols];
	}
	//collect data for matrix1
	void matrix1(){

		System.out.println("Enter the elements of Matrix1: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.println("Enter the element in : "+" [ " +i+"]"+"["+j+"]"+" is");
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("First matrix is: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.print("\n");
		}
	}

	//collect data for matrix2
	void matrix2() {
		System.out.println("Enter the elements of Matrix1: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.println("Enter the element in : "+" [ " +i+"]"+"["+j+"]"+" is");
				arr2[i][j]=sc.nextInt();
			}
		}
		System.out.println("Second matrix is: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.print("\n");
		}
	}

	//add the matrices
	void addMatrix() {
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				sum[i][j]=arr1[i][j]+arr2[i][j];

			}
		}
		System.out.println("Sum matrix is: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(sum[i][j]+" ");
			}
			System.out.print("\n");
		}

	}

}

public class ArrayCode9 {
	/**
	 * @param args
	 * @description This contains the structured code of Array creating by collecting the names of the students into an jagged array
	 */
	public static void main(String args[]) {
		MatrixOperations mo = new MatrixOperations();
		mo.createMatrix1();
		mo.matrix1();
		mo.matrix2();
		mo.addMatrix();
	}
}
