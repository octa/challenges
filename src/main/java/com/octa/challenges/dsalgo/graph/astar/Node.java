package com.octa.challenges.dsalgo.graph.astar;

import java.util.Comparator;

public class Node implements Comparable<Node> {
    String value;
    int x, y;
    int f, g, h;
    Node prev;

    public Node(int x, int y) {
        this.value = ".";
        this.x = x;
        this.y = y;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.prev = null;
    }

    @Override
    public int compareTo(Node node) {
        if(this.f < node.f) {
            return -1;
        }
        else if(this.f > node.f) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
