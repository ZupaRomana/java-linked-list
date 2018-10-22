package com.codecool;

public class DoublyLinkedList<Element> extends SinglyLinkedList<Element> {

    public DoublyLinkedList() {
        super();
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public Element get(int index) throws ArrayIndexOutOfBoundsException {
        return null;
    }

    @Override
    public void remove(int index) throws ArrayIndexOutOfBoundsException {

    }

    class NodeDouble<E> extends Node<E> {
        private NodeDouble<E> previousNode;

        NodeDouble(E nextElement) {
            super(nextElement);
            this.previousNode = null;
        }
    }
}
