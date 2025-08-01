package com.gqt.corejava.arrays;
/**
 * @author Gowthami
 * @category Arrays
 * @description This is an example to perform operations on matrices
 */
import java.util.Scanner;

class MatricesOp{
	Scanner sc=new Scanner(System.in);
	int arr1[][];
	int arr2[][];
	int rows1;
	int cols1;
	int rows2;
	int cols2;
	int mul[][];

	void createMatrix1(){
		System.out.println("Enter the numbers of rows of an matrix1: ");
		rows1=sc.nextInt();
		System.out.println("Enter the numbers of coulmns of an matrix1: ");
		cols1=sc.nextInt();

		System.out.println("Enter the numbers of rows of an matrix2: ");
		rows2=sc.nextInt();
		System.out.println("Enter the numbers of coulmns of an matrix2: ");
		cols2=sc.nextInt();//creating a matrix
		arr1=new int[rows1][cols1];	
		arr2=new int[rows2][cols2];
		mul=new int[rows1][cols2];
	}
	//collect data
	void matrix1(){

		System.out.println("Enter the elements of Matrix1: ");
		for(int i=0;i<rows1;i++) {
			for(int j=0;j<cols1;j++) {
				System.out.println("Enter the element in : "+" [ " +i+"]"+"["+j+"]"+" is");
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("First matrix is: ");
		for(int i=0;i<rows1;i++) {
			for(int j=0;j<cols1;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.print("\n");
		}
	}


	void matrix2() {
		System.out.println("Enter the elements of Matrix2: ");
		for(int i=0;i<rows2;i++) {
			for(int j=0;j<cols2;j++) {
				System.out.println("Enter the element in : "+" [ " +i+"]"+"["+j+"]"+" is");
				arr2[i][j]=sc.nextInt();
			}
		}
		System.out.println("Second matrix is: ");
		for(int i=0;i<rows2;i++) {
			for(int j=0;j<cols2;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.print("\n");
		}
	}


	void multiply()
	{
		for(int i=0;i<rows1;i++) {
			for(int j=0;j<cols2;j++)
			{
				for(int k=0;k<cols1;k++)
				{
					mul[i][j]+=arr1[i][k]*arr2[k][j];
				}

			}
		}
		System.out.println("multiply matrix is: ");
		for(int i=0;i<rows1;i++) {
			for(int j=0;j<cols2;j++) {
				System.out.print(mul[i][j]+" ");
			}
			System.out.print("\n");
		}
	}

}
public class ArrayCode10 {
	/**
	 * @param args
	 * @description This contains the structured code of creating two matrices and multiplying those two matrices
	 */
	public static void main(String args[])
	{
		MatricesOp o= new MatricesOp();
		o.createMatrix1();
		o.matrix1();
		o.matrix2();
		o.multiply();
	}

}
