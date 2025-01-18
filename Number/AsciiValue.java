package com.Number;
import java.util.Scanner;
//Question:34
public class AsciiValue {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch=sc.next().charAt(0);
		int res=ch;
		System.out.println(res+" is the Ascii Value of "+ch);
	}

}
