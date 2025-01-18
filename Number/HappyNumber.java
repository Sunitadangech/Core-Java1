package com.Number;
//Question:32
public class HappyNumber {
	public static void main(String[] args) {
		int num=13;
		int res=num;
		while(res!=1 && res!=4){
		res=happy(res);
	}
		if(res==1) {
			System.out.println(num+" is a Happy Number "+res);
		}
		else if(res==4) {
			System.out.println(num+" is Not a Happy Number "+res);
		}
	}
	public static int happy(int num) {
		int sum=0;
		while(num!=0) {
			int rem=num%10;
			sum=sum+rem*rem;
			num=num/10;
		}
		return sum;
	}
}
