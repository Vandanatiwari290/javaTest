package com.javalearning;


public class Stringdemo {

    public static void makeOutWord(String out, String word) {
        System.out.println(out.substring(0, 2) + word + out.substring(2, 4));
    }

    public static String extraEnd(String str) {
        int len = str.length();
        System.out.println(len);
        String temp = str.substring(len - 2, len);
        System.out.println(temp);
        return (temp + temp + temp);
        //System.out.println(stringTest);

    }


    public static void reverseOfString(String str) {
        str.split(" ");
        StringBuilder stringBuilder = new StringBuilder(str);
        StringBuilder reverseStr = stringBuilder.reverse();
    }


    public static void main(String[] args) {

        //makeOutWord("[[]]","hello");
        extraEnd("hello");

    }

    //string is class in java and it has lot of function using which we can manipulate the string object

}


