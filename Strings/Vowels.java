package com.Strings;

//Q.2)WAJP to count number of vowels in a given String.

public class Vowels {
	public static void main(String[] args) {
		String str="Hello World @ 1245";
		str=str.toUpperCase();
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				count++;
			}
		}
		System.out.println(count);
	}

}
