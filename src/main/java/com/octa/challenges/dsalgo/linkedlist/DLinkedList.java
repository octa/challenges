package com.octa.challenges.dsalgo.linkedlist;

public class DLinkedList {

    DNode head;
    DNode tail;
    int size;

    public DLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void insertLast(String a) {
        DNode dnode;
        if(size == 0) {
            head = null;
            tail = null;
            dnode = new DNode(a, null, null);
            size++;
        }
        else {
            dnode = new DNode(a, null, tail);
            tail.setNext(dnode);
            tail = dnode;
            size++;
        }
    }

    public void removeLast() {
        if(head == null) {
            throw new IllegalStateException("List is empty");
        }
        else {
            DNode lastNode = tail;
            tail = tail.getPrev();
            tail.setNext(null);
            lastNode.setPrev(null);
            size--;
        }
    }

    public void insertFirst(String a) {
        DNode dNode = new DNode(a, head, null);
        head.setPrev(dNode);
        head = dNode;
        size++;
    }
}
