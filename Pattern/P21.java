package com.Pattern;

public class P21 {
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=n;i>=1;i--){
			for(int j=1;j<n+i;j++){
				if(i+j>n){
					System.out.print("* ");
				}else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		for(int i=2;i<=n;i++){
			for(int j=1;j<n+i;j++){
				if(i+j>n){
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
