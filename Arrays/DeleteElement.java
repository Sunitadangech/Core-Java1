package com.Arrays;
//Q.17)WAJP to delete elements.
import java.util.Arrays;
//WAJP to Delete Element
import java.util.Scanner;
public class DeleteElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the Elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the index from which you want to delete the Element");
		int index=sc.nextInt();
		
		for(int i=index+1;i<arr.length;i++) {
			arr[i]=arr[i+1];
			arr=Arrays.copyOf(arr,arr.length-1);
			System.out.println(Arrays.toString(arr));
		}
	}

}
