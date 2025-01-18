package com.Arrays;
//Q.6)WAJP to identify Smallest Element an Array.
import java.util.Scanner;
public class SmallestElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Element: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the Element of Array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int small=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<small) {
				small=arr[i];
			}
		}
		System.out.println("The Smallest elements from an Array is: "+small);
	}

}
