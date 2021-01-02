package com.javalearning;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedList;

public class NumberPalindrom {
    public static void main(String[] args) {
        int n = 121, rev = 0;
        int temp = n;
        while (n != 0) {
            int q = n % 10;
            rev = rev * 10 + q;
            n = n / 10;
        }
        System.out.println(rev);
        if (temp == rev) {
            System.out.println("number is palindrom");
        } else {
            System.out.println("number is not palindrom");
        }
    }
}


