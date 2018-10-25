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

    @Test
    void returnsTail() {
        fillList(33);

        String expected = "33";
        String actual = list.getTail();

        assertEquals(expected, actual);
    }

    @Test
    void returnsSize() {
        fillList(10);

        int expected = 10;
        int actual = list.getSize();

        assertEquals(expected, actual);
    }

    @Test
    void returnsValidElement() {
        fillList(20);

        String expected = "12";
        String actual = list.get(11);

        assertEquals(expected, actual);
    }

    private void fillList(int numOfObjects) {
        for (int i = 1; i <= numOfObjects; i++) {
            list.add(Integer.toString(i));
        }
    }

}