package com.collectionframework.HashmapCodes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {
    public static void main(String[] args) {
        // Iterating over maps
        Map<String,Double> auctionTeamBudget=new HashMap<>();
        auctionTeamBudget.put("MI",590000000d);
        auctionTeamBudget.put("CSK",700000000d);
        auctionTeamBudget.put("RCB",560000000d);
        auctionTeamBudget.put("GT",340000000d);
        auctionTeamBudget.put("RR",790000000d);
        auctionTeamBudget.put("DC",890000000d);
        auctionTeamBudget.put("SRH",840000000d);
        auctionTeamBudget.put("LSG",710000000d);
        auctionTeamBudget.put("KKR",570000000d);
        auctionTeamBudget.put("PBKS",680000000d);
        var keys= auctionTeamBudget.keySet();
        System.out.println("-- Teams --\n"+keys);
        var values= auctionTeamBudget.values();
        System.out.println("-- Budget(In Cr.) --\n"+values);

        // for each method
        for (Map.Entry<String,Double> entry:auctionTeamBudget.entrySet()) {
            System.out.println("Team -> "+entry.getKey() + " || Budget -> "+entry.getValue());
        }

        //Iterator method
        Set<Map.Entry<String,Double>> entries= auctionTeamBudget.entrySet();
        Iterator<Map.Entry<String,Double>> iterator= entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Double> entry= iterator.next();
            System.out.println("Team => "+entry.getKey()+" || Budget => "+entry.getValue());
        }

        //Java 8 forEach method
        auctionTeamBudget.forEach((K,V)->{
            System.out.println("Team: "+K);
            System.out.println("Budget: "+V);
        });

        Double maxBudget= Double.MIN_VALUE;
        Map.Entry<String,Double> maxEntry= null;

        for (Map.Entry<String,Double> entry:auctionTeamBudget.entrySet()) {
            if (entry.getValue()>maxBudget){
                maxBudget= entry.getValue();
                maxEntry = entry;
            }
        }
        if (maxEntry!=null){
            System.out.println("|| Maximum Budget Team ||");
            System.out.println("Team : "+maxEntry.getKey()+" || Budget: "+maxEntry.getValue());
        } else System.out.println("Map is empty");
    }
}
