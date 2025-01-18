package com.Pattern;

public class P41 {
	public static void main(String[] args) 
	{
		int n=4;
		int a=1;
    	for(int i=n;i>=1;i--){
			for(int j=1;j<n+i;j++){
				if(j>n-i){
					System.out.print(a++ +" ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
	   }
	}

}
