package com.Pattern;

public class P39 {
	public static void main(String[] args) 
	{
		int n=5;
		int a=1;
		char ch='A';
    	for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j>n-i){
					if(i%2==0){
					System.out.print(a++ +" ");
				}else
				{
					System.out.print(ch++ +"  ");
				}
			}
			else{
			System.out.print("  ");
			}
	  }
	  System.out.println();
	}
  }

}
