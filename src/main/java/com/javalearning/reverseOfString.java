package com.javalearning;

public class reverseOfString {
    public static void main(String[]args){
        String input="The sun rises in the east";
        String a[]=input.split(" ");
        for (int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }

    }
}
