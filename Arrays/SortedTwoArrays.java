package com.Arrays;

import java.util.Arrays;

//Q.25)WAJP to merge two sorted Arrays in sorted manner.
public class SortedTwoArrays {
	public static void main(String[] args) {
		int arr1[]= {1,3,5,7};
		int arr2[]= {2,4,6,8};
		int res[] = new int[arr1.length+arr2.length];
		int i=0;
		int j=0;
        int index=0;
		
        while(i<arr1.length && j<arr2.length)
        {
        	if(arr1[i] <arr2[j])
        	{
        		res[index]=arr1[i];
        		i++;
        	}
        	else
        	{
        		res[index]=arr2[j];
        		j++;
        	}
        	index++;
        }
        
        while(i < arr1.length) 
        {
        	res[index]=arr1[i];
        	i++;
        	index++;
        }
        
        while(j < arr2.length) 
        {
        	res[index]=arr2[j];
        	j++;
        	index++;
        }
        
		System.out.println(Arrays.toString(res));
	}

}
