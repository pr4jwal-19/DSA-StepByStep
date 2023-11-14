package com.collectionframework.ArrayListCodes;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {
    public static void main(String[] args) {
        //1.isEmpty() method
        //2.size-> size() method
        //3.accessing element using index -> get() method
        //4.modify at particular index -> set() method
        //5. remove() , removeAll() & clear() methods
        List<String> topPL = new ArrayList<>();
        //System.out.println(topPL.isEmpty());
        topPL.add("C");
        topPL.add("C++");
        topPL.add("C#");
        topPL.add("Java");
        topPL.add("Python");
        System.out.println("Here are the top "+topPL.size()+" Programming Languages in the world: \n"+topPL);
        String bestPL= topPL.get(3);
        String sBestPL= topPL.get(4);
        System.out.println("Best Programming Language: "+bestPL);
        System.out.println("Second Best Programming Language: "+sBestPL);
        topPL.set(0,".net");
        System.out.println("Updated top programming languages: "+topPL);
        topPL.remove(".net");
        topPL.remove(2);
        System.out.println(topPL);
        List<String> bestPl= new ArrayList<>(topPL);
        //bestPl.addAll(topPL);
        System.out.println(bestPl);
        bestPl.add("C");
        bestPl.add("Rust");
        bestPl.removeAll(topPL);
        System.out.println(bestPl);
        topPL.clear();
        bestPl.clear();
        System.out.println(topPL);
        System.out.println(bestPl);
    }
}
