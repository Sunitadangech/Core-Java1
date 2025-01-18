package com.Number;
//Question:20
public class PerfectNumber {
	public static void main(String[] args) {
		int num=6;
		int sum=0;
		for(int i=1;i<=num/2;i++) {
	  //for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if(sum==num) {
			System.out.println("The Number "+num+" is Perfect Number");
		}
		else {
			System.out.println("The Number "+num+" is Not a Perfect Number");
		}
	}

}
