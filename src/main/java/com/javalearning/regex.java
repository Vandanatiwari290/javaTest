package com.javalearning;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
    public static void main(String []args){
        System.out.println(
                Pattern.matches("[a-zA-Z][a-zA-Z][a-zA-Z]", "aPz"));//True
        System.out.println(
                Pattern.matches("[a-zA-Z][a-zA-Z][a-zA-Z]", "aAA"));//True
        System.out.println(
                Pattern.matches("[a-zA-Z][a-zA-Z][a-zA-Z]", "apZx"));//False


    }
}
