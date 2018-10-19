package com.codecool;

class Node {

    private Object obj;
    private Node nextNode;

    Node(Object obj, Node nextNode) {
        this.obj = obj;
        this.nextNode = nextNode;
    }

    Object getObj() {
        return obj;
    }

    void setObj(Object obj) {
        this.obj = obj;
    }

    Node getNextNode() {
        return nextNode;
    }

    void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
