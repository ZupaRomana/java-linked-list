package com.codecool;

public class SinglyLinkedList {

    private Node head;
    private Node last;
    private int length;

    public SinglyLinkedList() {
        this.head = null;
        this.last = null;
        this.length = 0;
    }

    public void add(String element) {
        if (this.length == 0) {
            this.head = new Node(element);
            this.last = this.head;
        } else if (this.length == 1) {
            this.last = new Node(element);
            this.head.setNextNode(this.last);
        } else {
            Node tempNode = this.last;
            this.last = new Node(element);
            tempNode.setNextNode(this.last);
        }
        length++;
    }

    public String getHead() {
        return this.head.getObj();
    }
}
