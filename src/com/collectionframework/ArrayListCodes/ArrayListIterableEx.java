package com.collectionframework.ArrayListCodes;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListIterableEx {
    public static void main(String[] args) {
        List<String> courses = Arrays.asList("Java", "Spring", "Hibernate", "MySQL", "MongoDB");
        //basic for loop iteration
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i));
        }
        //enhanced for-loop
        for (String course : courses) {
            System.out.println(course);
        }
        //for=>iterator
        for (Iterator<String> iterator=courses.iterator();iterator.hasNext();){
            String course= iterator.next();
            System.out.println(course);
        }
        //while=>iterator
        Iterator<String> it=courses.iterator();
        while (it.hasNext()){
            String course= it.next();
            System.out.println(course);
        }
        //Java 8: Stream with Lambda example
        //courses.stream().forEach(course-> System.out.println(course));
        courses.forEach(System.out::println);

    }
}
