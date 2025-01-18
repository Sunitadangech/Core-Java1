package com.Strings;

//Q.3)WAJP to calculate the Sum of Digits in a Given String.

public class CalculateDigitsString {
	public static void main(String[] args) {
		String str="Hello World @ 1245";
		int sum=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch >= '0' && ch <= '9') {
				sum += (ch - '0');
			}
		}
		System.out.println(sum);
	}

}
