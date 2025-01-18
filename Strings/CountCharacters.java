package com.Strings;

//Q.9)WAJP to get the count of characters specifies present inside a given String.

public class CountCharacters {
	public static void main(String[] args) {
		String str="Java is a Programming Language which supports OOP";
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == ' ') {
			count++;
			}
		}
		System.out.println(count);
	}

}
