package com.Arrays;
import java.util.Scanner;
//Q.13)WAJP to check the given Array is palindrome or not.
public class PalindromeArray {
	public static void main(String[] args) 
	{	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size of an array:");
		int size=s.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		// Check if the array is a palindrome
        boolean Palindrome = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
            	
                Palindrome = false;
                break;
            }
        }
        if (Palindrome) {
            System.out.println("The given array is a palindrome.");
        } else {
            System.out.println("The given array is not a palindrome.");
        }
        
        s.close();
    }
}