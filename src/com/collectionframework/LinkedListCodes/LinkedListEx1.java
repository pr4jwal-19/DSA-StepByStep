package com.collectionframework.LinkedListCodes;

import java.util.LinkedList;

//Implements List and Deque
// add(), add(index,value), addFirst(), addLast()
//addFirst and addLast comes from Deque interface
public class LinkedListEx1 {
    public static void main(String[] args) {
        //Creating LinkedList
        LinkedList<String> fruits= new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        System.out.println(fruits);
        // adding at specific position
        fruits.add(2,"Orange");
        fruits.add(4,"Guava");
        System.out.println("After adding at pos 2 & 4: "+fruits);
        // adding at the beginning
        fruits.addFirst("Chikoo");
        // adding at last
        fruits.addLast("Sitafal");
        System.out.println("After adding at first and last pos: "+fruits);
    }
}
