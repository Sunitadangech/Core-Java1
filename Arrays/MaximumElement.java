package com.Arrays;

//Q.31)WAJP to find maximun element from given array
public class MaximumElement {
		public static void main(String[] args) 
		{
			int[] arr={1,3,2,9,6};
			int max=arr[0];
			//Accessing element from an array
			for(int i=1;i<arr.length;i++)
			{
				if(arr[i]>max)
					max=arr[i];
				}
			System.out.println(max);
		}
}
