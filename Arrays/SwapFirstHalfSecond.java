package com.Arrays;

import java.util.Arrays;

//Q.26)WAJP to swap first half of an Array in the Second Half.

public class SwapFirstHalfSecond {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int i = 0;
		int j = arr.length/2+1;
		
		while(i<arr.length/2)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j++;
		}
		
		j = arr.length/2+1;
		int temp = arr[arr.length/2];
		while(j<arr.length)
		{
			arr[j-1] = arr[j];
			j++;
		}
		arr[arr.length-1] = temp;
		System.out.println(Arrays.toString(arr));
	}

}
