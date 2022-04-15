package com.octa.challenges.dsalgo.arrays;

import java.util.Arrays;

public class Score {
    public static final int maxEntries = 5;
    public int entries;
    public GameEntry[] gameEntries;

    public Score() {
        gameEntries = new GameEntry[maxEntries];
        entries = 0;
    }

    public void add(GameEntry gameEntry) {
        if(entries == maxEntries) {
            if(gameEntry.getScore() < gameEntries[entries-1].getScore()) {
                return;
            }
        }
        else {
            entries++;
            int i = entries - 1;
            for(; (i>=1 && gameEntries[i-1].getScore() < gameEntry.getScore()); i--) {
                gameEntries[i] = gameEntries[i-1];
            }
            gameEntries[i] = gameEntry;
        }
    }

}
//  v           v
// 50 40 30 20 10
