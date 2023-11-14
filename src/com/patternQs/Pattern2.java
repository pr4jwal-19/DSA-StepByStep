package com.patternQs;

public class Pattern2 {
    public void print2(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("0*0"+" ");
            }
            System.out.println();
        }
    }
}
