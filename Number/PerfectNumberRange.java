package com.Number;
//Question:25
public class PerfectNumberRange {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=100;i++) {
			for(int j=1;j<=i/2;j++) {
		  //for(int j=1;j<i;j++) {
				if(i%j==0) {
					sum=sum+j;
				}
			}
			if(sum==i) {
				System.out.println("The Number "+i+" is Perfect Number");
			}
			sum=0;
		}
	}

}
