package com.Arrays;

//Q.27)WAJP to find second maximum element from a given array.
public class SecondMaximumElement {
 
		public static void main(String[] args) 
		{
			int[] arr={23,43,56,12,34,66,78,78,44};
			int max=arr[0];
			int sec_max=arr[0];
			for(int i=1;i<arr.length;i++)
			{
				if(arr[i]>max)
				{
					sec_max=max;
					max=arr[i];
				}
				else if(arr[i]>sec_max && arr[i]!=max)
					sec_max=arr[i];
			}
			System.out.println(sec_max);
		}
   }
