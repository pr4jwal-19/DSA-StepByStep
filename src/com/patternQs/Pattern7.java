package com.patternQs;

public class Pattern7 {
    public void print7(int n){
        for (int i=1;i<=n;i++){
            for (int space=1;space<=(i-1);space++){
                System.out.print(" ");
            }
            for (int star=1;star<=2*n-(2*i-1);star++){
                System.out.print("*");
            }
            for (int space=1;space<=(i-1);space++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
