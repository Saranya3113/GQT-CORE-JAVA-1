package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");	
			}
			for(int k=1;k<=(2*i-1);k++) {
				System.out.print(i+"");
			}
			
			System.out.println();
		}
		for(int i=2;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
				
			}
			for(int k=1;k<=(2*i-1);k++) {
				System.out.print(i+"");
			}
			
			System.out.println();
		}

	}

}
