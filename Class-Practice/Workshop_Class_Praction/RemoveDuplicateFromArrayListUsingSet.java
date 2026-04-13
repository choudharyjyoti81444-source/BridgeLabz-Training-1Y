package com.gla.Class_Practice.Workshop_Class_Praction;

import java.util.*;

public class RemoveDuplicateFromArrayListUsingSet {
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(11);
        al.add(22);
        al.add(33);
        al.add(44);
        System.out.println("Duplicates"+al);
        Set<Integer> set = new HashSet<>(al);
        ArrayList<Integer> uniquelist = new ArrayList<>(al);
        System.out.println("UniqueList" +uniquelist);
    }
}
