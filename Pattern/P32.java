package com.Pattern;

public class P32 {
	public static void main(String[] args) 
	{
		int n=5;
    	for(int i=1;i<n*2;i++){
			for(int j=1;j<=n;j++){
				if(i>=j && i+j<=n*2){
					System.out.print("* ");
				}else
				{
					System.out.print("  ");
				}
			}
			for(int j=2;j<=n;j++){
				if(i+j>=n+1 && i-j<=n-1){
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
