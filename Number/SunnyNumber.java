package com.Number;
//Question://29
public class SunnyNumber {
	public static void main(String[] args) {
		int num=8;
		int num1=num+1;
		int res=0;
		for(int i=1;res<=num1;i++) {
				res=i*i;
				if(res==num1){
					break;
			}
		}	
		if(res==num1) {
			System.out.println(num+" is a Sunny Number");
		}
		else {
			System.out.println(num+" is Not a Sunny Number");
		}
			
	}

}
