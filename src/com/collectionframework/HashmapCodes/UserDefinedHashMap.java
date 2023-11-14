package com.collectionframework.HashmapCodes;

import java.util.HashMap;
import java.util.Map;

public class UserDefinedHashMap {
    public static void main(String[] args) {
        Map<Integer, Student> studentHashMap= new HashMap<>();
        studentHashMap.put(1,new Student("Prajwal","Nakure"));
        studentHashMap.put(2,new Student("Tony","Stark"));
        studentHashMap.put(3,new Student("Aegon","Targareyen"));
        System.out.println(studentHashMap.keySet());
        System.out.println(studentHashMap.values());
    }
}
