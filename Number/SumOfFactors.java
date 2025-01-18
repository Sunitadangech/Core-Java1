package com.Number;
//Question:16(Test 1)
public class SumOfFactors {
	public static void main(String[] args) {
		int num=8;
		int res=returnSumOfFactors(num);
		System.out.println("Sum Of Fcators is: "+res);
	}
	
	public static int returnSumOfFactors(int num1) {
		int sum=0;
		for(int i=1;i<=num1;i++) {
			if(num1%i==0) {
				sum=sum+i;
			}
		}
		return sum;
	}

}
