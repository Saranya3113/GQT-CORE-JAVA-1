package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Size:");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		int m=i;
		for(int j=1;j<=n;j++) {	
		System.out.print(m +" ");
		m=m+n;
	}
		System.out.println();
		
}
	}

}
