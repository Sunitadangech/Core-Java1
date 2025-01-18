package com.Arrays;
//Q.14)WAJP to remove the Duplicate from an Array.
import java.util.Scanner;
public class RemoveDuplicateArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);			;
		System.out.println("Enter the Size of an Element: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the Element: ");
		//Store the Element
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		//Logic to remove duplicate Elements
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]);{
					arr[j]=-1;
				}
			}
		}
		System.out.println("The Result is:" );
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=-1) {
				System.out.println(arr[i]);
			}
		}
	}

}
