
package com.gqt.corejava.arrays;
import java.util.Scanner;
/**
 * @author Gowthami
 * @category Arrays
 * @description This is an example to perform array operations
 */
class ArrayOper8{
	Scanner sc=new Scanner(System.in);
	int arr1[];
	int arr2[];
	int n1;
	int n2;
	int res[];

	//method to create an array
	void createArray(){
		System.out.println("Enter the array1 size:");
		n1=sc.nextInt();
		System.out.println("Enter the array2 size:");
		n2=sc.nextInt();
		//create an array
		arr1=new int[n1];
		arr2=new int[n2];
	}


	//method to collect the elements of an array
	void collectData() {
		//array1
		for(int i=0;i<arr1.length;i++) {
			System.out.println("Enter the element of an array1: ");
			arr1[i]=sc.nextInt();
		}

		//array2
		for(int i=0;i<arr2.length;i++) {
			System.out.println("Enter the element of an array2: ");
			arr2[i]=sc.nextInt();
		}
	}

	void sort()
	{
		res=new int[n1+n2];
		int i=0,j=0,k=0;
		while(i<n1 && j<n2){
			if(arr1[i]<arr2[j])
			{
				res[k]=arr1[i];
				i++;
				k++;
			}
			else
			{
				res[k]+=arr2[j];
				j++;
				k++;
			}

		}
		while(i<n1)
		{
			res[k]=arr1[i];
			i++;
			k++;
		}

		while(j<n2)
		{
			res[k]=arr2[j];
			j++;
			k++;
		}

		System.out.println("The merged array is: ");
		for(int x=0;x<n1+n2;x++) {
			System.out.print(res[x]+ " ");

		}
	}

}
public class A8 {

	/**
	 * @param args
	 * @description This contains the structured code  to get the sum of all the elements in an array
	 */
	public static void main(String[] args) {
		ArrayOper8 o= new ArrayOper8();
		o.createArray();
		o.collectData();
		o.sort();
	}

}
