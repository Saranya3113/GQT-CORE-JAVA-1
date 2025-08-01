package com.gqt.corejava.arrays;
import java.util.Scanner;

class Point {
        Scanner sc = new Scanner(System.in);
        int rows;
        int cols;
        int matrix[][];
        // Input matrix size
        void createArray() {
        System.out.print("Enter the number of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        matrix = new int[rows][cols];
        }
        void collectData()
        {
        // Input matrix elements
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        }
    
void displaySandle() {
        boolean found = false;

        // Find saddle point
        for (int i = 0; i < rows; i++) {
            // Find the minimum element in the row
            int min = matrix[i][0];
            int colIndex = 0;
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    colIndex = j;
                }
            }

            // Check if the min element is the maximum in its column
            boolean isSaddle = true;
            for (int k = 0; k < rows; k++) {
                if (matrix[k][colIndex] > min) {
                    isSaddle = false;
                    break;
                }
            }

            if (isSaddle) {
                System.out.println("Saddle Point: " + min + " at position (" + i + ", " + colIndex + ")");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No saddle point found in the matrix.");
        }
    }

}



public class A23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Point p=new Point();
           p.createArray();
           p.collectData();
           p.displaySandle();
	}

}