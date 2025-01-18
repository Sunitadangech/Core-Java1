package com.Strings;

//Q.10)WAJP to reverse a given String.

public class ReverseString {
	public static void main(String[] args) {
		String str="Hello World";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev += str.charAt(i);
		}
		System.out.println(rev);
	}

}


//public class ReverseString {
//	public static void main(String[] args) {
////		String str="Hello world";
////		StringBuffer strBuffer = new StringBuffer(str);
//		StringBuffer strBuffer = new StringBuffer("Hello World");
//		System.out.println(strBuffer);
//		strBuffer.reverse();
//		System.out.println(strBuffer);
//	}
//
//}


