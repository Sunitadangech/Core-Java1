package com.Pattern;

public class P32i33 {
	public static void main(String[] args) throws Exception
	{
		int n=5;
    	for(int i=1;i<n*2;i++){
			for(int j=1;j<=n;j++){
				if(i>=j && i+j<=n+1 || i+j>=n+1 && i<=j){
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
