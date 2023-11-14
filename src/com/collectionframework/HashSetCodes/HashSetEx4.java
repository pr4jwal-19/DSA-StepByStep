package com.collectionframework.HashSetCodes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx4 {
    public static void main(String[] args) {
        //Iterating over hashset
        Set<String> courses= new HashSet<>();
        courses.add("C#");
        courses.add(".net");
        courses.add("Kotlin");
        courses.add("JavaFX");
        courses.add("SpringBoot");
        //enhanced for loop
        System.out.println("Enhanced: ");
        for (String course:courses) {
            System.out.println(course);
        }
        //basic loop with iterator
        System.out.println("Iterator: ");
        for (Iterator<String> iterator= courses.iterator(); iterator.hasNext();){
            String s= iterator.next();
            System.out.println(s);
        }
        //while loop with iterator
        Iterator<String> iterator= courses.iterator();
        System.out.println("While loop: ");
        while (iterator.hasNext()){
            String s= iterator.next();
            System.out.println(s);
        }
        //forEach
        System.out.println("forEach Java 8: ");
        courses.forEach(System.out::println);
        //java stream api
        System.out.println("Using Stream and Filtering: ");
        courses.stream().filter(course->!"JavaFX".equals(course))
                .forEach(System.out::println);
    }
}

