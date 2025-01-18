package com.Arrays;
//Q.7)WAJP to count How many Positive and Negative Elements present in an given Array.
import java.util.Scanner;
public class CountPosNegElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Element: ");
		int size=sc.nextInt();
		int arr[]=new int [size];
		System.out.println("Enter the "+ size +" Element");
		//Store the Element
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		//Access the Element
		int pos=0;
		int neg=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=0) {
				pos++;
			}
			else {
				neg++;
			}
		}
		System.out.println("The Positive Count is: "+pos);
		System.out.println("The Negative Count is: "+neg);
	}

}
