package com.Arrays;
//Q.2)WAJP to identify the Even elements from the given Array.
import java.util.Scanner;
public class EvenElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size:");
		int size=sc.nextInt();
		int []arr=new int [size];
		System.out.println("Enter the element in Array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Result: ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
	}

}
