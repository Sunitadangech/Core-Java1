package com.pratice;
import java.util.Scanner;
public class FibonacciNumber {
	public static void main(String[] args) {
		int num;
		int a=0;
		int b=1;
		int sum;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Number:");
		num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.print(a+", ");
			sum=a+b;
			a=b;
			b=sum;
		}
	}

}
