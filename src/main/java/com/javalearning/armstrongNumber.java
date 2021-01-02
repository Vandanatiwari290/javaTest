package com.javalearning;

public class armstrongNumber {
    public static void main(String[]args){
        int n=153,temp;
        temp=n;
        int a;
        int c=0;
        while (n>0){
             a=n%10;
            n=n/10;
            c=c+(a*a*a);
        }
        if (temp==c){
            System.out.println("armstrong");

        }else {
            System.out.println("Not armstrong");
        }
    }
}
