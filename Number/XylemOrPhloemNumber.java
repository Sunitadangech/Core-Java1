package com.Number;
//Question:30
public class XylemOrPhloemNumber {
	public static void main(String[] args) {
		int num=1234;
		int num1=num;
		int os=num%10;//4 //Outer Sum Value
		int is=0;//3 //5 //Inner Sum Value
		num=num/10;
		
		while(num>9) {
			int rem=num%10;//is=is+num%10
			is=is+rem;
			num=num/10;
		}
		os=os+num;
		
		if(is==os) {
			System.out.println(num1+" is a Xylem Number");
		}
		else {
			System.out.println(num1+" is a Phloem Number");
		}
	}

}
