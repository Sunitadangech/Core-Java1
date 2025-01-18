package com.Number;
//Q.31)WAJP to check whether a given number is ArmStrong Number.
/*
* ArmStrong Number
* 153 
* No of digits = 3
* sum = 1^3 + 5^3 + 3^3
*/
public class ArmstrongNumber {
public static void main(String[] args) {
  int num=153;
  int num1 =num;
  int num2 = num;
  int count = 0;
  int sum =0;

  while (num>0) {
      count++;
      num=num/10;
  }
  while (num1>0) {
      int d = num1%10;
      int res =1;
      for(int i =1;i<=count;i++){
          res=res*d;
      }
      sum=res+sum;
      num1=num1/10;
  }
  if(sum==num2){
	  System.out.println(num2+" is a Armstrong Number");
  }
  else {
	  System.out.println(num2+ " is Not a Armstrong Number");
  }
}    
}
