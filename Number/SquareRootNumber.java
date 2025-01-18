package com.Number;
//Q.39)WAJP to identify the Squareroot of given numbers.
//import java.Math.*;
public class SquareRootNumber {
	public static void main(String[] args) {
		int num=121;
		boolean flag=false;
		for(int i=1;i*i<=num;i++) {
			if(i*i==num) {
				System.out.println(i);
				flag=true;
				break;
			}
		}if(!flag) {
			System.out.println(num+"is not a perfect square no");
		}
		System.out.println(Math.sqrt(num));
	}

}
