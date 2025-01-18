package com.pratice;
import java.util.Scanner;
public class NaturalNumber{
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number:");
		num=sc.nextInt();
		if(num>0) {
			System.out.println("Given Number is Natural");
		}
		else {
			System.out.println("Given Number is Not Natural");
		}
		
	}
}