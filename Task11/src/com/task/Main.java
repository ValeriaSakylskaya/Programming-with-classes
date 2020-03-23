package com.task;

public class Main {

    public static void main(String[] args) {
	    /*Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
        консоль текст, заголовок текста. */
        Text text = new Text("MyHeader");
        Word word1 = new Word("Little");
        Word word2 = new Word("Red");
        Word word3 = new Word("Riding");
        Word word4 = new Word("Hood");
        Sentence sentence = new Sentence();
        sentence.addWord(word1);
        sentence.addWord(word2);
        sentence.addWord(word3);
        sentence.addWord(word4);
        text.addText(sentence);
        text.showHeader();
        text.showText();
    }
}
