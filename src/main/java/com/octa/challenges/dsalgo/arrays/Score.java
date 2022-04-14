package com.octa.challenges.dsalgo.arrays;

public class Score {
    public static final int maxEntries = 10;
    public int entries;
    public GameEntry[] gameEntries;

    public Score() {
        gameEntries = new GameEntry[maxEntries];
        entries = 0;
    }

    public void add(GameEntry gameEntry) {
        if(entries == 0) {
            gameEntries[0] = gameEntry;
            entries++;
        }
        if(entries == maxEntries) {
            if(gameEntry.getScore() < gameEntries[entries-1].getScore()) {
                return;
            }
        }
        else {

        }
    }

}
//  v
// 50 40 30 _ _
