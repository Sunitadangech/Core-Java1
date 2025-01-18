package com.Arrays;
import java.util.Arrays;

//Q.22)WAJP to print pair of Elements from a given array whose sum is equal to n.
public class PairElements {
	public static void main(String[] args) {
		int arr[]= {0,1,2,3,4,5,6,7,8};
		int n=6;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==n)
					System.out.println(arr[i]+"," +arr[j]);
			}
		 }
	}
}
