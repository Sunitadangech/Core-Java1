package com.Number;
//Question:9
public class AvgOfOddDigit {
	public static void main(String[] args) {
		int num=123456;
		int count=0;
		int sum=0;
		
		while(num!=0) {
			int rem=num%10;
			if(rem%2!=0) {
				sum=sum+rem;
				count++;
			}
			num=num/10;
		}
		int avg=sum/count;
		System.out.println("The Avg of Odd Digits is:"+avg);
	} 

}


