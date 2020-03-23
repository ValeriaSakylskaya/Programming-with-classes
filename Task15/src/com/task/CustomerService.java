package com.task;

import Enums.TypeOfFood;
import Enums.TypeOfTransport;
import Enums.TypeOfVoucher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomerService {
    private ArrayList<TravelVoucher> travelVouchers = new ArrayList<>();
    private ArrayList<String> suitableOffers = new ArrayList<>();
    private TravelVoucher voucher;
    private TravelVoucher voucher1;
    private TravelVoucher voucher2;
    private TravelVoucher voucher3;

    CustomerService() {
        voucher = new TravelVoucher("Prague", TypeOfVoucher.Excursion, TypeOfTransport.Bus, TypeOfFood.Breakfast, 5);
        voucher1 = new TravelVoucher("Paris", TypeOfVoucher.Shopping, TypeOfTransport.Airplane, TypeOfFood.Buffet, 10);
        voucher2 = new TravelVoucher("Cyprus", TypeOfVoucher.Recreation, TypeOfTransport.Airplane, TypeOfFood.Breakfast, 14);
        voucher3 = new TravelVoucher("Riga", TypeOfVoucher.Excursion, TypeOfTransport.Ferry, TypeOfFood.NoFood, 3);
        this.travelVouchers.add(voucher);
        this.travelVouchers.add(voucher1);
        this.travelVouchers.add(voucher2);
        this.travelVouchers.add(voucher3);
    }


    public void selectionByType(TypeOfVoucher typeOfVoucher) {
        for (TravelVoucher t : travelVouchers) {
            if (t.getType().equals(typeOfVoucher))
                suitableOffers.add(t.toString());
        }
    }

    public void selectionByTypeTransport(TypeOfVoucher typeOfVoucher, TypeOfTransport typeOfTransport) {
        for (TravelVoucher t : travelVouchers) {
            if (t.getType().equals(typeOfVoucher) && t.getTypeOfTransport().equals(typeOfTransport))
                suitableOffers.add(t.toString());
        }
    }

    public void selectionByTypeTransportFood(TypeOfVoucher typeOfVoucher, TypeOfTransport typeOfTransport, TypeOfFood typeOfFood) {
        for (TravelVoucher t : travelVouchers) {
            if (t.getType().equals(typeOfVoucher) && t.getTypeOfTransport().equals(typeOfTransport) &&
                    t.getTypeOfFood().equals(typeOfFood))
                suitableOffers.add(t.toString());
        }
    }

    public void selectionByAll(TypeOfVoucher typeOfVoucher, TypeOfTransport typeOfTransport, TypeOfFood typeOfFood, int count) {
        for (TravelVoucher t : travelVouchers) {
            if (t.getType().equals(typeOfVoucher) && t.getTypeOfTransport().equals(typeOfTransport) &&
                    t.getTypeOfFood().equals(typeOfFood) && t.getCountDays() <= count)
                suitableOffers.add(t.toString());
        }
    }

    public void sortByType() {
        Collections.sort(travelVouchers, ((o1, o2) -> o1.getType().compareTo(o2.getType())));
    }

    public void sortByTransport() {
        Collections.sort(travelVouchers, ((o1, o2) -> o1.getTypeOfTransport().compareTo(o2.getTypeOfTransport())));
    }

    public void sortByFood() {
        Collections.sort(travelVouchers, ((o1, o2) -> o1.getTypeOfFood().compareTo(o2.getTypeOfFood())));
    }

    public void sortVoucherName() {
        Collections.sort(travelVouchers, new Comparator<TravelVoucher>() {
            @Override
            public int compare(TravelVoucher firstVoucher, TravelVoucher secondVoucher) {
                String firstVoucherName = firstVoucher.getVoucherName();
                String secondVoucherName = secondVoucher.getVoucherName();
                return firstVoucherName.compareToIgnoreCase(secondVoucherName);
            }
        });
    }

    public void sortByDaysCount() {
        Collections.sort(travelVouchers, new Comparator<TravelVoucher>() {
            @Override
            public int compare(TravelVoucher o1, TravelVoucher o2) {
                if (o1.getCountDays() > o2.getCountDays())
                    return 1;
                if (o1.getCountDays() < o2.getCountDays())
                    return -1;
                return 0;
            }
        });
    }

    public void showTravelVouchers() {
        for (TravelVoucher t : travelVouchers) {
            System.out.println(t.toString());
        }
    }

    public void showOffers() {
        for (String t : suitableOffers) {
            System.out.println(t);
        }
    }
}
