package com.javalearning.LinkedList;

public class LinkedListImplementation {
    Node header;

    public void insert(int data) {
        /**
         * Create Node to be inserted.
         */
        Node temp = new Node();
        temp.setData(data);

        if (header == null) {
            header = temp;

        }
        else {
            Node pointerNode = header;
            while (pointerNode.address_of_next_node!= null) {
                   pointerNode=pointerNode.address_of_next_node;
            }
            /**
             * insert node in last position.
             */
            pointerNode.setAddress(temp);

        }
    }

    public void show() {
        Node pointerNode = header;
        while (pointerNode != null) {
            System.out.println(pointerNode.getData());
            pointerNode=pointerNode.address_of_next_node;
        }

    }
}








