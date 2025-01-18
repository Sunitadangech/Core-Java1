package com.Number;
//Question:11
public class SmallestDigit {
	public static void main(String[] args) {
		int num=451263;
		int small=num%10;
		num=num/10;
		while(num!=0) {
			int rem=num%10;
			if(rem<small) {
				small=rem;
			}
			num=num/10;
		}
		System.out.println("The Smallest Digit is:"+small);
	}
}
