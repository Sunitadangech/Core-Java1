package com.Number;
//Question:5
public class AverageDigit {
	public static void main(String[] args) {
		int num=123;
		int count=0;
		int sum=0;
		while(num!=0) {
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
			count++;
		}
		int avg=sum/count;
		System.out.println("The Avg of Digit is:"+avg);
	}

}
