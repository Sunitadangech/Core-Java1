package com.pratice;

import java.util.Scanner;
public class ReverseNumber {
	public static void main(String[] args) {
		int num;
		int rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number:");
		num=sc.nextInt();
		while(num>0) {
			rev=num%10;
			System.out.print(rev);
			num=num/10;
		}	
	}

}
//import java.util.Scanner;
//public class ReverseNumber {
//	public static void main(String[] args) {
//		int n;
//		int rev=0;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter The Number");
//		n=sc.nextInt();
//		while(n!=0) {
//			int rem=n%10;
//			rev=rev*10+rem;
//			n=n/10;
//		}
//		System.out.println(rev);
//	}
//
//}
