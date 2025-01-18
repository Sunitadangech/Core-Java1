package com.Arrays;
//Q.9)WAJP to whether the Average of even elements from the another method using Array.
import java.util.Scanner;
public class AverageEvenElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of element");
		int size=sc.nextInt();
		int []arr=new int [size];
		System.out.println("Enter the "+size+ " Element");;
		//Store the Element
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int res=evenAverage(arr);
		System.out.println("The returned result:"+res);
	}
	public static int evenAverage(int[]n) {
		int sum=0;
		int count=0;
		for(int i=0;i<n.length;i++) {
			if(n[i]%2==0) {
				sum +=n[i];
				count++;
			}
		}
		int avg=sum/count;
		return avg;
	}

}
