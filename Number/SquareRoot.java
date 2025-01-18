package com.Number;
//Question:27 SquareRoot or Perfect SquareRoot
public class SquareRoot {
	public static void main(String[] args) {
		int num=120;
		int sqrt=0;
		int res=1;
		
		for(int i=1;i<=num;i++) {
			if(i*i==num) {
				sqrt=i;
				res=i*i;
				break;
			}
		}
		if(num==res) {
		System.out.println(sqrt+" is a SquareRoot of "+num);
		}
		else {
			System.out.println("Not a Perfect Square");
		}
	}

}


