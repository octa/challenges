package com.octa.challenges.dsalgo.graph.astar;

import java.util.*;

public class AStarGrid {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public Node astar(Node[][] maze, Node start, Node end) {
        Set<Node> open = new HashSet<>();
        Set<Node> closed = new HashSet<>();
        Queue<Node> queue = new PriorityQueue();
        open.add(start);
        queue.add(start);

        while(!open.isEmpty()) {
            Node node = queue.poll();
            open.remove(node);
            closed.add(node);
            printGrid(maze);

            if(node.x == end.x && node.y == end.y) {
                System.out.println("Found the end node");
                return node.prev;
            }

            findNeighbours(maze, node, open, closed, queue, end);
        }
        return null;
    }

    public void findNeighbours(Node[][] maze, Node node, Set<Node> open, Set<Node> closed, Queue queue, Node end) {
        int[] dRow = new int[] {-1, 1, 0, 0};
        int[] dColoumn = new int[] {0, 0, 1, -1};

        for(int i=0; i<4; i++) {
            int rr = node.x + dRow[i];
            int cc = node.y + dColoumn[i];

            if(rr < 0 || cc < 0) continue;
            if(rr >= maze.length || cc >= maze.length) continue;

            Node adjacentNode = maze[rr][cc];

            //if(adjacentNode.x < 0 || adjacentNode.y < 0) continue;
            //if(adjacentNode.x >= maze.length || adjacentNode.y >= maze.length) continue;
            if(adjacentNode.value == "#") continue;

            if(!closed.contains(adjacentNode) && !open.contains(adjacentNode)) {
                adjacentNode.g = node.g + 1;
                adjacentNode.h = Math.abs(adjacentNode.x - end.x) + Math.abs(adjacentNode.y - end.y);
                adjacentNode.f = adjacentNode.g + adjacentNode.h;
                adjacentNode.prev = node;
                open.add(adjacentNode);
                queue.add(adjacentNode);
            }
            else {
                if(node.g+1 < adjacentNode.g) {
                    adjacentNode.g = node.g + 1;
                    adjacentNode.h = Math.abs(adjacentNode.x - end.x) + Math.abs(adjacentNode.y - end.y);
                    adjacentNode.f = adjacentNode.g + adjacentNode.h;
                    adjacentNode.prev = node;
                    queue.add(adjacentNode);
                    if(closed.contains(adjacentNode)) {
                        closed.remove(adjacentNode);
                        open.add(adjacentNode);
                    }
                }
            }

            /*if(closed.contains(adjacentNode)) {
                if(adjacentNode.f < node.f) {
                    open.add(adjacentNode);
                }
            }

            if(!closed.contains(adjacentNode)) {
                adjacentNode.g = node.g + 1;
                //adjacentNode.h = (int) Math.sqrt(((adjacentNode.x - end.x) * (adjacentNode.x - end.x)) + ((adjacentNode.y - end.y) * (adjacentNode.y - end.y)));
                adjacentNode.h = Math.abs(adjacentNode.x - end.x) + Math.abs(adjacentNode.y - end.y);
                adjacentNode.f = adjacentNode.g + adjacentNode.h;
                open.add(adjacentNode);
                queue.add(adjacentNode);
                adjacentNode.prev = node;
            }*/

        }
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        Node[][] maze = new Node[x][y];
        for(int i=0; i<x; i++) {
            for(int j=0; j<y; j++) {
                maze[i][j] = new Node(i, j);
            }
        }
        System.out.println("Starting A start search");

        // Start obstacles

        maze[0][4].value = "#";
        maze[1][4].value = "#";
        maze[2][4].value = "#";
        maze[3][4].value = "#";
        maze[4][4].value = "#";
        maze[4][3].value = "#";
        maze[4][2].value = "#";
        maze[4][1].value = "#";

        // End obstacles

        printInitGrid(maze);

        Node start = maze[0][0];
        Node end = maze[0][5];
        Node path = new AStarGrid().astar(maze, start, end);
        findPath(path, start, end);
        printEndGrid(maze, path, start, end);
    }

    public static void printInitGrid(Node[][] maze) {
        for(int i=0; i<maze.length; i++) {
            for(int j=0; j<maze.length;j++) {
                if(maze[i][j].value == "X") {
                    System.out.print(ANSI_RED + maze[i][j].value + ANSI_RESET);
                    System.out.print("\t");
                }
                else {
                    System.out.print(maze[i][j].value);
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void printGrid(Node[][] maze) {
        for(int i=0; i<maze.length; i++) {
            for(int j=0; j<maze.length;j++) {
                System.out.print(maze[i][j].f);
                System.out.print("\t");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void printEndGrid(Node[][] maze, Node path, Node start, Node end) {
        Node prev = path.prev;
        maze[end.x][end.y].value = "X";
        maze[path.x][path.y].value = "X";
        while(prev!=null) {
            maze[prev.x][prev.y].value = "X";
            prev = prev.prev;
        }
        printInitGrid(maze);
    }

    public static void findPath(Node path, Node start, Node end) {
        List<String> paths = new ArrayList<>();
        paths.add("(" + end.x + "," + end.y + ") ");
        paths.add("(" + path.x + "," + path.y + ") ");
        Node prev = path.prev;
        while(prev!=null) {
            paths.add("(" + prev.x + "," + prev.y + ") ");
            prev = prev.prev;
        }
        Collections.reverse(paths);
        paths.stream().forEach(System.out::print);
        System.out.println("");
    }
}
