package com.javalearning;

public class polymorphismB extends polymorphism{
    public void someFun(){
        System.out.println("helllo java hello");
    }
    public static void main(String[]args){
        polymorphism p=new polymorphismB();
        ((polymorphismB) p).someFun();
    }
}

