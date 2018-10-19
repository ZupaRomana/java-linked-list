package com.codecool;

public class SinglyLinkedList<Element> {

    private Node<Element> head;
    private Node<Element> last;
    private int length;

    public SinglyLinkedList() {
        this.head = null;
        this.last = null;
        this.length = 0;
    }

    public void add(Element element) {
        if (this.length == 0) {
            this.head = new Node<>(element);
            this.last = this.head;
        } else if (this.length == 1) {
            this.last = new Node<>(element);
            this.head.nextNode = this.last;
        } else {
            Node<Element> tempNode = this.last;
            this.last = new Node<>(element);
            tempNode.nextNode = this.last;
        }
        length++;
    }

    public Element getHead() {
        return this.head.element;
    }

    public Element getLast() {
        return this.last.element;
    }

    public Element get(int index) {
        System.out.println(length);
        if (index == 0) {
            return this.head.element;
        } else if (index == this.length - 1) {
            return this.last.element;
        } else {
            Node<Element> tempElem = this.head;
            for (int i = 1; (index < this.length / 2) ? i <= index : i >= index ; i = (index < this.length / 2) ? i + 1 : i - 1) {
                tempElem = tempElem.nextNode;
            }
            return tempElem.element;
        }
    }

    private class Node<E> {
        private E element;
        private Node<E> nextNode;

        Node(E element) {
            this.element = element;
            this.nextNode = null;
        }
    }
}
