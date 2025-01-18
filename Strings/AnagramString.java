package com.Strings;

import java.util.Arrays;

//Q.14)WAJP to check whether gievn two string are anagram of each other.

public class AnagramString {
	public static void main(String[] args) {
		String str1="silent";
		String str2="listen";
		
		if(str1.length() == str2.length()) {
			char [] arr1 = str1.toCharArray();
			char [] arr2 = str2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if(Arrays.equals(arr1, arr2)) {
				System.out.println("Given 2 strings are anagram of each other");
			}
			else {
				System.out.println("Given 2 strings are not anagram of each other");
				
			}
		}
	}

}
