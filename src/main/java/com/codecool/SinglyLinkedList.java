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
            this.head.setNextNode(this.last);
        } else {
            Node<Element> tempNode = this.last;
            this.last = new Node<>(element);
            tempNode.setNextNode(this.last);
        }
        length++;
    }

    public Element getHead() {
        return this.head.getElement();
    }

    private class Node<E> {
        private E element;
        private Node<E> nextNode;

        Node(E element) {
            this.element = element;
            this.nextNode = null;
        }

        E getElement() {
            return element;
        }

        void setElement(E element) {
            this.element = element;
        }

        Node<E> getNextNode() {
            return this.nextNode;
        }

        void setNextNode(Node<E> nextNode) {
            this.nextNode = nextNode;
        }
    }
}
