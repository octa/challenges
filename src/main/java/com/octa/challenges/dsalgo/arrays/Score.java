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

    public GameEntry remove(int index) {
        if(index < 0 || index > maxEntries) {
            throw new IndexOutOfBoundsException("Index is out of range");
        }
        GameEntry gameEntry = gameEntries[index];

        for(;index<entries-1; index++) {
            gameEntries[index] = gameEntries[index+1];
        }
        gameEntries[index] = null;
        entries--;
        return gameEntry;
    }

    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};
        insertionSort(nums);
    }

    public static void insertionSort(int[] nums) {
        for(int i=0; i< nums.length; i++) {
            int number = nums[i];
            int index = i-1;

            while(index >=0 && nums[index] > number) {
                nums[index+1] = nums[index];
                index--;
            }
            nums[index+1] = number;
        }

        for(int i: nums) {
            System.out.println(i);
        }
    }

}

//           v
// 50 40 30 20 10