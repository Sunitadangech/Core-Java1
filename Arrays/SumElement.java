package com.Arrays;
//Q.8)WAJP to written the Sum of elements from the another method.
import java.util.Scanner;
public class SumElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Elements:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the "+size+ " Elements");
		//Store the Elements
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int res=sumOfNumber(arr);
		System.out.println("The returned result is: "+res);
	}
	private static int sumOfNumber(int[] n) {
		int sum=0;
		for(int i=0;i<n.length;i++) {
			sum +=n[i];
		}
		return sum;
	}
}
