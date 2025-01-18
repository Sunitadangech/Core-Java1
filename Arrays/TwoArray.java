package com.Arrays;
//Q.48)Two arryas are given start=[0,6,8,12,20] and end=[4,8,10,16,24] as a Input and then output is x=[4,10,16] and y=[6,12,20]

import java.util.ArrayList;
import java.util.List;
public class TwoArray {
    public static void main(String[] args) {
        int[] start = {0, 6, 8, 12, 20};
        int[] end = {4, 8, 10, 16, 24};
        
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();

        // Process the arrays
        for (int i = 0; i < start.length - 1; i++) {
            if (start[i + 1] > end[i]) {
                x.add(end[i]);
                y.add(start[i + 1]);
            }
        }

        // Print the results
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}

