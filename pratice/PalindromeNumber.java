package com.pratice;
import java.util.Scanner;
public class PalindromeNumber {
	public static void main(String[] args) {
		int num;
		int num1;
		int rem;
		int res=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number:");
		num=sc.nextInt();
		num1=num;
		while(num>0) {
			rem=num%10;
			res=res*10+rem;
			num=num/10;
		}
		if(num1==res) {
			System.out.println("Given Number is Palindrome");
		}
		else {
			System.out.println("Givenm Number is Not Palindrome");
		}
	}

}
