package com.task;

import Enums.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        // write your code here
        int task;
        System.out.println(" enter the task");
        Scanner in = new Scanner(System.in);
        task = Integer.parseInt(in.nextLine());
        if (task == 1) {
            Test1 test1 = new  Test1();
            test1.ShowValues();
            test1.SetFirstValue(3);
            test1.SetSecondValue(4);
            test1.GetMaxValue();
            test1.GetSum();

        }
        if (task == 2) {
            Test2 test2 = new Test2();
            test2.setFirstValue(5);
            test2.setSecondValue(3);
            test2.getFirstValue();
            test2.getSecondValue();
        }
        if (task == 3){
            Student stud= new Student();
            Student [] student = new Student[10];
            int [] AcademicPerformance = new int [5];
            String FullName;
            String Group;
            for (int i = 0; i < student.length; i++)
            {
                 System.out.println("Enter the fullname student");
                 FullName = in.nextLine();
                 System.out.println("Enter the group student");
                 Group = in.nextLine();
                 System.out.println("Enter the academic performance student");
                 for( int j = 0 ; j < AcademicPerformance.length; j++) { AcademicPerformance[j] = Integer.parseInt(in.nextLine()); }
                 student[i] = new Student(FullName,Group,AcademicPerformance);
            }
            for ( int i = 0; i < student.length; i++)
            {
               if ( stud.ExcellentStudents(student[i].getAcademicPerformance()))
                {
                System.out.println(student[i].getFullName()+student[i].getGroup() + Arrays.toString( student[i].getAcademicPerformance()));
                }
            }


        }
        if (task == 4){
            Train train = new Train();
            Train[] trains = new Train[5];
            SimpleDateFormat sdf = new SimpleDateFormat("H.m");
            trains[0] = new Train().newBuilder()
                    .setNumberOfTrain("1")
                    .setDestination("minsk")
                    .setTime(sdf.parse("23.45")).build();
            trains[1] = new Train().newBuilder()
                    .setNumberOfTrain("3")
                    .setDestination("mogilev")
                    .setTime(sdf.parse("23.10")).build();
            trains[2] = new Train().newBuilder()
                    .setNumberOfTrain("5")
                    .setDestination("minsk")
                    .setTime(sdf.parse("10.45")).build();
            trains[3] = new Train().newBuilder()
                    .setNumberOfTrain("66")
                    .setDestination("riga")
                    .setTime(sdf.parse("12.31")).build();
            trains[4] = new Train().newBuilder()
                    .setNumberOfTrain("2")
                    .setDestination("tallin")
                    .setTime(sdf.parse("9.22")).build();
            System.out.println("enter the number of train");
            String numberOfTrain = in.nextLine();
            train.getInfoByNumber(trains, numberOfTrain);
            train.sortByNumberOfTrain(trains);
            System.out.println("after sort");
            for (Train t : trains) { System.out.println(t.toString());}
            train.sortByDestination(trains);
            System.out.println("after sort");
            for (Train t : trains) { System.out.println(t.toString());}



        }
        if (task == 5){
            Enumerator enumerator =  new Enumerator();
            enumerator.getCount();
            enumerator.Decrease();
            enumerator.Increase();

        }
        if (task == 6){
            Time time = new Time(2,35,20);
            time.infoTime();

            time.changeTime(5,60,80);
            time.infoTime();
        }
        if (task == 7) {

            Triangle triangle = new Triangle(1,1,2,3,3,1);
            System.out.println("perimeter " + triangle.PerimeterTriangle());
            System.out.println("square " + triangle.SquareTriangle());
            System.out.println("median" + triangle.MedianIntersectionPoint().toString() );
                    }
        if (task == 8){
            Store store = new Store();
            store.getCustomersBySort();
            store.getCustomersByDiapasonCreaditCard(10,999);
        }
        if (task == 9){

            Library library =  new Library();
          System.out.println(library.GetBooksNamesByAuthor("Roulling"));
            System.out.println(library.GetPublishedBooksByPublisher("rocmen"));
            System.out.println(library.GetPublishedBooksAfterYear(1950));
        }
        if (task == 10){
            Airport airport = new Airport();
            System.out.println(airport.GetFlightByDestination("Vilnius"));
            System.out.println(airport.GetFlightByDaysOfWeek(DaysOfWeek.THURSDAY));
            System.out.println(airport.GetFlightByDaysOfWeekAndTime(DaysOfWeek.THURSDAY,"5.00"));
        }

        if (task == 11){
            Text text = new Text("MyHeader");
            Word word1 =  new Word ("Little");
            Word word2 =  new Word ("Red");
            Word word3 =  new Word ("Riding");
            Word word4 =  new Word ("Hood");
            Sentence sentence = new Sentence();
            sentence.addWord(word1);
            sentence.addWord(word2);
            sentence.addWord(word3);
            sentence.addWord(word4);
            text.addText(sentence);
            text.showHeader();
            text.showText();
            }

        if (task == 12) {
            Car car = new Car();
            car.Run();
            car.Stop();
            car.Refuel(25.3);
            car.setCarMake("ford");
            car.ShowCarMake();
        }
        if (task ==13){
            City cityMinsk = new City("Minsk");
            City cityMogilev = new City("Mogilev");
            City cityBobruisk = new City("Bobruisk");
            City cityGomel = new City("Gomel");
            City cityBrest = new City("Brest");
            District districtMinsk = new District("Minsk",20.56,cityMinsk);
            District districtMogilev = new District("Mogilev",20.56,cityMogilev);
            District districtBobruisk = new District("Bobruisk",20.56,cityBobruisk);
            District districtGomel = new District("Gomel",20.56,cityGomel);
            District districtBrest = new District("Brest",20.56,cityBrest);
            Region Minskregion = new Region("Minsk",200.56,districtMinsk);
            Minskregion.addDistrict(districtMinsk);
            Region Mogilevregion = new Region("Mogilev",100.56,districtMogilev);
            Mogilevregion.addDistrict(districtMogilev);
            Mogilevregion.addDistrict(districtBobruisk);
            Region Gomelregion = new Region("Gomel",100.56,districtGomel);
            Gomelregion.addDistrict(districtGomel);
            Region Brestregion = new Region("Brest",100.56,districtBrest);
            Brestregion.addDistrict(districtBrest);
            Country Belarus = new Country("Belarus", 560.25,Minskregion);
            Belarus.addRegion(Minskregion);
            Belarus.addRegion(Mogilevregion);
            Belarus.addRegion(Gomelregion);
            Belarus.addRegion(Brestregion);
            Belarus.displayCapital();
            Belarus.displayCountRegion();
            Belarus.displaySquare();
            Belarus.displayRegionCenter();
        }
        if (task == 14){
            Account account1 = new Account("1234",-20, AccountStatus.Unlocked);
            Account account2 = new Account("1034",20, AccountStatus.Unlocked);
            Account account3 = new Account("2568",80, AccountStatus.Unlocked);
            Client client = new Client("Bob");
            client.addAccount(account1);
            client.addAccount(account2);
            client.addAccount(account3);
            System.out.println(client.getAccounts().toString());
            client.SortAccount();
            System.out.println(client.getAccounts().toString());
            client.searchAccount("1034");
            System.out.println("sum: " + client.sumAllBalance());
            System.out.println("sum positive balance: " + client.sumPositiveBalance());
            System.out.println("sum negative: " + client.sumNegativeBalance());
        }
        if (task ==15) {
        OfferToCustomer offerToCustomer = new OfferToCustomer();
        int choice;
        System.out.println("Do you want to select a travel  voucher or sort: 1 - select; 2 - sort");
        choice = Integer.parseInt(in.nextLine());
        if (choice == 1){
            String nameVoucher;
            TypeOfVoucher typeOfVoucher = TypeOfVoucher.Cruise ;
            TypeOfTransport typeOfTransport = TypeOfTransport.Airplane;
            TypeOfFood typeOfFood = TypeOfFood.Breakfast;
            int countDays;
            int choiceSelect;
            System.out.println(" select the type voucher :\n 1 Recreation,\n" +
                    " 2   Cruise,\n" +
                    " 3   Treatment,\n" +
                    " 4   Excursion,\n" +
                    "  5  Shopping");
            choiceSelect = Integer.parseInt(in.nextLine());
            switch (choiceSelect) {
                case (1) :
                    typeOfVoucher = TypeOfVoucher.Recreation;
                    break;
                case (2) :
                    typeOfVoucher = TypeOfVoucher.Cruise;
                    break;
                case (3) :
                    typeOfVoucher = TypeOfVoucher.Treatment;
                    break;
                case (4) :
                    typeOfVoucher = TypeOfVoucher.Excursion;
                    break;
                case (5) :
                    typeOfVoucher = TypeOfVoucher.Shopping;
                    break;
                default :
                    break;
            }
            offerToCustomer.selectionByType(typeOfVoucher);
            System.out.println("\n");
            offerToCustomer.outputOffer();
            System.out.println(" select the type voucher :\n 1 Bus,\n" +
                    " 2   Ferry,\n" +
                    " 3   Train,\n" +
                    " 4   Airplane,\n");
            choiceSelect = Integer.parseInt(in.nextLine());
            switch (choiceSelect) {
                case (1) :
                    typeOfTransport = TypeOfTransport.Bus;
                    break;
                case (2) :
                    typeOfTransport = TypeOfTransport.Ferry;
                    break;
                case (3) :
                    typeOfTransport = TypeOfTransport.Train;
                    break;
                case (4) :
                    typeOfTransport = TypeOfTransport.Airplane;
                    break;
                default :
                    break;
            }
            System.out.println("\n");
            offerToCustomer.selectionByTypeTransport(typeOfVoucher, typeOfTransport);
            offerToCustomer.outputOffer();
            System.out.println(" select the type nutrition :\n 1 Buffet,\n" +
                    " 2   Breakfast,\n" +
                    " 3   NoFood,\n" );
            choiceSelect = Integer.parseInt(in.nextLine());
            switch (choiceSelect) {
                case (1) :
                    typeOfFood = TypeOfFood.Buffet;
                    break;
                case (2) :
                    typeOfFood = TypeOfFood.Breakfast;
                    break;
                case (3) :
                    typeOfFood = TypeOfFood.NoFood;
                    break;
                default :
                    break;
            }
            System.out.println("\n");
            offerToCustomer.selectionByTypeTransportFood(typeOfVoucher, typeOfTransport, typeOfFood);
            offerToCustomer.outputOffer();
            System.out.println("enter the max count days");
            countDays = Integer.parseInt(in.nextLine());
            System.out.println("\n");
            offerToCustomer.selectionByAll(typeOfVoucher, typeOfTransport, typeOfFood, countDays);
            offerToCustomer.outputOffer();
        }
        if (choice == 2){
            System.out.println("before sorting");
            offerToCustomer.Output();
            System.out.println("Sorting is possible: 1 - by type,2 - by transport, 3 - by name, 4 - by nutrition, 5 - by number of days. Make your choice");
            int choiceSort = Integer.parseInt(in.nextLine());
            if (choiceSort == 1) {
                offerToCustomer.sortByType();
                offerToCustomer.Output();
            }
            if (choiceSort == 2) {
                offerToCustomer.sortByTransport();
                offerToCustomer.Output();
            }
            if (choiceSort == 3) {
               offerToCustomer.sortOfNameVoucher();
                offerToCustomer.Output();
            }
            if (choiceSort == 4) {
                offerToCustomer.sortByFood();
                offerToCustomer.Output();
            }
            if (choiceSort == 5) {
                offerToCustomer.sortOfCountDays();
                offerToCustomer.Output();
            }
        }
        }

        in.close();
     }


}