package com.codecool;

public class LinkedListR {

    private static final int STARTING_STANDARD_ARRAY_SIZE = 0;
    private Integer[] array;

    public LinkedListR() {
        this.array = new Integer[STARTING_STANDARD_ARRAY_SIZE];
    }

    public LinkedListR(int size) {
        this.array = new Integer[size];
    }
}
