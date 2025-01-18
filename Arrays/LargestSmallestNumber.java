package com.Arrays;
import java.util.Arrays;

//Q.23)WAJP to find n smallest and n largest from given array containing unique elements.
public class LargestSmallestNumber {
	public static void main(String[] args) {
		int arr[]= {12,23,3,4,16,74,78,56};
		int n=3;
		Arrays.sort(arr);
		System.out.println(n + " Smallest = "+arr[n-1]);
		System.out.println(n + " Largest = "+arr[arr.length-n]);
		
	}

}
