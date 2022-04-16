package com.octa.challenges.dsalgo.linkedlist;

public class Node {
    String a;
    Node next;

    public Node(String a, Node next) {
        this.a  = a;
        this.next = next;
    }

    public String getString() {
        return a;
    }

    public Node getNext() {
        return next;
    }

    public void setString(String newString) {
        this.a = newString;
    }

    public void setNext(Node newNext) {
        this.next = newNext;
    }
}
