package com.patternQs;

public class Pattern8 {
    public void print8(int n){
        for (int row=1;row<=(2*n-1);row++){
            int stars=row;
            if (stars>n) stars=2*n-row;
            for (int col=1;col<=stars;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
