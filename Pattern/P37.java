package com.Pattern;

public class P37 {
	public static void main(String[] args) 
	{
		int n=4;
		int a=1;
    	for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i>=j){//(i<=j)
					System.out.print(a++ +" ");
				}else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
	  }
	}

}
