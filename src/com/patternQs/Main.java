package com.patternQs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pattern1 pattern1= new Pattern1();
        Pattern2 pattern2= new Pattern2();
        Pattern3 pattern3= new Pattern3();
        Pattern4 pattern4= new Pattern4();
        Pattern5 pattern5= new Pattern5();
        Pattern6 pattern6= new Pattern6();
        Pattern7 pattern7= new Pattern7();
        Pattern8 pattern8= new Pattern8();
        Pattern9 pattern9= new Pattern9();
        System.out.println("Enter the value of n(rows): ");
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        /*
        pattern1.print1(n);
        pattern2.print2(n);
        pattern3.print3(n);
        pattern4.print4(n);
        pattern5.print5(n);
        pattern6.print6(n);
        Combination of 6+7
        pattern6.print6(n);
        pattern7.print7(n);
        pattern8.print8(n);
        */
        pattern9.print9(n);
    }
}
