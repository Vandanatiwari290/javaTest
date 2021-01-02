package com.javalearning;

import java.util.Scanner;

public class TakeInputFromUser {
 public static void main(String[]args){
     Scanner scanner=new Scanner(System.in);
     System.out.println("enter number");
     int a=scanner.nextInt();

     System.out.println("enter float value");
     float b=scanner.nextFloat();

     System.out.println("enter string values");
     String c=scanner.next();
     for (int i=0;i< c.length();i++){
         Character d= c.charAt(i);
         System.out.println(d);
     }
 }



}
