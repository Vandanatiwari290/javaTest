package com.javalearning.LinkedList;

public class Node {
    int data;
    Node address_of_next_node;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getAddress() {
        return address_of_next_node;
    }

    public void setAddress(Node address) {
        this.address_of_next_node = address;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", address_of_next_node=" + address_of_next_node +
                '}';
    }
}
