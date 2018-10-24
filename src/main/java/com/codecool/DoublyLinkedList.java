package com.codecool;

public class DoublyLinkedList<Element> {

    private Node<Element> head;
    private Node<Element> tail;
    private int size;

    public DoublyLinkedList() {

    }

    public void add(Element element) {
    }

    public Element get(int index) throws ArrayIndexOutOfBoundsException {
        return null;
    }

    public void remove(int index) throws ArrayIndexOutOfBoundsException {

    }

    private class Node<Element>  {
        private Element element;
        private Node<Element> previousNode;
        private Node<Element> nextNode;

        Node() {

        }
    }
}
