package com.Arrays;
import java.util.LinkedHashSet;
//Q.21)WAJP to remove duplicate characters from a given string 
public class RemoveDuplicateCharacter {
		public static void main(String[] args) 
		{
			String s="Hello World";
			// LinkedHashSet<Character>s1=new LinkedHashSet<Character>();
			for(int i=1;i<s.length();i++)
			{
				int count = 1;
				for(int j=i-1;j>=0;j--)
				{
					if(s.charAt(j)==s.charAt(i))
					{
					count++;
					if(count>1) {
						break;
					}
				}		
		    }
				if(count>1) {
					System.out.println(s.charAt(i));
				}
	    }
     } 
}



