package com.Number;
//Question:18
public class SwapTwoNumberThirdVariable {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("Before Swapping : "+"a="+a + " & "+"b="+b);
		//Logic To Swap
		a=a+b;//10+20==>30
		b=a-b;//30-20==>10
		a=a-b;//30-10==>20
		System.out.println("After Swapping : "+"a="+a + " & "+"b="+b);
		
	}

}
