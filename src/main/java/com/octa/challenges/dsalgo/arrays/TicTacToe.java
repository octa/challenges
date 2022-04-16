package com.octa.challenges.dsalgo.arrays;

public class TicTacToe {

    public static final int X=1, O=-1;
    public static final int EMPTY = 0;
    public int player;
    int[][] board = new int[3][3];

    public TicTacToe() {
        clear();
        player = X;
    }

    public void clear() {
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    public void mark(int a, int b) {
        if(a<0 || a>2 || b<0 || b>2) {
            throw new IllegalArgumentException("Invalid board position.");
        }
        if(board[a][b] != EMPTY) {
            throw new IllegalArgumentException("Position taken.");
        }
        board[a][b] = player;
        player = -player;
    }

    public String toString() {
        String boardString = "";
        for(int i=0; i<3;i++) {
            for(int j=0; j<3; j++) {
                switch(board[i][j]){
                    case X: boardString += 'X';break;
                    case O: boardString +='O';break;
                    case EMPTY: boardString +='-';break;
                }
                if(j<2) {
                    boardString+="|";
                }
            }
            boardString+="\n";
        }
        return boardString;
    }

    public boolean win(int player) {
        int row1 = board[0][0] + board[0][1] + board[0][2];
        int row2 = board[1][0] + board[1][1] + board[1][2];
        int row3 = board[2][0] + board[2][1] + board[2][2];

        int column1 = board[0][0] + board[1][0] + board[2][0];
        int column2 = board[0][1] + board[1][1] + board[2][1];
        int column3 = board[0][2] + board[1][2] + board[2][2];

        int diagnol1 = board[0][0] + board[1][1] + board[2][2];
        int diagnol2 = board[0][2] + board[1][1] + board[2][0];

        return(row1==player*3 || row2==player*3 || row3==player*3 || column1==player*3 || column2==player*3 || column3==player*3 || diagnol1==player*3 || diagnol2==player*3);
    }

    public int doWeHaveAWinner() {
        if(win(X)) {
            return X;
        }
        else if(win(O)) {
            return O;
        }
        else {
            return 0;
        }

    }

    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.mark(1,1);
        ticTacToe.mark(1,0);
        ticTacToe.mark(0,1);
        ticTacToe.mark(2,1);
        ticTacToe.mark(0,2);
        ticTacToe.mark(2,0);
        ticTacToe.mark(0,0);
        ticTacToe.mark(1,2);
        System.out.println(ticTacToe.toString());
        int status = ticTacToe.doWeHaveAWinner();
        if(status == 1) {
            System.out.println("X won");
        }
        if(status == -1) {
            System.out.println("O won");
        }
        if(status == 0) {
            System.out.println("Game is a tie");
        }
    }
}
