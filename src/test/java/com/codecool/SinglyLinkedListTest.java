package com.codecool;

import org.junit.jupiter.api.Test;

public class SinglyLinkedListTest {

    private SinglyLinkedList linkedList = new SinglyLinkedList();

    @Test
    void add_simple_object() {
        this.fillList(1);
    }

    @Test
    void add_more_objects(){
        this.fillList(20);
    }

    @Test
    void add_null() {
        this.linkedList.add(null);
    }

    @Test
    void add_more_nulls() {
        for (int i = 0; i <= 10; i++) {
            this.linkedList.add(null);
        }
    }

    private void fillList(int numOfObjects) {
        for (int i = 0; i <= numOfObjects; i++) {
            this.linkedList.add(i);
        }
    }

}
