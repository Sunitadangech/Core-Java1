package com.Arrays;
//Q.5)WAJP to identify largest element an Array.
import java.util.Scanner;
public class LargestElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Element: ");
		int size=sc.nextInt();
		int []arr=new int[size];
		System.out.println("Enter the "+size+" Element");
		//Store the Elements
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		//Access the Elements
		System.out.println("The Output is");
		int large=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(large<arr[i]) {
				large=arr[i];
			}
		}
		System.out.println("The largest Element is: "+large);
	}

}
