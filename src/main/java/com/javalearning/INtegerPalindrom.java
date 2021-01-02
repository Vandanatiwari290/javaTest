package com.javalearning;

public class INtegerPalindrom {
    public static void main(String[]args) {
        int n=121,reverse=0,s;
        int t=n;

        while (n>0) {
            s = n % 10;
            n = n / 10;
            reverse = reverse*10 + s;

        }
        if (t==reverse){
            System.out.println("palindrom");

        }else {
            System.out.println("Not palindrom");
        }


    }
    }
