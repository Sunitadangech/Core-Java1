package com.Arrays;
import java.util.Arrays;
//Q.15)WAJP to identify Duplicate elements from an Array.
public class IdentifyDuplicateElement {
	public static void main(String[] args) {
		int []arr= {1,2,1,3,4,2};
		int []temp=new int [arr.length];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			boolean flag=false;
			for(int j=0;j<=index;j++) {
				if(arr[i]==temp[j]) { 
					flag=true;
					break;
				
			 }
			}
			if(!flag) {
				temp[index++]=arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		temp=Arrays.copyOf(temp,index);
		System.out.println(Arrays.toString(temp));
	}

}
