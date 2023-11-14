package com.collectionframework.LinkedListCodes;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx3 {
    public static void main(String[] args) {
        LinkedList<String> proLang= new LinkedList<>();
        proLang.add("C");
        proLang.add("C++");
        proLang.add("C#");
        proLang.add("Java");
        proLang.add("Python");
        proLang.add(".net");
        proLang.add(".net");
        proLang.add("Rust");
        boolean res= proLang.contains("C++");
        System.out.println("Game development: "+res);
        //index of first occurrence of an elem
        int index= proLang.indexOf("Python");
        System.out.println("Python Popularity: "+(index+1));
        int lastOcc= proLang.lastIndexOf(".net");
        System.out.println("last occ: "+lastOcc);
        // iterator
        Iterator<String> iterator=proLang.iterator();
        while (iterator.hasNext()){
            String lang= iterator.next();
            System.out.println(lang);
        }
        //forEach Java 8
        proLang.forEach(element->{
            System.out.println(element);
        });
        //for-each adv loop
        for (String elem:proLang) {
            System.out.println(elem);
        }

    }
}
