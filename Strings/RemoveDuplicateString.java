package com.Strings;

//Q.13)WAJP to remove duplicate characters from a given string.

public class RemoveDuplicateString {
	public static void main(String[] args) {
		String str="Hello World";
		String temp="";
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			boolean flag=false;
			
			for(int j=0;j<temp.length();j++) {
				if(temp.charAt(j)==ch) {
					flag=true;
					break;	
				}
				
			}
			if(!flag) {
				temp += ch;
			}
		}
		str=temp;
		System.out.println(str);
		
	}

}
