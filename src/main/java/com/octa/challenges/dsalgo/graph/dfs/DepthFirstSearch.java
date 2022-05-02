package com.octa.challenges.dsalgo.graph.dfs;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {

    int number_of_vertices;
    List<List<Integer>> graph;

    public DepthFirstSearch(List<List<Integer>> graph) {
        number_of_vertices = graph.size();
        this.graph = graph;
    }

    public static List<List<Integer>> init(int size) {
        List<List<Integer>> graph = new LinkedList<>();
        for(int i = 0; i<size; i++) {
            graph.add(new LinkedList());
        }
        return graph;
    }

    public static void addDirectedNode(List<List<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
    }

    public static void addUndirectedNode(List<List<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    public void dfs(int start) {
        boolean[] visited = new boolean[number_of_vertices];
        Stack<Integer> stack = new Stack<>();

        visited[start] = true;
        stack.push(start);

        while(!stack.isEmpty()) {
            int node = stack.pop();
            List<Integer> nodes = graph.get(node);

            for(Integer n: nodes) {
                if(!visited[n]) {
                    visited[n] = true;
                    stack.push(n);
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
        DepthFirstSearch dfs = new DepthFirstSearch(graph);
        dfs.dfs(10);
    }
}
