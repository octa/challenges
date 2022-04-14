package com.octa.challenges.dsalgo.arrays;

public class GameClass {

    public static void main(String[] args) {
        Score score = new Score();
        GameEntry gameEntry = new GameEntry();
        gameEntry.name = "A";
        gameEntry.score = 10;
        GameEntry gameEntry2 = new GameEntry();
        gameEntry2.name = "B";
        gameEntry2.score = 20;
        GameEntry gameEntry3 = new GameEntry();
        gameEntry3.name = "C";
        gameEntry3.score = 30;
        GameEntry gameEntry4 = new GameEntry();
        gameEntry4.name = "D";
        gameEntry4.score = 40;
        GameEntry gameEntry5 = new GameEntry();
        gameEntry5.name = "E";
        gameEntry5.score = 50;

        score.add(gameEntry);
        score.add(gameEntry2);
        score.add(gameEntry3);
        score.add(gameEntry4);
        score.add(gameEntry5);

        for(int i =0; i<score.entries; i++) {
            System.out.println(score.gameEntries[i].getScore());
        }

    }
}
