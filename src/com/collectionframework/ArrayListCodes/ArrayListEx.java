package com.collectionframework.ArrayListCodes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        List<Integer> roll= new ArrayList<>(5);
        list.add("Element1");
        list.add("Element2");
        list.add("Element2");
        list.add("Element3");
        list.add(null);
        System.out.println(list);
        System.out.println(list.get(1));
        Scanner inp= new Scanner(System.in);

        for (int i=0;i<10;i++){
            int num= inp.nextInt();
            roll.add(num);
        }
        System.out.println(roll);

    }
}
