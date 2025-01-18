package com.Arrays;

import java.util.Arrays;

//Q18)WAJP to merge two Arrays.
public class MergeTwoArray {
	public static void main(String[] args) {
		int arr1[]= {1,2,3,4};
		int arr2[]= {5,6,7,8,9,10};
		int res[] = new int[arr1.length+arr2.length];
		int index=0;
		
		for(int i=0;i<arr1.length;i++) {
			res[index]=arr1[i];
			index++;
		}
		for(int i=0;i<arr2.length;i++) {
			res[index]=arr2[i];
			index++;
		}
		System.out.println(Arrays.toString(res));
	}

}


//public class MergeTwoArray {
//	public static void main(String[] args) {
//		int arr1[]= {1,2,3,4};
//		int index = arr1.length;
//		int arr2[]= {5,6,7,8,9,10};
//		int res[] = new int[arr1.length+arr2.length];
//		
//		for(int i=0;i<arr1.length;i++) {
//			res[i]=arr1[i];
//		}
//		for(int i=0;i<arr2.length;i++) {
//			res[index]=arr2[i];
//			index++;
//		}
//		System.out.println(Arrays.toString(res));
//	}
//
//}


