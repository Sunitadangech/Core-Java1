package com.Strings;

//Q.11)WAJP to check whether a given String is Palindrome.if the Given String is palindrome print true other wise print false.

public class PalindromeString {
	public static void main(String[] args) 
	{
		String str="NAYAN";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
		System.out.println(rev.equals(str));
	}
	

}
