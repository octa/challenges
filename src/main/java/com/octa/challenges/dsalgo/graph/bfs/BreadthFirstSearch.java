package com.octa.challenges.dsalgo.graph.bfs;

import java.util.*;

public class BreadthFirstSearch {
    int number_of_vertices;
    List<List<Integer>> adjacencyList;

    public BreadthFirstSearch(List<List<Integer>> adjacencyList) {
        this.number_of_vertices = adjacencyList.size();
        this.adjacencyList = adjacencyList;
    }

    public static void addDirectedNode(List<List<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
    }

    public static void addUndirectedNode(List<List<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    public static List<List<Integer>> init(int n) {
        List<List<Integer>> graph = new LinkedList<>();
        for(int i= 0; i < n; i++) {
            graph.add(new LinkedList<>());
        }
        return graph;
    }

    public void bfs(List<List<Integer>> graph, int start) {
        boolean[] visited = new boolean[number_of_vertices];
        Deque<Integer> queue = new ArrayDeque<>(number_of_vertices);
        visited[start] = true;
        queue.offer(start);

        while(!queue.isEmpty()) {
            int node = queue.poll();
            List<Integer> nodes = graph.get(node);

            for(Integer n: nodes) {
                if(!visited[n]) {
                    visited[n] = true;
                    queue.offer(n);
                }
            }
            System.out.println(node);
        }
    }

    public static void main(String[] args) {
        int n = 13;
        List<List<Integer>> graph = init(n);
        /*addNode(graph, 0, 1);
        addNode(graph, 0, 2);
        addNode(graph, 2, 0);
        addNode(graph, 1, 2);
        addNode(graph, 2, 3);*/
        addUndirectedNode(graph, 0, 7);
        addUndirectedNode(graph, 0, 9);
        addUndirectedNode(graph, 0, 11);
        addUndirectedNode(graph, 7, 11);
        addUndirectedNode(graph, 7, 6);
        addUndirectedNode(graph, 7, 3);
        addUndirectedNode(graph, 6, 5);
        addUndirectedNode(graph, 3, 4);
        addUndirectedNode(graph, 2, 3);
        addUndirectedNode(graph, 2, 12);
        addUndirectedNode(graph, 12, 8);
        addUndirectedNode(graph, 8, 1);
        addUndirectedNode(graph, 1, 10);
        addUndirectedNode(graph, 10, 9);
        addUndirectedNode(graph, 9, 8);
        BreadthFirstSearch bfs = new BreadthFirstSearch(graph);
        bfs.bfs(graph, 10);
    }
}
