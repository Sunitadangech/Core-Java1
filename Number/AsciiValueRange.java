package com.Number;
import java.util.Scanner;
//Question:35
public class AsciiValueRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Char");
		char ch=sc.next().charAt(0);
		System.out.println("Enter the Last Char");
		char ch1=sc.next().charAt(0);
		
		for(int i=ch;i<=ch1;i++) {
//			System.out.println((int)ch+" is the Ascii Value of "+ch++);
			System.out.println(i+" is the Ascii Value of "+ch++);
		}
	}

}
