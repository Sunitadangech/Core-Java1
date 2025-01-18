package com.Arrays;

import java.util.Arrays;

//Q.19)WAJP to merge to given Arrays Zig-Zag manner
public class ZigZagManner {
	public static void main(String[] args) {
		int arr1[]= {1,2,3,4};
		int arr2[]= {5,6,7,8};
		int res[] = new int[arr1.length+arr2.length];
		int index=0;
		
		for(int i=0;i<arr1.length;i++) {
			res[index]=arr1[i];
			index += 2;;
		}
		
		index=1;
		
		for(int i=0;i<arr2.length;i++) {
			res[index]=arr2[i];
			index += 2;;
		}
		System.out.println(Arrays.toString(res));
	}

}


//public class ZigZagManner {
//	public static void main(String[] args) {
//		int arr1[]= {1,2,3,4};
//		int arr2[]= {5,6,7,8};
//		int[] res =new int[arr1.length+arr2.length];
//		int index=0;
//		
//		for(int i=0;i<arr1.length;i++) {
//			res[index]=arr1[i];
//			index++;
//			res[index]=arr2[i];
//			index++;
//		}
//		System.out.println(Arrays.toString(res));
//		}
//}
