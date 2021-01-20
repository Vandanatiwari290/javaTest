package com.javalearning;

import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortTheArray {
    public static void main(String[] args) {

        //sort an elements in array
        int a[] = {1, 2, 0, 6, 4};
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        // sort an element in array list

        ArrayList<Integer> arrayList=new ArrayList<Integer>(Arrays.asList(2,1,3,5,4));
        Collections.sort(arrayList);
        System.out.println(arrayList);




    }
}
