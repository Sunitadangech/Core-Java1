package com.Arrays;

import java.util.Set;

import java.util.HashSet;
//Q.20)WAJP to print the occurance of each character in a given string 
public class OccuranceCharacterString {
		public static void main(String[] args) 
		{
			String str="Hello World";
			Set set=new HashSet();
			for(int i=0;i<str.length();i++)
			{
				int cnt=0;
				if(!set.contains(str.charAt(i))) {
					for(int j=0;j<str.length();j++) {
						if(str.charAt(i)==str.charAt(j)) {
							cnt++;
						}
						set.add(str.charAt(i));
						System.out.println(str.charAt(i)+ "=" +cnt);
					}
				}
			}
		}
 } 
