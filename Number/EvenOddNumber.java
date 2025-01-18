package com.Number;
import java.util.Scanner;
//38)
public class EvenOddNumber {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter any number:");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        if(n%2==0)
        {
           System.out.print(" Even number");
        }
        else
        {
           System.out.print(" Odd number");
        }


    }
}
