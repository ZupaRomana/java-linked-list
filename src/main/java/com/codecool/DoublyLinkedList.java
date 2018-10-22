package com.codecool;

public class DoublyLinkedList<Element> extends SinglyLinkedList<Element> {

    public DoublyLinkedList() {
        super();
    }

    class NodeDouble<E> extends Node<E> {
        private NodeDouble<E> previousNode;

        NodeDouble(E nextElement) {
            super(nextElement);
            this.previousNode = null;
        }
    }
}
