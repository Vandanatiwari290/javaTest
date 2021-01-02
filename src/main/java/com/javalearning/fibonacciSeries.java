package com.javalearning;

public class fibonacciSeries {

    public static void main(String[]args) {
        int count=7,start = 0, start_1 = 1, result,i=1;
        System.out.println("Fibonacci series are:");
        System.out.print(start +" "+start_1);

        while ( i <=count) {


            result = start + start_1;
            System.out.print(" "+ result);
            start = start_1;
            start_1 = result;
            i++;


        }
    }
}
