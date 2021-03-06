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
        } else if (size == 1) {
            tail = new Node<>(element);
            head.nextNode = tail;
            tail.previousNode = head;
        } else {
            Node<Element> tempNode = tail;
            tail = new Node<>(element);
            tail.previousNode = tempNode;
            tempNode.nextNode = tail;
        }
        size++;
    }

    public Element getHead() {
        return head.element;
    }

    public Element getTail() {
        return tail.element;
    }

    public int getSize() {
        return size;
    }

    public Element get(int index) throws ArrayIndexOutOfBoundsException {
        if (badIndexPassed(index)) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            if (indexPointsHead(index)) {
                return head.element;
            } else if (indexPointsTail(index)) {
                return tail.element;
            } else {
                Node<Element> focus = head;
                for (int i = 1; i <= index; i++) {
                    focus = focus.nextNode;
                }
                return focus.element;
            }
        }
    }

    private boolean badIndexPassed(int index) {
        return index < 0 || index >= size;
    }

    private boolean indexPointsHead(int index) {
        return index == 0;
    }

    private boolean indexPointsTail(int index) {
        return index == size - 1;
    }

    public void remove(int index) throws ArrayIndexOutOfBoundsException {
        if (badIndexPassed(index)) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            if (indexPointsHead(index)) {
                head = head.nextNode;
            } else if (indexPointsTail(index)) {
                tail = tail.previousNode;
                tail.nextNode = null;
            } else {
                Node<Element> focus = head;
                for (int i = 1; i < index; i++) {
                    focus = focus.nextNode;
                }
                focus.previousNode.nextNode = focus.nextNode;
                focus.nextNode.previousNode = focus.previousNode;
            }
        }
        size--;
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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<Element> focus = head;
        for (int i = 0; i < size; i++) {
            sb.append(" ");
            sb.append(focus.element);
            focus = focus.nextNode;
        }
        return sb.toString();
    }
}
