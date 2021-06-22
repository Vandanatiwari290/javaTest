package com.javalearning.javaStream;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
public class Customer {
    private String name;
    private int points;

    public Customer(String name, int points) {
        this.name = name;
        this.points = points;
    }
    //Constructor and standard getters


    public Customer() {
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", points=" + points +
                '}';
    }
}

