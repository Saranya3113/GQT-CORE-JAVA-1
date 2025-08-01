package com.gqt.corejava.arrays;
import java.util.Scanner;

class smalllarg {
    Scanner sc=new Scanner(System.in);
    int arr[];

    void createArray() {
        System.out.println("Enter the size");
        int n=sc.nextInt();
        arr=new int[n];
    }

    void collectData() {
        for (int i=0; i<arr.length; i++) {
            System.out.println("Enter the elements:"+(i+1));

            arr[i]=sc.nextInt();
        }
    }

    void display() {
       
        for (int i=0; i<arr.length; i++) {
            for (int j=i + 1; j< arr.length; j++) {
                if (arr[i]>arr[j]) {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
void kth()
{
        System.out.print("Enter the value of k: ");
        int k=sc.nextInt();
        if (k>0 && k<=arr.length) {
            System.out.println("Kth Smallest Element: " +arr[k - 1]);
            System.out.println("Kth Largest Element: " +arr[arr.length - k]);
        } else {
            System.out.println("Invalid value of k");
        }
    }
}


public class A24 {
    public static void main(String[] args) {
        smalllarg s = new smalllarg();
        s.createArray();
        s.collectData();
        s.display();
        s.kth();
    }
}