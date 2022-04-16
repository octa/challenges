package com.octa.challenges.dsalgo.linkedlist;

public class SLinkedList {
    Node head;
    Node tail;
    int size;

    public SLinkedList() {
        head = null;
        size = 0;
    }

    public void insertLast(String a) {
        Node node = new Node(a, null);
        if(size == 0) {
            head = node;
            tail = node;
            size++;
        }
        else {
            tail.setNext(node);
            tail = node;
            size++;
        }
    }

    public void removeFirst() {
        if(head == null) {
            throw new IllegalStateException("List is empty");
        }
        Node node = head;
        head = head.getNext();
        node.setNext(null);
        size--;
    }
}
