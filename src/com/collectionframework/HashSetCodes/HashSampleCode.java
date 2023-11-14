package com.collectionframework.HashSetCodes;

import java.util.HashSet;
import java.util.Set;

public class HashSampleCode {
    public static void main(String[] args) {
        //Creating hashsets
        Set<String> proLang= new HashSet<>();
        proLang.add("C");
        proLang.add("C++");
        proLang.add("C#");
        proLang.add(".net");
        proLang.add("Java");
        proLang.add("Python");
        proLang.add("Ruby");
        proLang.add("Kotlin");
        //No duplicates allowed-? if used it overrides to the latest element
        //proLang.add("Kotlin");
        System.out.println("Unordered Collection: "+proLang);

        Set<Integer> firstFiveEvenNum= new HashSet<>();
        firstFiveEvenNum.add(2);
        firstFiveEvenNum.add(4);
        firstFiveEvenNum.add(6);
        firstFiveEvenNum.add(8);
        firstFiveEvenNum.add(10);
        Set<Integer> firstTenEvenNum= new HashSet<>(firstFiveEvenNum);
        firstTenEvenNum.addAll(firstFiveEvenNum);
        System.out.println(firstTenEvenNum);
        Set<Integer> nextEvenNum= new HashSet<>();
        nextEvenNum.add(12);
        nextEvenNum.add(14);
        nextEvenNum.add(16);
        nextEvenNum.add(18);
        nextEvenNum.add(20);
        firstTenEvenNum.addAll(nextEvenNum);
        System.out.println("Updated set of 10 even num: "+firstTenEvenNum);
    }
}
