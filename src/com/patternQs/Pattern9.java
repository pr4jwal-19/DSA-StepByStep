package com.patternQs;

public class Pattern9 {
    public void print9(int n){
        int start;
        for (int i=1;i<=n;i++){
            if (i%2==0) start=1;
            else start=0;
            for (int j=1;j<=i;j++){
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
    }
}
