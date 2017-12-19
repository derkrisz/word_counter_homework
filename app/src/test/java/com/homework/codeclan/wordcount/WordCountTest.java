package com.homework.codeclan.wordcount;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by derkrisz on 2017. 12. 18..
 */

public class WordCountTest {

    WordCount wordCounter;

    @Before
    public void before() {
        wordCounter = new WordCount();
    }



    @Test
    public void canCountWords() {
        assertEquals("8", wordCounter.countWords("This is a text to count the words"));
    }
}
