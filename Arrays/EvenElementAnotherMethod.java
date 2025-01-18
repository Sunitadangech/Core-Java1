package com.Arrays;
//Q.10)WAJP to return the Even element from another Method in Array.
import java.util.Scanner;
public class EvenElementAnotherMethod {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size: ");
		int size=sc.nextInt();
		int []arr=new int[size];
		System.out.println("Enter the "+size+" Element");
		//Store the Element
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int b[]=even(arr);
		//Accessing Even Element
		System.out.println("The Result is: ");
		for(int i=0;i<arr.length;i++) {
			if(b[i]!=0) {
				System.out.println(b[i]);
			}
		}
	}
	public static int[] even(int []n) {
		int []a=new int [n.length];
		for(int i=0;i<n.length;i++) {
			if(n[i]%2==0) {
				a[i]=n[i];
			}
		}
		return a;
	}
}
