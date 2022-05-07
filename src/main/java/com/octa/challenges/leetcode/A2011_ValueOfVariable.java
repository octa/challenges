package com.octa.challenges.leetcode;

import java.util.Locale;

public class A2011_ValueOfVariable {

    public static void main(String[] args) {
        String[] val = new String[]{"--X","X++","X++"};
        int ret = finalValueAfterOperations(val);
        System.out.println(ret);
    }
    public static int finalValueAfterOperations(String[] operations) {
        int ret = 0;
        for(int i=0; i<operations.length;i++) {
            String op = operations[i].toLowerCase();
            switch(op) {
                case "++x":
                    ret++; break;
                case "--x":
                    ret--; break;
                case "x++":
                    ret++; break;
                case "x--":
                    ret--; break;
            }
        }
        return ret;
    }

    public static int finalValueAfterOperationsEfficient(String[] operations) {
        int ret = 0;
        for(int i=0; i<operations.length;i++) {
            switch(operations[i].charAt(1)) {
                case '+':
                    ret++; break;
                default:
                    ret--; break;
            }
        }
        return ret;
    }
}
