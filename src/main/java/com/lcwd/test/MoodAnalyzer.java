package com.lcwd.test;

public class MoodAnalyzer {

    private String message;
    public MoodAnalyzer(){
        this.message= "";
    }
    public MoodAnalyzer(String message){
        this.message = message;
    }
    public String analyzeMood(){
        if (message.contains("Sad")){
        return "Sad";
    }
    else if (message.contains("Happy")){
        return "Happy";
    }

            return "null";

    }
}
