package com.Arrays;

import java.util.Arrays;

//Q.37)WAJP to sort a given Array without using inbuilt method
public class ArrayWithoutInbuiltF {
	public static void main(String[] args) {
		int [] arr= {1,3,4,2,5,7,6,9,8,12,10};
		System.out.println(Arrays.toString(arr));
		for(int i = 0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
