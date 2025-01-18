package com.Arrays;
/*
 * Q.44)Write a Java Program to print first n Perfect numbers.
*/
//import java.util.Scanner;
public class PrintFirstNPerfect {
    public static void main(String[] args){
       // Scanner s = new Scanner(System.in);
        int count =4;

        if(count>=1 && count<=4){
            //System.out.println("Enter a number: ");
            int n = 1;
            while (count>0) {
                int sum=0;
    
                for(int i=1;i<=n/2;i++){
                    if(n%i==0){
                        sum+=i;
                    }
                    
                }
                if(sum==n){
                    System.out.println(n);
                    count--;
                }
                n++;
            }
        }
        
    }

}
    

