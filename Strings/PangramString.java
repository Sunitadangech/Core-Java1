package com.Strings;

//Q.15)WAJP to check whether the given String is pangram String

public class PangramString {
	public static void main(String[] args) {
		String str="ABCDefffffffghiJKLMNopqrSTUVwxyZ";
		str = str.toLowerCase();
		int count = 0;
		for(char ch='a';ch<='z';ch++) {
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)==ch) {
					count++;
					break;
				}
			}
		}
		if(count==26) {
			System.out.println("Given String is pangram String");
		}
		else {
			System.out.println("Given String is not pangram String");
		}
	}

}
