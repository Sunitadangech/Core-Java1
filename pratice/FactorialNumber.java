package com.pratice;
import java.util.Scanner;
public class FactorialNumber {
	public static void main(String[] args) {
		int num;
		int factorial=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number:");
		num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			factorial=factorial*i;
		}
		System.out.println(factorial);
		
	}

}
