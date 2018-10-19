package com.codecool;

class Node {

    private String obj;
    private Node nextNode;

    Node(String obj) {
        this.obj = obj;
        this.nextNode = null;
    }

    String getObj() {
        return obj;
    }

    void setObj(String obj) {
        this.obj = obj;
    }

    Node getNextNode() {
        return nextNode;
    }

    void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
