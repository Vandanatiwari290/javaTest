package com.javalearning;

import java.util.Arrays;

public class SortTheArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 0, 6, 4};
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
