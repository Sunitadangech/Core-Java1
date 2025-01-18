package com.Pattern;

public class P30 {
	public static void main(String[] args) 
	{
		int n=5;
//		for(int i=1;i<=n*2-1;i++){
    	for(int i=1;i<n*2;i++){
//			for(int j=1;j<=n;j++){
			for(int j=1;j<n+i;j++){
				if(i>=j && i+j<=n*2){
					System.out.print("* ");
				}else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
	  }
	}

}
