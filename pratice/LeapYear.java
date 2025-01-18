package com.pratice;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number:");
		num=sc.nextInt();
		if(num%100==0 && num%400==0 || num%100!=0 && num%4==0) {
			System.out.println("This is Leap Year");
		}
		else {
			System.out.println("This is Not Leap Year");
		}
		
	}

}
