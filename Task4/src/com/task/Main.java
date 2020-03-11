package com.task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
	// write your code here
        /*4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
назначения должны быть упорядочены по времени отправления.*/
        Train train = new Train();
        Scanner scanner = new Scanner(System.in);
        Train[] trains = new Train[5];
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("H.m");
        trains[0] = new Train().newBuilder()
                .setNumberOfTrain("1")
                .setDestination("minsk")
                .setTime(simpleDateFormat.parse("23.45")).build();
        trains[1] = new Train().newBuilder()
                .setNumberOfTrain("3")
                .setDestination("mogilev")
                .setTime(simpleDateFormat.parse("23.10")).build();
        trains[2] = new Train().newBuilder()
                .setNumberOfTrain("5")
                .setDestination("minsk")
                .setTime(simpleDateFormat.parse("10.45")).build();
        trains[3] = new Train().newBuilder()
                .setNumberOfTrain("66")
                .setDestination("riga")
                .setTime(simpleDateFormat.parse("12.31")).build();
        trains[4] = new Train().newBuilder()
                .setNumberOfTrain("2")
                .setDestination("tallin")
                .setTime(simpleDateFormat.parse("9.22")).build();
        System.out.println("enter the number of train");
        String numberOfTrain = scanner.nextLine();
        train.getInfoByNumber(trains, numberOfTrain);
        train.sortByNumberOfTrain(trains);
        System.out.println("after sort");
        for (Train t : trains) {
            System.out.println(t.toString());
        }
        train.sortByDestination(trains);
        System.out.println("after sort");
        for (Train t : trains) {
            System.out.println(t.toString());
        }
    }
}
