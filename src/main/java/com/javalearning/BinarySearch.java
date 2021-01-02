package com.javalearning;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int a[] = {1, 3, 5, 6, 8};
        int first, last, mid;
        int item = 1;
        first = 0;
        last = a.length - 1;
        mid = (first + last) / 2;
        while (first <= last) {
            if (a[mid] == item) {
                System.out.printf("element found at " + mid + " index position");
                break;
            } else if (a[mid] < item) {
                last = mid + 1;
                System.out.printf("element present at " + last + " index position");
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.printf("element not found");
        }
    }
}


