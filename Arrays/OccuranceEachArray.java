package com.Arrays;

//Q.40)WAJP to print the occurance of each element present inside array.
public class OccuranceEachArray {
	public static void main(String[] args) {
		int arr[]= {1,2,1,3,4,2,3,5,6,1,2,1,6,6,7,8,8,9};
		for(int i = 0; i < arr.length; i++) {
			int count = 0;
			if(arr[i] != -1) {
				for(int j =i; j < arr.length; j++) {
					if(arr[j] != -1) {
						if(arr[j] == arr[i]) {
							count++;
							if(j != i)
								arr[j] = -1;
							
						}
					}
				}
				System.out.println(arr[i] + " =" + count);
			}
		}
		
	}

}
