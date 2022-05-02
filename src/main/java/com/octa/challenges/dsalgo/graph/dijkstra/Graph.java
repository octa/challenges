package com.octa.challenges.dsalgo.graph.dijkstra;

import java.util.HashSet;
import java.util.Set;

public class Graph {

    Set<Node> graph = new HashSet<>();

    public void addNodes(Node node) {
        graph.add(node);
    }

    public Set<Node> getGraph() {
        return graph;
    }

    public void setGraph(Set<Node> graph) {
        this.graph = graph;
    }
}
