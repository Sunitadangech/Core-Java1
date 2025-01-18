package com.Number;
//Question:9i
public class AvgOfOddDIgit1 {
	//Another Method
		public static void main(String[] args) {
			int num=123456;
			int res=avg(num);
			System.out.println("The Avg of Odd Digits is:"+res);
		}
			public static int avg(int num1) {
				int count=0;
				int sum=0;
				
				while(num1!=0) {
					int rem=num1%10;
					if(rem%2!=0) {
						sum=sum+rem;
						count++;
					}
					num1=num1/10;
				}
				int avg=sum/count;
				return avg;
		}
}
