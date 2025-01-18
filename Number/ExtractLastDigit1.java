package com.Number;
//Question:1i
class ExtractLastDigit1
{
	public static void main(String[] args) 
	{
		//Static Method
		int n=12345;
		int result=lastDigit(n);
		System.out.println("The Last Digit is:" +result);
	}
	//Another method call
	public static int lastDigit(int a){
		return a%10;
		
	}
}

////Non static method/create one object
//class ExtractLastDigit1
//{
//	public static void main(String[] args) 
//	{
//		int n=12345;
//		ExtractLastDigit1 eld=new ExtractLastDigit1();
//		int result=eld.lastDigit(n);
//		System.out.println(result);
//	}
//	//Another method call
//	public int  lastDigit(int a){
//		return a%10;
//		
//	}
//}
