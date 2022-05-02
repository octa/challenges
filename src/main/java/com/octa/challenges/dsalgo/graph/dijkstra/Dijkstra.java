package com.octa.challenges.dsalgo.graph.dijkstra;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;

public class Dijkstra {

    public Graph findShortestPath(Graph graph, Node source) {
        source.setDistance(0);
        Set<Node> settled = new HashSet<>();
        Set<Node> unsettled = new HashSet<>();
        unsettled.add(source);

        while(!unsettled.isEmpty()) {
            Node minimumDistanceNode = findMinimumDistanceNode(unsettled);
            unsettled.remove(minimumDistanceNode);

            for(Entry<Node, Integer> map: minimumDistanceNode.getAdjacentNode().entrySet()) {
                Node adjacentNode = map.getKey();
                Integer edgeWeight = map.getValue();

                if(!settled.contains(adjacentNode)) {
                    findMinimumDistance(minimumDistanceNode, adjacentNode, edgeWeight);
                    unsettled.add(adjacentNode);
                }
            }
            settled.add(minimumDistanceNode);
        }
        return graph;
    }

    public Node findMinimumDistanceNode(Set<Node> unsettled) {
        Integer minimum = Integer.MAX_VALUE;
        Node minimumNode = null;
        for(Node node: unsettled) {
            if(node.getDistance() < minimum) {
                minimum = node.getDistance();
                minimumNode = node;
            }
        }
        return minimumNode;
    }

    public void findMinimumDistance(Node source, Node adjacentNode, Integer weight) {
        if(source.getDistance()+weight < adjacentNode.getDistance()) {
            adjacentNode.setDistance(source.getDistance()+weight);
            LinkedList shortestPath = new LinkedList(source.getShortestPath());
            shortestPath.add(source);
            adjacentNode.setShortestPath(shortestPath);
        }
    }

}
