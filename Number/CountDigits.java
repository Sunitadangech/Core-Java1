package com.Number;
//Question:3
public class CountDigits {
	public static void main(String[] args) {
		int count=0;
		int num=54321;
		while(num!=0) {
			count++;
			num=num/10;
		}
		System.out.println("Number of Count is:"+count);
	}

}
