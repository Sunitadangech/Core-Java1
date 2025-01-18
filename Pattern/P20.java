package com.Pattern;

public class P20 {
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=1;i<=n;i++){
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

		for(int i=n-1;i>=1;i--){
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
	
//OR
//class P20
//{
//	public static void main(String[] args) throws Exception
//	{
//		int n=5;
//		for(int i=1;i<=n;i++){
//			for(int j=1;j<n+i;j++){
//				if(i+j>n){
//					System.out.print("* ");
//				}else
//				{
//					System.out.print("  ");
//				}
//				Thread.sleep(150);
//			}
//			System.out.println();
//		}
//
//		for(int i=n-1;i>=1;i--){
//			for(int j=1;j<n+i;j++){
//				if(i+j>n){
//					System.out.print("* ");
//				}else
//				{
//					System.out.print("  ");
//				}
//				Thread.sleep(150);
//			}
//			System.out.println();
//		}
//	}
//}
	

	
	
	
	