package com.codecool;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SinglyLinkedListTest {

    private SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();


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

    @Test
    void get_head_when_passed_one_object() {
        String example = "example";
        this.linkedList.add(example);
        String expected = "example";
        String actual = this.linkedList.getHead();

        assertEquals(expected, actual);
    }

    @Test
    void get_head_when_passed_more_objects() {
        this.fillList(10);

        String expected = "0";
        String actual = this.linkedList.getHead();

        assertEquals(expected, actual);
    }

    @Test
    void get_last_element() {
        this.fillList(5);

        String expected = "4";
        String actual = this.linkedList.getLast();

        assertEquals(expected, actual);
    }

    @Test
    void get_last_element_when_passed_nulls_only() {
        this.linkedList.add(null);
        this.linkedList.add(null);
        this.linkedList.add(null);

        assertNull(this.linkedList.getLast());
    }

    @Test
    void get_last_when_nulls_and_string_combined_passed() {
        this.linkedList.add(null);
        this.linkedList.add(null);
        this.fillList(3);

        String expected = "2";
        String actual = this.linkedList.getLast();

        assertEquals(expected, actual);
    }

    @Test
    void get_element_by_index() {
        this.fillList(200);

        String expected = "58";
        String actual = this.linkedList.get(58);

        assertEquals(expected, actual);
    }

    private void fillList(int numOfObjects) {
        for (int i = 0; i < numOfObjects; i++) {
            this.linkedList.add(Integer.toString(i));
        }
    }

}
