package com.octa.challenges.dsalgo.arrays;

import java.util.Arrays;

public class Score {
    public static final int maxEntries = 10;
    public int entries;
    public GameEntry[] gameEntries;

    public Score() {
        gameEntries = new GameEntry[maxEntries];
        entries = 0;
    }

    public void add(GameEntry gameEntry) {
//        if(entries == 0) {
//            gameEntries[0] = gameEntry;
//            entries++;
//            return;
//        }
        if(entries == maxEntries) {
            if(gameEntry.getScore() < gameEntries[entries-1].getScore()) {
                return;
            }
        }
        else {
            entries++;
            int i = entries-1;
//            while(i>=1 && gameEntries[i].getScore() < gameEntry.getScore()) {
//                gameEntries[i] = gameEntries[i-1];
//                i--;
//            }
            for(; i>=1 && (gameEntry.getScore() > gameEntries[i-1].getScore()); i--) {
                gameEntries[i] = gameEntries[i-1];
            }
            gameEntries[i] = gameEntry;
            //entries++;
        }

    }

}
//  v           v
// 50 40 30 20 10
