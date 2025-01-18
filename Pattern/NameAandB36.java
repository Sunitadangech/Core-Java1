package com.Pattern;

public class NameAandB36 {
	public static void main(String[] args) throws Exception
	{
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j==1 && i!=1 || j==n && i!=1 || i==n/2+1 || i==1 && j!=1 && j!=n){
					System.out.print("* ");
				}else
				{
					System.out.print("  ");
				}
				Thread.sleep(150);
			}
			System.out.print("  ");
			for(int j=1;j<=n;j++){
				if(j==1 || i==1 && j!=n || i==n/2+1 && j!=n || j==n && i!=1 && i!=n && i!=n/2+1 || i==n && j!=n){
					System.out.print("* ");
				}else
				{
					System.out.print("  ");
				}
				Thread.sleep(150);
			}
			System.out.println();
		
		}
	}

}
