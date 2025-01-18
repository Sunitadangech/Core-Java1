package com.Number;
//Question:12
public class LargestDigit {
	public static void main(String[] args) {
		int num;
		System.out.println("The Laregest Number is:" +largeDigit(12345));
	}
	
	public static int largeDigit(int num)
	{
		int large=num%10;
		num=num/10;
		while(num!=0) {
			int rem=num%10;
			if(rem>large) {
				large=rem;
			}
			num=num/10;
		}
		return large;
	}

}
