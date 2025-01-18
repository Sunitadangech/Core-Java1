package com.Arrays;
//Q.47)HashSet
import java.util.HashSet;
public class HashSet1 {
	    public static void main(String[] args){
	        int arr[] = {1,3,2,4,5,1,4,3};
	        int size = arr.length;
	        HashSet <Integer> s = new <Integer>HashSet(0);
	        for(int i=0;i<size-1;i++){
	            s.add(arr[i]);
	            arr[i]=arr[i+1];
	        }  
	        System.out.println(s);
	}

}
