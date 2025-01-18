package com.Arrays;
import java.util.Arrays;

//Q.45)WAJP to sort a given array without using any inbuilt functionality 

public class SortArrayInbuilt {
	public static void main(String[] args) 
	{
		int[] arr={2,3,1,5,4,6,8,7,9};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
