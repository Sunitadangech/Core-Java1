package com.Strings;

//Q.7)WAJP to print the words present inside the given Array which have even number of characters.

public class PrintWords {
	public static void main(String[] args) {
		String str="apple,ball,cat,dog,elephant,flower";
		String[] arr=str.split(",");
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length()%2==0) {
				System.out.println(arr[i]);
			}
		}
		
	}

}
