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

    public void add(Object obj) {
        if (this.length == 0) {
            this.head = new Node(obj, null);
            this.last = this.head;
        } else if (this.length == 1) {
            this.last = new Node(obj, null);
            this.head.setNextNode(this.last);
        } else {
            Node tempNode = this.last;
            this.last = new Node(obj, null);
            tempNode.setNextNode(this.last);
        }
        length++;
    }
}
