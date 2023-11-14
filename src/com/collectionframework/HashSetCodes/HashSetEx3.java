package com.collectionframework.HashSetCodes;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx3 {
    public static void main(String[] args) {
        Set<Integer> num= new HashSet<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        num.add(7);
        // using remove method
        int numToBeRemoved=3;
        if(num.remove(numToBeRemoved)){
            System.out.println("Number "+numToBeRemoved+" removed");
            System.out.println(num);
        }
        //remove all
        Set<Integer> evenNum= new HashSet<>();
        evenNum.add(2);
        evenNum.add(4);
        evenNum.add(6);
        num.removeAll(evenNum);
        System.out.println("After removing even num: "+num);
        //clear
        num.clear();
        System.out.println("After clear: "+num);
    }
}
