package com.Number;
//Question:26
public class NeonNumber {
	public static void main(String[] args) {
		int num=9;
		int num1=num*num;
		int sum=0;
		
		while(num1!=0) {
			sum+=num1%10;
			num1=num1/10;
		}
		if(num==sum) {
			System.out.println("The Given Number "+num+" is Neon Number");
		}
		else {
			System.out.println("The Given Number "+num+" is Not a Neon Number");
		}
	}

}
