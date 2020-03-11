package com.task;

public class Sentence {
    private String sentence = "";

    Sentence(){
        this.sentence = "";
    }
    public void addWord(Word word)
    {
        this.sentence += (" " + word.getWord());
    }

    public String getSentence() {
        return sentence;
    }
}
