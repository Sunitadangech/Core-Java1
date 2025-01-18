package com.Strings;

//Q.4)WAJP to count the number of Characters present inside each and every Word in a given String separated by commas.Print the Word in given String along with the count of characters contains.

public class CountNumberCharacters {
	public static void main(String[] args) {
		String str="Apple,Ball,Cat,Dog,Elephant,Flower";
		String[] arr=str.split(",");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" = "+arr[i].length());
			}
	}
}
