package com.Arrays;

//Q.46)WAJP To print first n elements of fibonacci series 
public class FibonacciFirstNElement {
		public static void main(String[] args) 
		{ 
			int n=10;
			int a=0;
			int b=1;
			System.out.print(a+" "+b+" ");
			for(int i=1;i<=n-2;i++)
			{
				int c=a+b;
				System.out.print(c+" ");
				a=b;
				b=c;
				
		}
	}
}
