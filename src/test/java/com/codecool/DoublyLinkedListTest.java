package com.codecool;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    private DoublyLinkedList<String> list = new DoublyLinkedList<>();

    @Test
    void addsObject_when_oneObjectPassed() {
        fillList(5);

        String expected = " 1 2 3 4 5";
        String actual = list.toString();

        assertEquals(expected, actual);
    }

    @Test
    void returnsHead_when_moreObjectsPassed() {
        fillList(10);

        String expected = "1";
        String actual = list.getHead();

        assertEquals(expected, actual);
    }

    private void fillList(int numOfObjects) {
        for (int i = 1; i <= numOfObjects; i++) {
            list.add(Integer.toString(i));
        }
    }

}