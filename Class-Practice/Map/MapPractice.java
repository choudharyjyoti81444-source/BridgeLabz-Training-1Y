package com.gla.Class_Practice.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class MapPractice {
    public static void main(String[] args){
        HashMap<Integer,Integer> hm = new HashMap<>();
    //    LinkedMap<Integer,Integer> hm = new LinkedMap<>();
    //    TreeMap<Integer,Integer> hm = new TreeMap<>();
        hm.put(1,98);
        hm.put(5,76);
        hm.put(0,22);
        hm.put(7,99);

        System.out.println("==================HashMap===================");
        System.out.println(hm);
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        Set<Integer> s = hm.keySet();
        System.out.println("Key Set: " +s);
        System.out.println("----Key set----");
        for(int a : hm.keySet()){
            System.out.println(a);
        }

        System.out.println("----values----");
        for(int b : hm.values()){
            System.out.println(b);
        }

        System.out.println(hm.entrySet());


        LinkedHashMap<String,String> lm = new LinkedHashMap<>();
        TreeMap<Integer,String> tm = new TreeMap<>();
    }
}
