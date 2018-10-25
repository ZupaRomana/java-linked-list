package com.codecool;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    private DoublyLinkedList<String> list = new DoublyLinkedList<>();

    @Test
    void addsObject_when_oneObjectPassed() {
        list.add("Example");

        String expected = " Example";
        String actual = list.toString();

        assertEquals(expected, actual);
    }

}