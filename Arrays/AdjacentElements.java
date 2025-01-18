package com.Arrays;

import java.util.Arrays;

//Q.39)WAJP to swap Adjacent elements in a given Array
public class AdjacentElements {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		int i=0;
		int j=1;
		while(j<arr.length)
		
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i += 2;
			j += 2;
		}
		 System.out.println(Arrays.toString(arr));
	}

}
