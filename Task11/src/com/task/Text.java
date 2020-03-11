package com.task;

public class Text {
    private String header = "";
    private String text = "";

    public Text(Word word) {
        header = word.getWord();
    }

    public Text(String header) {
        this.header = header;
    }

    public Text(Sentence sentence) {
        header = sentence.getSentence();
    }

    public void addText(Word word) {
        text = text.concat(word.getWord());
    }

    public void addText(Sentence sentence) {
        text = text.concat(sentence.getSentence());
    }

    public void showText()  {
        System.out.println(text);
    }

    public void showHeader() {
        System.out.println(header);
    }
}
