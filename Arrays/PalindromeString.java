package com.Arrays;

//Q.28)WAJP to check whether given string is palindrom string 
public class PalindromeString {
		public static void main(String[] args) 
		{
			String s="NAYAN";
			String rev="";
			for(int i=s.length()-1;i>=0;i--)
			{
				rev+=s.charAt(i);
			}
			System.out.println(rev.equals(s));
		}
}
