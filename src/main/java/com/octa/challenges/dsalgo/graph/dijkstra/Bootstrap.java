package com.octa.challenges.dsalgo.graph.dijkstra;

public class Bootstrap {
    public static void main(String[] args) {
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");

        nodeA.addAdjacentNode(nodeB, 10);
        nodeA.addAdjacentNode(nodeC, 15);

        nodeB.addAdjacentNode(nodeD, 12);
        nodeB.addAdjacentNode(nodeF, 15);

        nodeC.addAdjacentNode(nodeE, 10);

        nodeD.addAdjacentNode(nodeE, 2);
        nodeD.addAdjacentNode(nodeF, 1);

        nodeF.addAdjacentNode(nodeE, 5);

        Graph graph = new Graph();
        graph.addNodes(nodeA);
        graph.addNodes(nodeB);
        graph.addNodes(nodeC);
        graph.addNodes(nodeD);
        graph.addNodes(nodeE);
        graph.addNodes(nodeF);

        Dijkstra dijkstra = new Dijkstra();
        Graph minimum = dijkstra.findShortestPath(graph, nodeA);
        System.out.println(minimum);

    }

}