package com.javalearning;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[]args){
        LinkedList list=new LinkedList();
        list.add(2);
        list.add("vandana") ;
        list.add(5);
        list.set(1, "For");
        list.add("vandana");

        for (Object str: list) {
            System.out.println(str);

        }
    }
}
