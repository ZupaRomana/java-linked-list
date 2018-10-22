package com.codecool;

public class SinglyLinkedList<Element> {

    protected Node<Element> head;
    protected Node<Element> tail;
    protected int length;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public void add(Element element) {
        if (indexPointsHead(this.length)) {
            head = new Node<>(element);
            tail = head;
        } else if (length == 1) {
            tail = new Node<>(element);
            head.nextNode = tail;
        } else {
            Node<Element> tempNode = tail;
            tail = new Node<>(element);
            tempNode.nextNode = tail;
        }
        length++;
    }

    public Element getHead() {
        return head.element;
    }

    public Element getTail() {
        return tail.element;
    }

    public Element get(int index) throws ArrayIndexOutOfBoundsException {
        if (isWrongIndex(index)) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            return getNode(index).element;
        }
    }

    private Node<Element> getNode(int index) {
        if (indexPointsHead(index)) {
            return head;
        } else if (indexPointsTail(index)) {
            return tail;
        } else {
            Node<Element> tempElem = head;
            for (int i = 1; i <= index; i++) {
                tempElem = tempElem.nextNode;
            }
            return tempElem;
        }
    }

    public int getSize() {
        return length;
    }

    public void remove(int index) throws ArrayIndexOutOfBoundsException {
        if (isWrongIndex(index)) {
            throw new ArrayIndexOutOfBoundsException();
        } else {

            if (indexPointsHead(index)) {
                head = head.nextNode;
            } else if (indexPointsTail(index)) {
                tail = getNode(length - 1);
                tail.nextNode = null;
            } else {
                Node<Element> nodeBefore = head;

                for (int i = 1; i < index; i++) {
                    nodeBefore = nodeBefore.nextNode;
                }

                Node<Element> nodeToRemove = nodeBefore.nextNode;
                nodeBefore.nextNode = nodeToRemove.nextNode;

            }
            length--;
        }
    }

    private boolean indexPointsTail(int index) {
        return index == length - 1;
    }

    private boolean indexPointsHead(int index) {
        return index == 0;
    }

    private boolean isWrongIndex(int index) {
        return head == null || index < 0 || index > length - 1;
    }

    protected class Node<E> {
        private E element;
        private Node<E> nextNode;

        Node(E element) {
            this.element = element;
            this.nextNode = null;
        }
    }

    protected Node<Element> createNode(Element element) {
        return new Node<>(element);
    }
}
