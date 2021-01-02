package com.javalearning;

public class perfectNumber {

    public static void main(String[] args) {
        int n = 28;
        boolean b = isPerfect(n);
        if (b)
            System.out.println("perfect");

        else
            System.out.println("not perfect");
    }

    public static boolean isPerfect(int n) {
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }

            if (n == sum)
                return true;
            return false;
    }
}




