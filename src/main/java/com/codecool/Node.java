package com.codecool;

public class Node {

    private Object obj;
    private Node nextNode;

    Node(Object obj, Node nextNode) {
        this.obj = obj;
        this.nextNode = nextNode;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
