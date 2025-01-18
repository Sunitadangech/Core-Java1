package com.Number;
//Question:21
public class StrongOrWeakNumber {
	public static void main(String[] args) {
		int num=145;
		int sum=0;
		int temp=num;
		while(num!=0) {
			int rem=num%10;
			int factorial=1;
			for(int i=1;i<=rem;i++) {
				factorial=factorial*i;
			}
			sum=sum+factorial;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("The Given Number "+temp+"=="+sum+" is Strong Number");
		}
		else {
			System.out.println("The Given Number "+temp+"=="+sum+" is Weak Nmber");
		}
	}

}
