package com.homework.codeclan.wordcount;

/**
 * Created by derkrisz on 2017. 12. 18..
 */

public class WordCount {

    public int countWords(String text) {
        String[] words = text.split(" ");
        return words.length;
    }
}
