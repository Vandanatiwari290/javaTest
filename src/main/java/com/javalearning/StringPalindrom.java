package com.javalearning;
import java.util.Scanner;

public class StringPalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String a = sc.nextLine();
        String reverse = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            reverse = reverse + a.charAt(i);
        }
        if (a.equalsIgnoreCase(reverse)) {
            System.out.println("palindrom");

        } else {
            System.out.println("not palindrom");
        }
    }
}
