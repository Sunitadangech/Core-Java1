package com.Arrays;

import java.util.*;
//Q.43)WAJP To print Duplicate characters present inside the given string

public class DuplicateCharacter {
	public static void main(String[] args) 
	{
		String s="Hello world";
		for(int i=1;i<s.length();i++)
		{
			int count=1;
			for(int j=i-1;j>=0;j--)
			{
				if(s.charAt(j)==s.charAt(i))
				{
					count++;
					if(count>1)
				 {
						break;
				 }
			    }
			}
			if(count>1)
			{
				System.out.println(s.charAt(i));
		
	        }
       }
   }
}
