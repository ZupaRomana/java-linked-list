package com.codecool;

public class DoublyLinkedList<Element> {

    private Node<Element> head;
    private Node<Element> tail;
    private int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(Element element) {
        if (size == 0) {
            head = new Node<>(element);
            tail = head;
        }
        size++;
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

        Node(Element element) {
            this.element = element;
            nextNode = null;
            previousNode = null;
        }
    }
}
