package com.octa.challenges.leetcode;

public class A2114_NumberOfWords {

    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int num = mostWordsFound(sentences);
        System.out.println(num);
    }
    public static int mostWordsFound(String[] sentences) {
        int ret = 0;
        for(String sentence: sentences) {
            int num = sentence.split(" ").length;
            if(num> ret) {
                ret = num;
            }
        }
        return ret;
    }
}
