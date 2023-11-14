package com.collectionframework.ArrayListCodes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        List<Integer> integers= new ArrayList<>();
        c.add("Apple");
        c.add("Mango");
        c.add("Guava");
        integers.add(2);
        integers.add(4);
        integers.add(6);
        integers.add(8);
        integers.add(8);
        integers.add(4);
        integers.add(null);
        integers.forEach(System.out::println);
        System.out.println(c);
        c.remove("Mango");
        System.out.println(c.contains("Apple"));
        System.out.println(c);
    }
}
