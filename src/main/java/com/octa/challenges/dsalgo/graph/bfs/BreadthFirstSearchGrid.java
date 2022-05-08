package com.octa.challenges.dsalgo.graph.bfs;

import java.util.ArrayDeque;
import java.util.Queue;

public class BreadthFirstSearchGrid {

    public static void main(String[] args) {
        String[][] maze = new String[][] {
                { "S", ".", ".", "#", ".", ".", "." },
                { ".", "#", ".", ".", ".", "#", "." },
                {".", "#", ".", ".", ".", ".", "."},
                {".", ".", "#", "#", ".", ".", "."},
                {"#", ".", "#", "E", ".", "#", "."}};
        int rows = 5;
        int columns = 7;

        new BreadthFirstSearchGrid().bfs(maze, rows, columns, 0, 0);
    }

    public int bfs(String[][] maze, int r, int c, int startRow, int startColumn) {
        boolean[][] visited = new boolean[r][c];
        Queue<Integer> rowQueue = new ArrayDeque();
        Queue<Integer> columnQueue = new ArrayDeque();
        rowQueue.add(startRow);
        columnQueue.add(startColumn);
        boolean found = false;
        visited[startRow][startColumn] = true;
        int[][] prev = new int[r][c];

        while(!rowQueue.isEmpty()) {
            int rr = rowQueue.poll();
            int cc = columnQueue.poll();

            if(maze[rr][cc] == "E") {
                found = true;
                break;
            }
            findNeighbours(maze, rr, cc, r, c, visited, rowQueue, columnQueue, prev);
        }
        if(found) {
            return 1;
        }
        else {
            return -1;
        }
    }

    public void findNeighbours(String[][] maze, int row, int column, int r, int c, boolean[][] visited, Queue rowQueue, Queue columnQueue, int[][] prev) {
        int[] dRow = new int[] {-1, 1, 0, 0};
        int[] dColumn = new int[] {0, 0, 1, -1};

        for(int i=0; i<4; i++) {
            int newRow = row+dRow[i];
            int newColumn = column+dColumn[i];

            if(newRow<0 || newColumn<0) continue;
            if(newRow >= r || newColumn >= c) continue;
            if(visited[newRow][newColumn]) continue;
            if(maze[newRow][newColumn] == "#") continue;

            rowQueue.add(newRow);
            columnQueue.add(newColumn);
            visited[newRow][newColumn] = true;
            prev[newRow][newColumn] = 1;
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