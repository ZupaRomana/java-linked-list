package com.codecool;

public class SinglyLinkedList<Element> {

    protected Node<Element> head;
    protected Node<Element> last;
    protected int length;

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
        return this.getNode(index).element;
    }

    private Node<Element> getNode(int index) {
        if (index == 0) {
            return this.head;
        } else if (index == this.length - 1) {
            return this.last;
        } else {
            Node<Element> tempElem = this.head;
            for (int i = 1; i <= index; i++) {
                tempElem = tempElem.nextNode;
            }
            return tempElem;
        }
    }

    public int getSize() {
        return this.length;
    }

    public void remove(int index) {
        if (index == 0) {
            this.head = this.head.nextNode;
        } else if (index == this.length - 1) {
            this.last = this.getNode(this.length - 1);
            this.last.nextNode = null;
        } else {
            Node<Element> nodeBefore = this.head;

            for (int i = 1; i < index; i++) {
                nodeBefore = nodeBefore.nextNode;
            }

            Node<Element> nodeToRemove = nodeBefore.nextNode;
            nodeBefore.nextNode = nodeToRemove.nextNode;

        }
        this.length--;
    }

    protected class Node<E> {
        private E element;
        private Node<E> nextNode;

        Node(E element) {
            this.element = element;
            this.nextNode = null;
        }
    }
}
