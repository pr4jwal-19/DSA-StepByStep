package com.collectionframework.HashSetCodes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Creating hashset from another collection

public class HashSetEx2 {
    public static void main(String[] args) {
        List<Integer> firstFive= new ArrayList<>();
        firstFive.add(1);
        firstFive.add(2);
        firstFive.add(3);
        firstFive.add(4);
        firstFive.add(5);
        System.out.println("First five list: "+firstFive);
        List<Integer> nextFive= new ArrayList<>();
        nextFive.add(6);
        nextFive.add(7);
        nextFive.add(8);
        nextFive.add(9);
        nextFive.add(10);
        Set<Integer> allNextNum= new HashSet<>(nextFive);
        allNextNum.addAll(nextFive);
        Set<Integer> tenNum= new HashSet<>(firstFive);
        tenNum.addAll(allNextNum);
        System.out.println(tenNum);
    }
}
