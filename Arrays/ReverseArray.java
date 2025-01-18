package com.Arrays;
//Q.12)WAJP to reverse an Array.
import java.util.Scanner;
import java.util.Arrays;
public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of an Array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int rev[]=new int[size];
		System.out.println("Enter the Array Elements: ");
		for(int i=0;i<arr.length;i++) {
			 arr[i]=sc.nextInt();
		}
		//Logic to reverse Array
		System.out.println("The Reverse of given Array is: ");
		int j=0;
		for(int i=size-1;i>=0;i--) {
			rev[j]=arr[i];
			System.out.println(rev[j]);
			j++;
		}
		//Accessing the Array using Inbuilt method of arrays class.
		System.out.println(rev);
	}

}
