package com.task;

public class Main {

    public static void main(String[] args) {
	    /*5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
        на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
        произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
        позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса*/
        Enumerator enume = new Enumerator();
        System.out.print(enume.getCount());
        enume.Increase();
        enume.Decrease();
        System.out.print(enume.getCount());

    }
}
