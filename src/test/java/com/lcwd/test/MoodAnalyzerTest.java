package com.lcwd.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

    @Test
    public void testSadMood(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood:");
        String mood = moodAnalyzer.analyzeMood();
        Assertions.assertEquals("Sad" , mood);

    }
}
