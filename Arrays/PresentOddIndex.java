package com.Arrays;
//Q.3)WAJP to print the elements which is present in Odd index in an Array.
import java.util.Scanner;
public class PresentOddIndex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Size: ");
		int size=sc.nextInt();
		int []arr=new int[size];
		System.out.println("Enter the Element in Array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter The Result: ");
		for(int i=0;i<arr.length;i++) {
			if(i%2!=0) {
				System.out.println(arr[i]);
			}
		}
		
	}

}
