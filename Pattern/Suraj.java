package com.Pattern;

public class Suraj{
	public static void main(String[] args)
	{
		int n=5;
		//S
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				//if (i==1 || i==3 || i==n || i==4 && j==n || i==2 && j==1){
					if(i==1 || i==n/2+1 || i==n || i==n-1 && j==n || j<n/2 && i==2){
                    System.out.print("* ");
				}else
				{
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			//U
			for(int j=1;j<=n;j++){
				 if (j == 1 && i != n || j == n && i != n || i == n && j != 1 && j != n) {
					System.out.print("* ");
				}else
				{
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			//R
		    for(int j=1;j<=n;j++){
				 if (j==1 || i==1 && j!=n || i==n/2+1 && j < n  || (j == n && i < (n / 2 + 1) && i > 1)|| (i - j == (n / 4))) { 
					System.out.print("* ");
				}else
				{
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			//A
		    for(int j=1;j<=n;j++){
				 if(j==1 && i!=1 || j==n && i!=1 || i==n/2+1 || i==1 && j!=1 && j!=n){
					 System.out.print("* ");
				}else
				{
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			//J
		    for(int j=1;j<=n;j++){
				  if (i==1|| j==n || i == 1 && j < n || i == n && j > 1 && j < n || i == n - 1 && j == 1) {
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
	

