package com.Strings;

//Q.12)WAJP to print all the possible substrings of a given String.

public class PrintPossible {
	public static void main(String[] args) {
		String str="Hello";
		int index=0;
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				System.out.println(str.substring(i,j+1));
				
			}
		}
	}

}
