package com.Number;
//Question:33
public class AutomorphicNumber {
	public static void main(String[] args) {
		int num=8;
		int num1=num*num;
		boolean res=true;
		while(num!=0) {
			if(num%10==num1%10) {
				num=num/10;
				num1=num1/10;
			}
			else {
				res=false;
				break;
			}
			
		}
		if(res==true) {
			System.out.println("Automorphic");
		}
		else {
			System.out.println("Not Automoprphic");
		}
	}

}
