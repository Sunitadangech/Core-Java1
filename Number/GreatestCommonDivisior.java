package com.Number;
//Question:37
public class GreatestCommonDivisior {
	public static void main(String[] args) {
		int num1=6;
		int num2=2;
		int gcd=0;
		for(int i=1;i<=num1 && i<=num2;i++) {
			if(num1%i==0 && num2%i==0) {
				gcd=i;
			}
		}
		System.out.println("Greatest Common Divisior is "+gcd);
	}

}
