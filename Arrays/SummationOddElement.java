package com.Arrays;
//Q.4)WAJP to identify Summation of Odd Element from an Array.
import java.util.Scanner;
public class SummationOddElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size: ");
		int size=sc.nextInt();
		int []arr=new int[size];
		System.out.println("Enter the elements in Array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				sum=sum+arr[i];
			}
		}
		System.out.println("The Summation of Odd elements is: "+sum);
		
	}

}
