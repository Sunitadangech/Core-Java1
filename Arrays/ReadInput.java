package com.Arrays;
//Q.1)WAJP to read the input from the users store 5 integer value in an array and print one by one.
import java.util.Scanner;
public class ReadInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size:");
		int size=sc.nextInt();
		int [] arr=new int[size];
		System.out.println("Enter the Elements in Array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The Result is: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
