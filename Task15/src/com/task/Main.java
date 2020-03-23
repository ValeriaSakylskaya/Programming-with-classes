package com.task;

import Enums.*;

public class Main {

    public static void main(String[] args) {
        /*. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
        различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
        возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.*/
        String nameVoucher;
        CustomerService customerService = new CustomerService();
        customerService.selectionByType(TypeOfVoucher.Shopping);
        System.out.println("\n");
        customerService.showOffers();
        System.out.println("\n");
        customerService.selectionByTypeTransport(TypeOfVoucher.Cruise, TypeOfTransport.Ferry);
        customerService.showOffers();
        System.out.println("\n");
        customerService.selectionByTypeTransportFood(TypeOfVoucher.Shopping, TypeOfTransport.Ferry, TypeOfFood.NoFood);
        customerService.showOffers();
        int countDays = 6;
        System.out.println("\n");
        customerService.selectionByAll(TypeOfVoucher.Shopping, TypeOfTransport.Ferry, TypeOfFood.NoFood, countDays);
        customerService.showOffers();
    }
}
