package com.pratice;
import java.util.Scanner;
public class PrimeNumber{
	public static void main(String[] args) {
		int num;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number:");
		num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Given Number is Prime");
		}
		else {
			System.out.println("Given Number is Not Prime");
		}
	}
}