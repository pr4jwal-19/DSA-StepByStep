package com.collectionframework.HashmapCodes;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        //mapping numbers to string
        Map<String,Integer> map1= new HashMap<>();
        //adding key value pair to map - like dictionary
        map1.put("First",1);
        map1.put("Second",2);
        map1.put("Third",3);
        map1.put("Fourth",4);
        map1.put("Fifth",5);
        map1.put(null,3);
        map1.put(null,6);
        System.out.println("Mapping unordered: "+map1);
        map1.put("Sixth",5);
        map1.put("Seventh",5);
        map1.put("Eighth",5);
        System.out.println("Key's should be unique" +
                " but values can repeat: ");
        System.out.println(map1);
        //to check if hashmap is empty
        System.out.println("if empty: "+map1.isEmpty());
        //to find size
        System.out.println("Size: "+map1.size());
        System.out.println(map1.get("First"));
        map1.remove("Second");
        System.out.println(map1);
        System.out.println("Size: "+map1.size());
        //to check if certain key is present
        if (map1.containsKey("Fourth")){
            System.out.println("Contains key");
        } else System.out.println("Not present");
        //to check if certain value is present
        if (map1.containsValue(5)){
            System.out.println("Contains 5");
        } else System.out.println("not there");
        //get value by key
        Integer v1= map1.get("Fifth");
        System.out.println("Getting value from key: "+v1);
        //getting key-value pair
        map1.remove("Seventh");
        System.out.println("After removing a key- Seventh: "+map1);
        //get only keys from hashmap
        var keyset=map1.keySet();
        System.out.println("Keys available: "+keyset);
        // get all only values
        var values=map1.values();
        System.out.println("Values available: "+values);
    }
}
