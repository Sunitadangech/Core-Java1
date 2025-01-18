package com.Number;
//Question:24
public class PrimeNumberRange {
		public static void main(String[] args) {
			int count=0;
			for(int i=2;i<=100;i++) {
				for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println(i+" is a Prime Number");
			}
			count=0;
		}
	}
}
