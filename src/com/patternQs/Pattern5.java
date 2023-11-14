package com.patternQs;

public class Pattern5 {
    public void print5(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=(n+1-i);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
