package com.Number;
//Question:7
public class AverageValue {
	public static void main(String[] args) {
		int avg=avgNum();
		System.out.println("The avg of given number is:" +avg);
}
	
	public static int avgNum() {
		int num=12345;
		int count=0;
		int sum=0;
		while(num!=0) {
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
			count++;
		}
		int avg=sum/count;
		return avg;
	}
}

