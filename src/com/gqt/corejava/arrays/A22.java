package com.gqt.corejava.arrays;
import java.util.Scanner;
class symm{
	Scanner sc=new Scanner(System.in);
	int arr[][];
	void collect() {
		System.out.println("Enter the size of matrix");
		int n=sc.nextInt();
		arr=new int[n][n];
		for(int i=0;i<arr.length;i++) {

			for(int j=0;j<arr.length;j++) {
				System.out.println("Enter the matrix elements" +(j+1));

				arr[i][j] = sc.nextInt();
			}
		}
	}
	void symmetry() {
		boolean issymmetric=true;
		for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr.length; j++) {
                if (arr[i][j]!=arr[j][i]) {
                    issymmetric = false;
                    break;
                }
            }
            if (!issymmetric) {
                break;
            }
        }

        if (issymmetric) {
            System.out.println("The matrix is Symmetric.");
        } else {
            System.out.println("The matrix is NOT Symmetric.");
        }
	}
}
public class A22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            symm s=new symm();
            s.collect();
            s.symmetry();
            
	}

}