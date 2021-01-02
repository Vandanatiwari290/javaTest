package com.javalearning;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionTest {
    public static void main(String[]args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        // Adding elements to the ArrayList
        list.add(5);
        list.add(60);
        list.add(35);
        list.add(50);
        list.add(6);
        // Collections.min() method to display minimum value
        System.out.println("Minimum value: " + Collections.min(list));
        // Collections.max() method to display maximum value
        System.out.println("Maximum value: " + Collections.max(list));
        Collections.sort(list);
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
   
}



