package com.octa.challenges.dsalgo.graph.dijkstra;

import java.util.*;

public class Node {
    String name;
    Integer distance = Integer.MAX_VALUE;
    LinkedList<Node> shortestPath = new LinkedList<>();
    Map<Node, Integer> adjacentNode = new HashMap<>();

    public Node(String name) {
        this.name = name;
    }

    public void addAdjacentNode(Node node, Integer edgeWeight) {
        adjacentNode.put(node, edgeWeight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public LinkedList<Node> getShortestPath() {
        return shortestPath;
    }

    public void setShortestPath(LinkedList<Node> shortestPath) {
        this.shortestPath = shortestPath;
    }

    public Map<Node, Integer> getAdjacentNode() {
        return adjacentNode;
    }

    public void setAdjacentNode(Map<Node, Integer> adjacentNode) {
        this.adjacentNode = adjacentNode;
    }
}
