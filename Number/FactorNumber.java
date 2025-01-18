package com.Number;
//Question:15
public class FactorNumber {
	public static void main(String[] args) {
		int num=8;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i+ " is Divided by 8" +num);
			}
		}
		System.out.println(num+ " is a Factor of " +num);
	}

}
