package com.lcwd.test;

public class MoodAnalyzer {
    public String analyzeMood(String message){
        if(message.contains ("Happy")){
            return "Happy";
        }else if(message.contains("Sad")){
            return "Sad";
        }
        return "Unknown";
    }
}
