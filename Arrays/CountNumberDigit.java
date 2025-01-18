package com.Arrays;
//Q.41)WAJP To count the number of digits in a given number 
class CountNumberDigit {
	public static void main(String[] args) 
	{
		int num=1234;
		int count=0;
		while(num!=0)
		{
			num /=10;
			count++;
		}
		System.out.println(count);
	}
}