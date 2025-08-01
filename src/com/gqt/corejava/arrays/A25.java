package com.gqt.corejava.arrays;
import java.util.Scanner;
class negpos{
	Scanner sc=new Scanner(System.in);
	int arr[];
	int positive=0;
	int negative=0;
	int zero=0;
		void createArray() {
			System.out.println("Enter the size");
			int n=sc.nextInt();
			arr=new int[n];
		}
		void collectData() {
			for(int i=0;i<arr.length;i++) {
				System.out.println("Enter the elements in an array: ");
				arr[i]=sc.nextInt();
				
		}
	}
	void countNumbers() {
			for(int i = 0; i < arr.length; i++) {
	            if(arr[i] > 0) {
	                positive++;
	            } else if(arr[i] < 0) {
	                negative++;
	            } else {
	                zero++;
	            }
	        }
			System.out.println("Positive elements: " + positive);
	        System.out.println("Negative elements: " + negative);
	        System.out.println("Zero elements: " + zero);
		}
}
public class A25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		negpos n=new negpos();
		n.createArray();
		n.collectData();
		n.countNumbers();

	}

}