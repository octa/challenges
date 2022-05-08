package com.octa.challenges.dsalgo.graph.bfs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearchGridFindPath {

    static class Node {
        int[][] path;
        int rr;
        int cc;
    }

    public static void main(String[] args) {
        String[][] maze = new String[][] {
                { "S", ".", ".", "#", ".", ".", "." },
                { ".", "#", ".", ".", ".", "#", "." },
                {".", "#", ".", ".", ".", ".", "."},
                {".", ".", "#", "#", ".", ".", "."},
                {"#", ".", "#", "E", ".", "#", "."}};
        int rows = 5;
        int columns = 7;

        Node node = new BreadthFirstSearchGridFindPath().bfs(maze, rows, columns, 0, 0);

        for(int i=0; i< rows; i++) {
            for(int j = 0; j<columns; j++) {
                System.out.print(node.path[i][j]);
                System.out.print("  ");
            }
            System.out.println("");
        }

        findShortestPath(node, rows, columns);

    }

    public Node bfs(String[][] maze, int r, int c, int startRow, int startColumn) {
        boolean[][] visited = new boolean[r][c];
        Queue<Integer> rowQueue = new ArrayDeque();
        Queue<Integer> columnQueue = new ArrayDeque();
        rowQueue.add(startRow);
        columnQueue.add(startColumn);
        boolean found = false;
        visited[startRow][startColumn] = true;
        int[][] prev = new int[r][c];
        prev[startRow][startColumn] = 1;
        int weight = 1;
        Node node = new Node();

        while(!rowQueue.isEmpty()) {
            int rr = rowQueue.poll();
            int cc = columnQueue.poll();

            if(maze[rr][cc] == "E") {
                found = true;
                node.path = prev;
                node.rr = rr;
                node.cc = cc;
                break;
            }
            findNeighbours(maze, rr, cc, r, c, visited, rowQueue, columnQueue, prev, ++weight);
        }
        if(found) {
            return node;
        }
        else {
            return null;
        }
    }

    public void findNeighbours(String[][] maze, int row, int column, int r, int c, boolean[][] visited, Queue rowQueue, Queue columnQueue, int[][] prev, int weight) {
        int[] dRow = new int[] {-1, 1, 0, 0};
        int[] dColumn = new int[] {0, 0, 1, -1};

        for(int i=0; i<4; i++) {
            int newR = row+dRow[i];
            int newC = column+dColumn[i];

            if(newR<0 || newC<0) continue;
            if(newR >= r || newC >= c) continue;
            if(visited[newR][newC]) continue;
            if(maze[newR][newC] == "#") continue;

            rowQueue.add(newR);
            columnQueue.add(newC);
            visited[newR][newC] = true;
            prev[newR][newC] = weight;
        }
    }

    public static void findShortestPath(Node node, int rows, int columns) {
        int[] dRow = new int[] {-1, 1, 0, 0};
        int[] dColumn = new int[] {0, 0, 1, -1};
        int[][] path = node.path;
        int rr = node.rr;
        int cc = node.cc;
        List<String> shortestPath = new ArrayList();
        shortestPath.add("(" + rr + "," + cc + ")");
        boolean found = false;

        while(!found) {
            for(int i=0; i<4; i++) {
                int newR = rr+dRow[i];
                int newC = cc+dColumn[i];

                if(newR < 0 || newC < 0) continue;
                if(newR >= rows || newC >= columns) continue;

                if(path[newR][newC] == 1) {
                    shortestPath.add("(" + newR + "," + newC + ")");
                    found = true;
                    break;
                }

                if(path[newR][newC] < path[rr][cc] && path[newR][newC] > 0) {
                    shortestPath.add("(" + newR + "," + newC + ")");
                    rr = newR;
                    cc = newC;
                }
            }
        }

        for(int i=0; i<shortestPath.size(); i++) {
            System.out.println(shortestPath.get(i));
        }
    }
}

/*
"S", ".", ".", "#", ".", ".", "."
".", "#", ".", ".", ".", "#", "."
".", "#", ".", ".", ".", ".", "."
".", ".", "#", "#", ".", ".", "."
"#", ".", "#", "E", ".", "#", "."
 */

//https://stackoverflow.com/questions/71300044/display-shortest-path-to-finish-in-2d-array
//https://stackoverflow.com/questions/8435311/java-maze-shortest-path-2d-int-array
//https://stackoverflow.com/questions/47896461/get-shortest-path-to-a-cell-in-a-2d-array-in-python