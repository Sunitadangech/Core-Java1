package com.Arrays;


import java.util.Arrays;
//Q.30)WAJP to Arrange a given array as mentioned below//{0,1,1,0,1,0,1,1,0,0}=={0,0,0,0,0,1,1,1,1,1}
public class ArrangeArray {
		public static void main(String[] args) 
		{
			int[] arr={0,1,1,0,1,0,1,1,0,0};
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==1)
				{
				for(int j=i+1;j<arr.length;j++)
				{
				if(arr[j]==0)
				{
				int temp=arr[i];	
				arr[i]=arr[j];
				arr[j]=temp;
				break;
				}
				}
				}
			}
			
			System.out.println(Arrays.toString(arr));
		}
}
