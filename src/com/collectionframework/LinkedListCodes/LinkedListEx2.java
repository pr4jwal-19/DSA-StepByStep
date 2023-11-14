package com.collectionframework.LinkedListCodes;

import java.util.LinkedList;

// How to get first element from LL
// How to get last element from LL
// How to get element at a given index from LL
// How to get all elements from LL
public class LinkedListEx2 {
    public static void main(String[] args) {
        //retrieving elem from a linked-list
        LinkedList<String> teams= new LinkedList<>();
        teams.add("India");
        teams.add("South Africa");
        teams.add("Australia");
        teams.add("NewZealand");
        teams.add("Pakistan");
        teams.add("Afghanistan");
        teams.add("England");
        teams.add("Bangladesh");
        teams.add("Srilanka");
        teams.add("Netherlands");
        //1.
        String fpos= teams.getFirst();
        System.out.println("1."+fpos);
        //2.
        String lpos= teams.getLast();
        System.out.println("10."+lpos);
        //3.
        String nqFirst= teams.get(4);
        System.out.println("5."+nqFirst);
        //4.
        for (String team:teams) {
            System.out.println((teams.indexOf(team)+1)+" "+team);
        }
        //5. remove elements from ll
        String bannedTeam= teams.remove(8);
        System.out.println("Banned by ICC: "+bannedTeam);
        System.out.println(teams);
        //6. remove first elem -> removeFirst()
        //7. remove last elem -> removeLast()
        //8. clear ll -> clear()

    }
}
