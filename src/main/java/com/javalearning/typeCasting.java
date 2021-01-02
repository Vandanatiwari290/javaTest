package com.javalearning;
public class typeCasting {
    public static void main(String[]args) {

        //widening
        int a=10;
        double b=a;  // Automatic casting: int to double
        System.out.println(b);

        //narrowing
        double d=14.2;
        int c= (int) d;
        System.out.println(c);





    }
}
