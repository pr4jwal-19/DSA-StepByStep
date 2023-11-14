package com.patternQs;

public class Pattern6 {
    public void print6(int n){
        for (int i=1;i<=n;i++){
            for (int space=1;space<=(n-i);space++){
                System.out.print(" ");
            }
            for (int star=1;star<=(2*i-1);star++){
                System.out.print("*");
            }
            for (int space=1;space<=(n-i);space++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
