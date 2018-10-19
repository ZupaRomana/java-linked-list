package com.codecool;

public class Node {

    private Object obj;
    private Node nextNode;

    public Node(Object obj, Node nextNode) {
        this.obj = obj;
        this.nextNode = nextNode;
    }
}
