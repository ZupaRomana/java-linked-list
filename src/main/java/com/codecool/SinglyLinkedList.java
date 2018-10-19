package com.codecool;

public class SinglyLinkedList {

    private static final int STARTING_STANDARD_ARRAY_SIZE = 0;
    private Integer[] array;

    public SinglyLinkedList() {
        this.array = new Integer[STARTING_STANDARD_ARRAY_SIZE];
    }

    public SinglyLinkedList(int size) {
        this.array = new Integer[size];
    }
}
