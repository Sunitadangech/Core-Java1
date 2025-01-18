package com.pratice;
import java.util.Scanner;
public class ArmstrongNumber{
	public static void main(String args[]) {
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
			res=(rem*rem*rem)+res;
			num=num/10;
		}
		if(num1==res) {
			System.out.println("Given Number is Armstrong");
		}
		else {
			System.out.println("Given Number is Not Armstrong");
		}
	}
}