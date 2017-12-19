package com.homework.codeclan.wordcount;

/**
 * Created by derkrisz on 2017. 12. 18..
 */

public class WordCount {

    public String countWords(String text) {
        String[] words = text.split(" ");
        int value = words.length;
        return String.valueOf(value);
    }
}
