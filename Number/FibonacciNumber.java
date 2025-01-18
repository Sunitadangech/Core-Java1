package com.Number;
//Question:28
public class FibonacciNumber {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int sum=0;
//		int count=0;
		System.out.print("Fibonacci Series:"+ a +", "+b);
		for(int i=2;i<10;i++) {
//		for(int i=2;i<count;i++) {
			sum=a+b;
			a=b;
			b=sum;
			System.out.print(", "+sum);
		}
	}

}
