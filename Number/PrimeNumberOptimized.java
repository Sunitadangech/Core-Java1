package com.Number;
//Question:23
public class PrimeNumberOptimized {
		public static void main(String[] args) {
			int num=7;
			int count=0;
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					count++;
					break;
				}
			}
			if(num==1) {
				System.out.println(num+" is Not a Prime Number");
			}
			else if(count==0) {
				System.out.println(num+" is a Prime Number");
			}
			else {
				System.out.println(num+" is Not a Prime Number");
		}
	}
}
