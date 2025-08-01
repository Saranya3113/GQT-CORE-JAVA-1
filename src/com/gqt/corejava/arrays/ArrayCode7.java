package com.gqt.corejava.arrays;
import java.util.Scanner;

/**
 * @author Gowthami
 * @category Array
 * @description This is an example of 3D array
 */
class MovieOperations{
	Scanner sc=new Scanner(System.in);
	long arr[][][];
	long investment;
	long prev_profit;
	long sum_revenue;
	void createArray()
	{
		System.out.println("Enter the count of lnguages: ");
		int lang=sc.nextInt();
		System.out.println("Enter the count of Categories: ");
		int cate=sc.nextInt();
		System.out.println("Enter the count of Movies: ");
		int mov=sc.nextInt();
	
		//creating a 3D array
		arr=new long[lang][cate][mov];
				System.out.println("Array Created");
				System.out.println("---------------");	
				System.out.println("Enter the Total investment made in movies: ");
				investment=sc.nextLong();
				System.out.println("Enter the Previous year profit made in movies: ");
				prev_profit=sc.nextLong();
				System.out.println("---------------");	

	}


			//Method to collect the names of students in each class

			void collectRevenueData()
			{
				for(int i=0;i<arr.length;i++) {
					System.out.println("Inside language no: " +(i+1));
					for(int j=0;j<arr[i].length;j++) {
						System.out.println("Inside category no"+(j+1));
						for(int k=0;k<arr[i][j].length;k++) {
							System.out.println("Enter the revenue of the movie no : "+(k+1));
							arr[i][j][k]=sc.nextLong();
							sum_revenue+=arr[i][j][k];

						}
					}

				}
				

				
				System.out.println("Data is collected and calculated in an array");
				System.out.println("---------------");	
				System.out.println("The overall revenue is: " +(sum_revenue));
				System.out.println("---------------");	


			}



			//Method to display the names of students in each class

			void displayData()
			{
				for(int i=0;i<arr.length;i++) {
					System.out.println("Inside language no: " +(i+1));
					for(int j=0;j<arr[i].length;j++) {
						System.out.println("Inside category no"+(j+1));
						for(int k=0;k<arr[i][j].length;k++) {
							System.out.println(" The revenue of the movie no : "+(k+1)+ " is = "+arr[i][j][k]);
						}
					}
				}
				long profit=sum_revenue-investment;
				if(profit>0)
				{
					System.out.println("Hemanth made a profit of :"+(profit));
					if(profit>prev_profit)
					{
						System.out.println("Hemanth made a profit more than previous year");

					}
					else {
						System.out.println("Hemanth made a loss than previous year");

					}
			}
				else {
					System.out.println("Hemanth incured a loss  of :"+(investment-sum_revenue));

		}
			}
}
		public class ArrayCode7 {

			/**
			 * @param args
			 * @description This contains the structured code of Array creating by collecting the names of the students into an  array
			 */
			public static void main(String[] args) {

				MovieOperations mo=new MovieOperations();
				mo.createArray();
				mo.collectRevenueData();
				mo.displayData();
			}

		}