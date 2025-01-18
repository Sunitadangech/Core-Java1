package com.Strings;

//Q.8)WAJP to count words in a given String which start with vowels.

public class CountWords {
	public static void main(String[] args) {
		String str="apple,ball,cat,dog,elephant,flower,icecream";
		int count=0;
		String[] arr = str.split(",");
		for(int i = 0;i < arr.length;i++) {
		char ch = arr[i].charAt(0);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			count++;
		 }
			
		}
		System.out.println(count);
	}

}
