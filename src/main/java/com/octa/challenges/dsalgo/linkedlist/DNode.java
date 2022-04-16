package com.octa.challenges.dsalgo.linkedlist;

public class DNode {

    String a;
    DNode next, prev;

    public DNode(String a, DNode next, DNode prev) {
        this.a = a;
        this.next = next;
        this.prev = prev;
    }

    public String getString() {
        return a;
    }

    public void setString(String a) {
        this.a = a;
    }

    public DNode getNext() {
        return next;
    }

    public void setNext(DNode next) {
        this.next = next;
    }

    public DNode getPrev() {
        return prev;
    }

    public void setPrev(DNode prev) {
        this.prev = prev;
    }
}
