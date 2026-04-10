package com.gla.Class_Practice.Collection;

import java.util.Stack;
public class ReverseStringUsingStack {
    public static void main(String[] args){
    String str = "HELLO";
    Stack<Character> stack = new Stack<>();

        for (int i=0; i<str.length();i++) {
        stack.push(str.charAt(i));
    }

    String rev = "";
        while (!stack.isEmpty()) {
        rev = rev + stack.pop();
    }

        System.out.println("Reversed: " + rev);
}
}