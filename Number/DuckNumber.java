package com.Number;
//Question:36
public class DuckNumber {
	public static void main(String[] args) {
		int num=2002;
		boolean flag=false;
//		while(num>9) {
		while(num!=0) {
			int rem=num%10;
			if(rem==0) {
				flag=true;
				break;
			}
			num=num/10;
		}
		if(flag==true) {
			System.out.println("Duck Number");
		}
		else {
			System.out.println("Not a Duck Number");
		}
	}

}

