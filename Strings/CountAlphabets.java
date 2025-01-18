package com.Strings;

//Q.1)WAJP to count number of alphabets in a given String.

public class CountAlphabets {
	public static void main(String[] args) {
		String str="Hello World @ 1245";
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch >= 'A' && ch<='Z' || ch>='a' && ch<='z') {
				count++;
			}
		}
		System.out.println(count);
	}

}
 