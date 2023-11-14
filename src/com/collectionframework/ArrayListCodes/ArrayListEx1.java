package com.collectionframework.ArrayListCodes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        //Creating ArrayList from another collection
        //1. Create ArrayList class object
        List<Integer> primeNum=new ArrayList<>();
        primeNum.add(2);
        primeNum.add(3);
        primeNum.add(5);
        primeNum.add(7);
        primeNum.add(11);
        List<Integer> num= new ArrayList<>(primeNum);
        System.out.println(num);
        List<Integer> notPrime= new ArrayList<>();
        notPrime.add(1);
        notPrime.add(4);
        notPrime.add(6);
        notPrime.add(8);
        notPrime.add(9);
        notPrime.add(10);
        num.addAll(notPrime);
        System.out.println("Unsorted List: "+num);
        Collections.sort(num);
        System.out.println("Sorted list: "+num);
    }
}
