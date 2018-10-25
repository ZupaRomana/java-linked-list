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

    @Test
    void throwsException_when_badIndexPassed() {
        fillList(15);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
           list.get(100);
           list.get(-3);
           list.get(15);
        });
    }

    @Test
    void throwsException_when_removeBadIndexPassed() {
        fillList(4);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
           list.remove(100);
           list.remove(-1);
           list.remove(4);
        });
    }

    @Test
    void removesObject() {
        fillList(6);
        list.remove(4);

        String expected = " 1 2 3 4 6";
        String actual = list.toString();

        assertEquals(expected, actual);
    }

    @Test
    void removesObject_when_lastItemRemoved() {
        fillList(10);
        list.remove(9);

        String expected = " 1 2 3 4 5 6 7 8 9";
        String actual = list.toString();

        assertEquals(expected, actual);
    }

    @Test
    void removeObject_when_oneObjectInList() {
        fillList(1);
        list.remove(0);

        String expected = "";
        String actual = list.toString();

        assertEquals(expected, actual);
    }

    private void fillList(int numOfObjects) {
        for (int i = 1; i <= numOfObjects; i++) {
            list.add(Integer.toString(i));
        }
    }

}