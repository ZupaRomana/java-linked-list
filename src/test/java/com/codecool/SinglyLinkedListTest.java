package com.codecool;

import org.junit.jupiter.api.Test;

public class SinglyLinkedListTest {

    private SinglyLinkedList linkedList = new SinglyLinkedList();

    @Test
    void add_simple_object() {
        this.fillList(1);
    }

    private void fillList(int numOfObjects) {
        for (int i = 0; i <= numOfObjects; i++) {
            this.linkedList.add(i);
        }
    }

}
