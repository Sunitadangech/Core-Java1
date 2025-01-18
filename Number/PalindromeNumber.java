package com.Number;
//Question:14
public class PalindromeNumber {
	public static void main(String[] args) {
		int num=121;
		int temp=num;
		int rev=0;
		while(num!=0){
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(temp==rev) {
			System.out.println( temp+ " This is Palindrome");
		}
		else {
			System.out.println(temp+ "This is not Palindrome");
		}
		System.out.println(rev);
	}

}
