package com.Number;
//Question:27i
public class SquareRoot1 {
	public static void main(String[] args) {
		int num=121;
		int sqrt=0;
		int res=1;//1//4//9//16//25//36//49//64//81
		
		for(int i=1;res<=num;i++) {
			res=i*i;
			if(i*i==num) {
				sqrt=i;
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

