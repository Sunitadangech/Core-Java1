package com.Number;
//Question:3i
import java.util.Scanner;
public class CountDigits1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
				System.out.println("Enter the Number:");
		int num=s.nextInt();
		int res=count(num);
		System.out.println("Number of count is:"+res);
		}
		public static int count(int num1) {
		int count=0;
		while(num1!=0) {
			count++;
			num1=num1/10;
		} 
		return count;
		
	}

}
